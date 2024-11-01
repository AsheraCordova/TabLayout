package com.ashera.tablayout;

import com.ashera.widget.WidgetFactory;

public class TabLayoutPlugin  {
    public static void initPlugin() {
    	//start - widgets
        WidgetFactory.register(new com.ashera.tablayout.TabLayoutImpl());
        WidgetFactory.register(new com.ashera.tablayout.CTabFolderImpl());
        WidgetFactory.register(new com.ashera.tablayout.TabFolderImpl());
        WidgetFactory.register(new com.ashera.tablayout.TabViewImpl());
        WidgetFactory.register(new com.ashera.tablayout.SlidingTabIndicatorImpl());
        WidgetFactory.register(new com.ashera.tablayout.TabItemImpl());
        //end - widgets
    }
}
