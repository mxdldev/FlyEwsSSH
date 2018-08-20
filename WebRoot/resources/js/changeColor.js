	function changeSrcolColor(css) {
	if (css == 'ext-all.css') {
		document.body.style.scrollbarBaseColor = "#bdd3ef";
	} else if (css == 'xtheme-gray.css') {
		document.body.style.scrollbarBaseColor = "#dcdcdc";
	} else if (css == 'xtheme-slate.css') {
		document.body.style.scrollbarBaseColor = "#647890";
	} else if (css == 'xtheme-black.css') {
		document.body.style.scrollbarBaseColor = "#2d2d2d";
	} else if (css == 'xtheme-olive.css') {
		document.body.style.scrollbarBaseColor = "#add684";
	} else if (css == 'xtheme-purple.css') {
		document.body.style.scrollbarBaseColor = "#bca7ff";
	}
}

		function changeskin(o,i)
		{
			Ext.util.CSS.swapStyleSheet('test', '../resources/css/'+i.file);
		 	changeSrcolColor(i.file);
		}