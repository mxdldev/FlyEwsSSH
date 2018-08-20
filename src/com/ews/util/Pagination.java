package com.ews.util;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Pagination {
	protected Log log = LogFactory.getLog(this.getClass());

	// ÿҳ��¼�� Ĭ��Ϊ 20
	private int pageSize = 20;

	// ��ǰҳ��
	private int pageNum = 1;

	// ��¼��������Ҫ�����ݿ��в�ѯ����
	private int recordCount;

	// ҳ�������� recordCount �� pageSize �������
	private int pageCount;

	// ��ҳ�ĵ�һ����¼������ pageSize �� pageNum �������
	private int firstResult;

	// ҳ�� URL
	private String pageUrl;

	public Pagination(HttpServletRequest request, HttpServletResponse response) {

		try {
			// �� request ��ȡ��ǰҳ��
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		} catch (Exception e) {
		}

		for (Cookie cookie : request.getCookies()) {
			// �� cookie ��ȡ�Զ����ÿҳ��¼��
			if ("pageSize".equals(cookie.getName())) {
				try {
					pageSize = Integer.parseInt(cookie.getValue());
				} catch (Exception e) {
				}
			}
		}

		try {
			// �Զ����ÿҳ��¼��
			pageSize = Integer.parseInt(request.getParameter("pageSize"));

			// ��¼�Զ����ÿҳ��¼���� Cookie ��
			Cookie cookie = new Cookie("pageSize", Integer.toString(pageSize));
			cookie.setMaxAge(Integer.MAX_VALUE);

			response.addCookie(cookie);

		} catch (Exception e) {
		}

		StringBuffer queryString = new StringBuffer();

		// ��ȡ���е� QueryString ����
		for (Object parameterName : request.getParameterMap().keySet()) {
			String name = (String) parameterName;

			if ("pageNum".equals(name) || "pageSize".equals(name)) {
				continue;
			}

			for (String value : request.getParameterValues(name)) {
				if (queryString.length() > 0) {
					queryString.append("&");
				}

				try {
					queryString.append(name + "="
							+ URLEncoder.encode(value, "UTF-8"));
				} catch (Exception e) {
					queryString.append(name + "=" + value);
				}
			}
		}

		pageUrl = request.getRequestURI() + "?" + queryString.toString();
	}

	private void calculate() {
		pageCount = (recordCount + pageSize - 1) / pageSize;
		firstResult = (pageNum - 1) * pageSize;
	}

	/**
	 * ���ɷ�ҳ��Ϣ ������һҳ����һҳ����һҳ�����һҳ�ȵȡ�
	 * 
	 * @param pageNum
	 *            ��ǰҳ��
	 * @param pageCount
	 *            ��ҳ��
	 * @param recordCount
	 *            �ܼ�¼��
	 * @param pageUrl
	 *            ҳ�� URL
	 * @return
	 */
	public String toString() {

		calculate();

		String url = pageUrl.contains("?") ? pageUrl : pageUrl + "?";

		StringBuffer buffer = new StringBuffer();

		/**
		 * <a href="thread-htm-fid-82-page-1.html"
		 * style="font-weight:bold">&laquo;</a><b> 1 </b><a
		 * href="thread-htm-fid-82-page-2.html">2</a><a
		 * href="thread-htm-fid-82-page-3.html">3</a><a
		 * href="thread-htm-fid-82-page-4.html">4</a><a
		 * href="thread-htm-fid-82-page-5.html">5</a> <input type="text"
		 * size="3" onkeydown="javascript: if(event.keyCode==13){
		 * location='thread.php?fid=82&page='+this.value+'';return false;}"> <a
		 * href="thread-htm-fid-82-page-42.html"
		 * style="font-weight:bold">&raquo;</a> Pages: ( 1/42 total )
		 */

		buffer.append("ÿҳ");

		buffer
				.append("<select name=ibm_crl_scm_page_size_select onchange='setPageSize(value); ' >");
		buffer.append(" <option value=5"
				+ (pageSize == 5 ? " selected " : "") + ">5</option>");
		buffer.append(" <option value=10"
				+ (pageSize == 10 ? " selected " : "") + ">10</option>");
		buffer.append(" <option value=20"
				+ (pageSize == 20 ? " selected " : "") + ">20</option>");
		buffer.append(" <option value=40"
				+ (pageSize == 40 ? " selected " : "") + ">40</option>");
		buffer.append(" <option value=60"
				+ (pageSize == 60 ? " selected " : "") + ">60</option>");
		buffer.append(" <option value=80"
				+ (pageSize == 80 ? " selected " : "") + ">80</option>");
		buffer.append(" <option value=100"
				+ (pageSize == 100 ? " selected " : "") + ">100</option>");
		buffer.append("</select>��");

		buffer.append(" ��" + pageNum + "/" + pageCount + "ҳ  ");

		buffer.append(" ��" + recordCount + "�� ");

		buffer.append(pageCount == 0 || pageNum == 1 ? " ��ҳ " : " <a href='"
				+ url + "&pageNum=1'>��ҳ</a> ");

		buffer.append("    ");

		buffer.append(pageCount == 0 || pageNum == 1 ? " ��һҳ " : " <a href='"
				+ url + "&pageNum=" + (pageNum - 1) + "'>��һҳ</a> ");

		buffer.append("    ");

		buffer.append(pageCount == 0 || pageNum == pageCount ? " ��һҳ "
				: " <a href='" + url + "&pageNum=" + (pageNum + 1)
						+ "'>��һҳ</a> ");

		buffer.append("    ");

		buffer.append(pageCount == 0 || pageNum == pageCount ? " ĩҳ "
				: " <a href='" + url + "&pageNum=" + pageCount + "'>ĩҳ</a> ");

		buffer.append("   ��<input type='text' name='ibm_crl_scm_goto_input' "
				+ " style='width:20px; font-size:12px; text-align:center; '>ҳ");

		buffer.append("<input type='button' "
				+ " name='ibm_crl_scm_goto_button' value='Go' class='button'>");

		buffer.append("<script language='javascript'>");
		buffer.append("function helloweenvsfei_enter(){");
		buffer.append(" if(event.keyCode == 13){");
		buffer.append("     helloweenvsfei_goto();");
		buffer.append("     return false;");
		buffer.append(" }");
		buffer.append(" return true;");
		buffer.append("} ");
		buffer.append("function setPageSize(pageSize){");
		buffer.append(" location='" + url + "&pageSize=' + pageSize;");
		buffer.append("} ");
		buffer.append("function helloweenvsfei_goto(){");
		buffer
				.append(" var numText = document.getElementsByName('ibm_crl_scm_goto_input')[0].value;");
		buffer.append(" var num = parseInt(numText, 10);");
		buffer.append(" if(!num){");
		buffer.append("     alert('ҳ������Ϊ����');   ");
		buffer.append("     return;");
		buffer.append(" }");
		buffer.append(" if(num<1 || num>" + pageCount + "){");
		buffer.append("     alert('ҳ������� 1 �� " + pageCount + " ֮��. ');    ");
		buffer.append("     return;");
		buffer.append(" }");
		buffer.append(" location='" + url + "&pageNum=' + num;");
		buffer.append("}");
		buffer
				.append("document.getElementsByName('ibm_crl_scm_goto_input')[0].onkeypress = helloweenvsfei_enter;");
		buffer
				.append("document.getElementsByName('ibm_crl_scm_goto_button')[0].onclick = helloweenvsfei_goto;");
		buffer.append("</script>");

		return buffer.toString();

	}

	public int getPageSize() {
		calculate();
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		calculate();
	}

	public int getRecordCount() {
		calculate();
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
		calculate();
	}

	public int getFirstResult() {
		calculate();
		return firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
		calculate();
	}

	public String getPageUrl() {
		return pageUrl + "&pageNum=" + pageNum;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

}