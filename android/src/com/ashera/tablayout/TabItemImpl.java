package com.ashera.tablayout;


//start - imports
import java.util.*;

import android.content.*;
import android.graphics.*;
import android.os.Build;
import android.view.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;
import android.annotation.SuppressLint;

import com.ashera.widget.bus.*;
import com.ashera.widget.*;


import static com.ashera.widget.IWidget.*;
//end - imports
@SuppressLint("NewApi")
public class TabItemImpl extends BaseWidget {
	//start - body
	private View viewStub;
	public final static String LOCAL_NAME = "com.google.android.material.tabs.TabItem"; 
	public final static String GROUP_NAME = "com.google.android.material.tabs.TabItem";
	
	
	@Override
	public void loadAttributes(String attributeName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("icon").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("id").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("customTabTitleId").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("customTabiconId").withType("string"));

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
		
        viewStub = new ViewStub((Context) fragment.getRootActivity());
		nativeCreate(fragment, params);	
	}
	

    

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
	
	

    @Override
    public Object asNativeWidget() {
        return viewStub;
        
    }
    private void nativeCreate(IFragment fragment, Map<String, Object> params) {
    }
    
    @Override
	public Class getViewClass() {
		return View.class;
	}
	//end - body
    //start - codecopy
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
	//end - codecopy
}
