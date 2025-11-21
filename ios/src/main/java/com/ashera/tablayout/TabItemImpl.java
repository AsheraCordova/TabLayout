//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
package com.ashera.tablayout;


//start - imports
import java.util.*;

import r.android.content.*;
import r.android.graphics.*;
import r.android.os.Build;
import r.android.view.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;
import r.android.annotation.SuppressLint;

import com.ashera.widget.bus.*;
import com.ashera.widget.*;

/*-[
#include <UIKit/UIKit.h>
#include "ASUIView.h"
]-*/
import com.google.j2objc.annotations.Property;

import static com.ashera.widget.IWidget.*;
//end - imports
import com.ashera.layout.ViewImpl;
@SuppressLint("NewApi")
public class TabItemImpl extends BaseWidget {
	//start - body
	private View viewStub;
	protected @Property Object uiView;
	public final static String LOCAL_NAME = "com.google.android.material.tabs.TabItem"; 
	public final static String GROUP_NAME = "com.google.android.material.tabs.TabItem";
	
	
	@Override
	public void loadAttributes(String attributeName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("icon").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout").withType("template").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("id").withType("id").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("customTabTitleId").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("customTabiconId").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));

	}
	
	public TabItemImpl() {
		super(LOCAL_NAME, LOCAL_NAME);
	}	

	@Override
	public IWidget newInstance() {
		return new TabItemImpl();
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		
        viewStub = new ViewExt();
        createView();
        ViewImpl.nativeMakeFrame(uiView, 0, 0, 0, 0);
		nativeCreate(fragment, params);	
	}
	
	public class ViewExt extends View implements com.ashera.model.IViewStub{
		@Override
		public void remeasure() {
			if (getFragment() != null) {
				getFragment().remeasure();
			}
		}
        private Map<String, IWidget> templates;
    	@Override
    	public r.android.view.View inflateView(java.lang.String layout) {
    		if (templates == null) {
    			templates = new java.util.HashMap<String, IWidget>();
    		}
    		IWidget template = templates.get(layout);
    		if (template == null) {
    			template = (IWidget) quickConvert(layout, "template");
    			templates.put(layout, template);
    		}
    		IWidget widget = template.loadLazyWidgets(TabItemImpl.this.getParent());
    		return (View) widget.asWidget();
    	}
	}

    public native void createView()/*-[
		ASUIView* uiView = [ASUIView new];
		uiView.backgroundColor = [UIColor clearColor];
		uiView_ = uiView;
	]-*/;
    

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {		
		Object nativeWidget = asNativeWidget();

		switch (key.getAttributeName()) {
			case "icon": {
				


		this.setIcon(objValue);



			}
			break;
			case "layout": {
				


		this.setLayout(objValue);



			}
			break;
			case "text": {
				


		this.setText(objValue);



			}
			break;
			case "id": {
				


		this.setTabItemid(objValue);



			}
			break;
			case "customTabTitleId": {
				


		this.setCustomTabTitleId(objValue);



			}
			break;
			case "customTabiconId": {
				


		this.setCustomTabiconId(objValue);



			}
			break;
		default:
			break;
		}
	}
	@Override
	public Object asWidget() {
		return viewStub;
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "icon": {
return this.getIcon();				}
			case "layout": {
return this.getLayout();				}
			case "text": {
return this.getText();				}
			case "id": {
return this.getTabItemid();				}
			case "customTabTitleId": {
return this.getCustomTabTitleId();				}
			case "customTabiconId": {
return this.getCustomTabiconId();				}
		}
		
		return null;
	}
	
	

    private Object text;
    private Object layout;
	private Object icon;
	private Object tabItemid;
	private Object customTabTitleId;
	private Object customTabiconId;

	public Object getCustomTabTitleId() {
		return customTabTitleId;
	}

	public void setCustomTabTitleId(Object customTabTitleId) {
		this.customTabTitleId = customTabTitleId;
	}

	public Object getCustomTabiconId() {
		return customTabiconId;
	}

	public void setCustomTabiconId(Object customTabiconId) {
		this.customTabiconId = customTabiconId;
	}

	public Object getTabItemid() {
		return tabItemid;
	}

	public void setTabItemid(Object tabItemid) {
		this.tabItemid = tabItemid;
	}

	public Object getText() {
		return text;
	}

	public void setText(Object text) {
		this.text = text;
	}

	public Object getLayout() {
		return layout;
	}

	public void setLayout(Object layout) {
		this.layout = layout;
	}

	public Object getIcon() {
		return icon;
	}

	public void setIcon(Object icon) {
		this.icon = icon;
	}
	


    @Override
    public Object asNativeWidget() {
        return uiView;
        
    }
    private void nativeCreate(IFragment fragment, Map<String, Object> params) {
    }
    
    @Override
	public Class getViewClass() {
		return View.class;
	}
	//end - body
}
