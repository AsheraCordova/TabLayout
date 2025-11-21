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
// start - imports
import java.util.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.*;
import android.widget.*;
import android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import android.graphics.Canvas;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.Tab;
import com.google.android.material.badge.BadgeDrawable;
import android.content.res.ColorStateList;
public class TabLayoutImpl extends BaseHasWidgets {
	//start - body
	public final static String LOCAL_NAME = "com.google.android.material.tabs.TabLayout"; 
	public final static String GROUP_NAME = "com.google.android.material.tabs.TabLayout";
	private com.google.android.material.tabs.TabLayout tabLayout;
	

	
		@SuppressLint("NewApi")
		final static class TabGravity extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("fill",  0x0);
				mapping.put("center",  0x1);
				mapping.put("start",  0x2);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class TabIndicatorAnimationMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("elastic",  TabLayout.INDICATOR_ANIMATION_MODE_LINEAR);
				mapping.put("linear",  TabLayout.INDICATOR_ANIMATION_MODE_ELASTIC);
				mapping.put("fade",  TabLayout.INDICATOR_ANIMATION_MODE_FADE);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class TabIndicatorGravity extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("bottom",  0x0);
				mapping.put("center",  0x1);
				mapping.put("top",  0x2);
				mapping.put("stretch",  0x3);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class TabMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("fixed",  TabLayout.MODE_FIXED);
				mapping.put("scrollable",  TabLayout.MODE_SCROLLABLE);
				mapping.put("auto",  TabLayout.MODE_AUTO);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeNumbers").withType("array").withArrayType("int").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeBackgroundColors").withType("array").withArrayType("color").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeTextColors").withType("array").withArrayType("color").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeAlphas").withType("array").withArrayType("int").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeMaxCharacterCounts").withType("array").withArrayType("int").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeGravities").withType("array").withArrayType("gravity").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeHorizontalOffsets").withType("array").withArrayType("dimension").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeVerticalOffsets").withType("array").withArrayType("dimension").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeIsVisibles").withType("array").withArrayType("boolean").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeTextAppearanceResources").withType("array").withArrayType("style").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabBackground").withType("drawable").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabContentStart").withType("dimension").withOrder(-1));
		ConverterFactory.register("com.google.android.material.tabs.TabLayout.tabGravity", new TabGravity());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabGravity").withType("com.google.android.material.tabs.TabLayout.tabGravity"));
		ConverterFactory.register("com.google.android.material.tabs.TabLayout.tabIndicatorAnimationMode", new TabIndicatorAnimationMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorAnimationMode").withType("com.google.android.material.tabs.TabLayout.tabIndicatorAnimationMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorFullWidth").withType("boolean"));
		ConverterFactory.register("com.google.android.material.tabs.TabLayout.tabIndicatorGravity", new TabIndicatorGravity());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorGravity").withType("com.google.android.material.tabs.TabLayout.tabIndicatorGravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabInlineLabel").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabMaxWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabMinWidth").withType("dimension"));
		ConverterFactory.register("com.google.android.material.tabs.TabLayout.tabMode", new TabMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabMode").withType("com.google.android.material.tabs.TabLayout.tabMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPadding").withType("dimension").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPaddingBottom").withType("dimension").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPaddingEnd").withType("dimension").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPaddingStart").withType("dimension").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPaddingTop").withType("dimension").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabRippleColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabSelectedTextColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabTextAppearance").withType("style").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabTextColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("removeTab").withType("id").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("removeTabAt").withType("int").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("removeAllTabs").withType("nil").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTabSelected").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTabUnselected").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTabReselected").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("addTab").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIconTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectTab").withType("int").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("menuItemIds").withType("array").withArrayType("id").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("updateTabTexts").withType("array").withArrayType("resourcestring").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("setupWithViewPager").withType("id"));
	
	}
	
	public TabLayoutImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  TabLayoutImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  TabLayoutImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new TabLayoutImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		tabLayout = new TabLayoutExt(context);
	} else {
		int defStyleAttr = 0;
		int defStyleRes = 0;
		
		if (systemStyle != null) {
			defStyleRes = context.getResources().getIdentifier((String) systemStyle, "style", context.getPackageName());	
		}
		
		if (systemAndroidAttrStyle != null) {
			defStyleAttr = context.getResources().getIdentifier((String) systemAndroidAttrStyle, "attr", "android");	
		}
		
		if (defStyleRes == 0) {
			tabLayout = new TabLayoutExt(context, null, defStyleAttr);	
		} else {
		}
		
	}

		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return tabLayout;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		tabLayout.removeView((View) w.asWidget());
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= tabLayout.getChildCount()) {
            tabLayout.removeViewAt(index);
        }    
        return remove;
    }

	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		com.google.android.material.tabs.TabLayout.LayoutParams layoutParams = (com.google.android.material.tabs.TabLayout.LayoutParams) view.getLayoutParams();
		
		layoutParams = (com.google.android.material.tabs.TabLayout.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new com.google.android.material.tabs.TabLayout.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private com.google.android.material.tabs.TabLayout.LayoutParams getLayoutParams(View view) {
		return (com.google.android.material.tabs.TabLayout.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		com.google.android.material.tabs.TabLayout.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
		default:
			break;
		}
		
		
		view.setLayoutParams(layoutParams);		
	}
	
	@SuppressLint("NewApi")
	@Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		Object attributeValue = ViewGroupImpl.getChildAttribute(w, key);		
		if (attributeValue != null) {
			return attributeValue;
		}
		View view = (View) w.asWidget();
		com.google.android.material.tabs.TabLayout.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
		}
		
		return null;

	}
	
		
	public class TabLayoutExt extends com.google.android.material.tabs.TabLayout implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return TabLayoutImpl.this;
		}
		private int mMaxWidth = -1;
		private int mMaxHeight = -1;
		@Override
		public void setMaxWidth(int width) {
			mMaxWidth = width;
		}
		@Override
		public void setMaxHeight(int height) {
			mMaxHeight = height;
		}
		@Override
		public int getMaxWidth() {
			return mMaxWidth;
		}
		@Override
		public int getMaxHeight() {
			return mMaxHeight;
		}

		public TabLayoutExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

		public TabLayoutExt(Context context) {
			super(context);
			
		}
		
		@Override
		public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

			if(mMaxWidth > 0) {
	        	widthMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxWidth, MeasureSpec.AT_MOST);
	        }
	        if(mMaxHeight > 0) {
	            heightMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxHeight, MeasureSpec.AT_MOST);

	        }

	        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
			    measureFinished.setWidth(getMeasuredWidth());
			    measureFinished.setHeight(getMeasuredHeight());
				listener.eventOccurred(EventId.measureFinished, measureFinished);
			}
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			
			replayBufferedEvents();
			
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
				onLayoutEvent.setB(b);
				onLayoutEvent.setL(l);
				onLayoutEvent.setR(r);
				onLayoutEvent.setT(t);
				onLayoutEvent.setChanged(changed);
				listener.eventOccurred(EventId.onLayout, onLayoutEvent);
			}
			
			if (isInvalidateOnFrameChange() && isInitialised()) {
				TabLayoutImpl.this.invalidate();
			}
		}	
		
		@Override
		public void onDraw(Canvas canvas) {
			Runnable runnable = () -> super.onDraw(canvas);
			executeMethodListeners("onDraw", runnable, canvas);
		}

		@Override
		public void draw(Canvas canvas) {
			Runnable runnable = () -> super.draw(canvas);
			executeMethodListeners("draw", runnable, canvas);
		}

		@SuppressLint("WrongCall")
		@Override
		public void execute(String method, Object... args) {
			switch (method) {
				case "onDraw":
					setOnMethodCalled(true);
					super.onDraw((Canvas) args[0]);
					break;

				case "draw":
					setOnMethodCalled(true);
					super.draw((Canvas) args[0]);
					break;

				default:
					break;
			}
		}

		public void updateMeasuredDimension(int width, int height) {
			setMeasuredDimension(width, height);
		}


		@Override
		public ILifeCycleDecorator newInstance(IWidget widget) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setAttribute(WidgetAttribute widgetAttribute,
				String strValue, Object objValue) {
			throw new UnsupportedOperationException();
		}		
		

		@Override
		public List<String> getMethods() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void initialized() {
			throw new UnsupportedOperationException();
		}
		
        @Override
        public Object getAttribute(WidgetAttribute widgetAttribute) {
            throw new UnsupportedOperationException();
        }
        @Override
        public void drawableStateChanged() {
        	super.drawableStateChanged();
        	if (!isWidgetDisposed()) {
        		ViewImpl.drawableStateChanged(TabLayoutImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(TabLayoutImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(TabLayoutImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(TabLayoutImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(TabLayoutImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(TabLayoutImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(TabLayoutImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(TabLayoutImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(TabLayoutImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(TabLayoutImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(TabLayoutImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(TabLayoutImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(TabLayoutImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(TabLayoutImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(TabLayoutImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(TabLayoutImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(TabLayoutImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(TabLayoutImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(TabLayoutImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(TabLayoutImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(TabLayoutImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(TabLayoutImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(TabLayoutImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(TabLayoutImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(TabLayoutImpl.this);
        }
     
	
	}
	@Override
	public Class getViewClass() {
		return TabLayoutExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "badgeNumbers": {


		setBadgeNumbers(objValue);



			}
			break;
			case "badgeBackgroundColors": {


		setBadgeBackgroundColors(objValue);



			}
			break;
			case "badgeTextColors": {


		setBadgeTextColors(objValue);



			}
			break;
			case "badgeAlphas": {


		setBadgeAlphas(objValue);



			}
			break;
			case "badgeMaxCharacterCounts": {


		setBadgeMaxCharacterCounts(objValue);



			}
			break;
			case "badgeGravities": {


		setBadgeGravities(objValue);



			}
			break;
			case "badgeHorizontalOffsets": {


		setBadgeHorizontalOffsets(objValue);



			}
			break;
			case "badgeVerticalOffsets": {


		setBadgeVerticalOffsets(objValue);



			}
			break;
			case "badgeIsVisibles": {


		setBadgeIsVisibles(objValue);



			}
			break;
			case "badgeTextAppearanceResources": {


		setTextAppearanceResources(objValue);



			}
			break;
			case "tabBackground": {


		setBackgroundDrawable(objValue);



			}
			break;
			case "tabContentStart": {


		setContentStart(objValue);



			}
			break;
			case "tabGravity": {


	tabLayout.setTabGravity((int)objValue);



			}
			break;
			case "tabIndicatorAnimationMode": {


	tabLayout.setTabIndicatorAnimationMode((int)objValue);



			}
			break;
			case "tabIndicatorColor": {


	tabLayout.setSelectedTabIndicatorColor((int)objValue);



			}
			break;
			case "tabIndicatorFullWidth": {


	tabLayout.setTabIndicatorFullWidth((boolean)objValue);



			}
			break;
			case "tabIndicatorGravity": {


	tabLayout.setSelectedTabIndicatorGravity((int)objValue);



			}
			break;
			case "tabIndicatorHeight": {


	tabLayout.setSelectedTabIndicatorHeight((int)objValue);



			}
			break;
			case "tabInlineLabel": {


	tabLayout.setInlineLabel((boolean)objValue);



			}
			break;
			case "tabMaxWidth": {


		setMaxWidth(objValue);



			}
			break;
			case "tabMinWidth": {


		setMinWidth(objValue);



			}
			break;
			case "tabMode": {


	tabLayout.setTabMode((int)objValue);



			}
			break;
			case "tabPadding": {


		setPadding(objValue);



			}
			break;
			case "tabPaddingBottom": {


		setPaddingBottom(objValue);



			}
			break;
			case "tabPaddingEnd": {


		setPaddingEnd(objValue);



			}
			break;
			case "tabPaddingStart": {


		setPaddingStart(objValue);



			}
			break;
			case "tabPaddingTop": {


		setPaddingTop(objValue);



			}
			break;
			case "tabRippleColor": {


	tabLayout.setTabRippleColor((ColorStateList)objValue);



			}
			break;
			case "tabSelectedTextColor": {


		setTabSelectedTextColor(objValue);



			}
			break;
			case "tabTextAppearance": {


		setTabTextAppearance(objValue);



			}
			break;
			case "tabTextColor": {


		setTabTextColor(objValue);



			}
			break;
			case "removeTab": {


		removeTabById((int) objValue);



			}
			break;
			case "removeTabAt": {


		removeTabByAt((int) objValue);



			}
			break;
			case "removeAllTabs": {


		tabLayout.removeAllTabs();



			}
			break;
			case "onTabSelected": {


		tabLayout.setOnTabSelectedListener(new OnTabSelectedListener(this, strValue, "onTabSelected"));



			}
			break;
			case "onTabUnselected": {


		tabLayout.setOnTabSelectedListener(new OnTabSelectedListener(this, strValue, "onTabUnselected"));



			}
			break;
			case "onTabReselected": {


		tabLayout.setOnTabSelectedListener(new OnTabSelectedListener(this, strValue, "onTabReselected"));



			}
			break;
			case "addTab": {
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object text = quickConvert(data.get("text"), "resourcestring");
		Object icon = quickConvert(data.get("icon"), "drawable");
		Object id = quickConvert(data.get("id"), "id");
		Object layout = quickConvert(data.get("layout"), "template");
		Object customTabTitleId = quickConvert(data.get("customTabTitleId"), "string");
		Object customTabiconId = quickConvert(data.get("customTabiconId"), "string");
		Object where = quickConvert(data.get("where"), "string");


		 addTab(text, icon, id, layout, customTabTitleId, customTabiconId, where);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object text = quickConvert(data.get("text"), "resourcestring");
		Object icon = quickConvert(data.get("icon"), "drawable");
		Object id = quickConvert(data.get("id"), "id");
		Object layout = quickConvert(data.get("layout"), "template");
		Object customTabTitleId = quickConvert(data.get("customTabTitleId"), "string");
		Object customTabiconId = quickConvert(data.get("customTabiconId"), "string");
		Object where = quickConvert(data.get("where"), "string");


		 addTab(text, icon, id, layout, customTabTitleId, customTabiconId, where);


	}
}
			}
			break;
			case "tabIconTint": {


	tabLayout.setTabIconTint((ColorStateList)objValue);



			}
			break;
			case "selectTab": {


		selectTab(objValue);



			}
			break;
			case "menuItemIds": {


		setBadgeMenuItemIds(objValue);



			}
			break;
			case "updateTabTexts": {


		updateTabTexts(objValue);



			}
			break;
			case "setupWithViewPager": {


		setupWithViewPager(strValue);



			}
			break;
		default:
			break;
		}
		
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object attributeValue = ViewGroupImpl.getAttribute(this, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "tabIndicatorAnimationMode": {
return tabLayout.getTabIndicatorAnimationMode();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return tabLayout;
    }
    private void nativeCreate(Map<String, Object> params) {
    }
    
    @Override
    public void requestLayout() {
    	if (isInitialised()) {
    		ViewImpl.requestLayout(this, asNativeWidget());
    	}
    }
    
    @Override
    public void invalidate() {
    	if (isInitialised()) {
    		ViewImpl.invalidate(this, asNativeWidget());
    	}
    }
    
	

private List<Object> badgeMenuItemIds;
private void setBadgeBackgroundColors(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setBackgroundColor((int) value);
	});
}

public static interface ValueSetter {
	void setValueOnBadgeDrawable(BadgeDrawable badgeDrawable, Object value);
}
private void setValueOnBadgeDrawable(Object objValue, ValueSetter valueSetter) {
	if (badgeMenuItemIds != null) {
		List<Object> badgeAttrs = PluginInvoker.getList(objValue);
		
		for (int i = 0; i < badgeMenuItemIds.size(); i++) {
			int id = (int) badgeMenuItemIds.get(i);
			BadgeDrawable badge = findTabById(id).getOrCreateBadge();
			Object value = badgeAttrs.get(i);
			valueSetter.setValueOnBadgeDrawable(badge, value);
		}
	}
}

private void setBadgeMenuItemIds(Object objValue) {
	badgeMenuItemIds = PluginInvoker.getList(objValue);
}

private void setBadgeNumbers(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setNumber((int) value);
	});
}

private void setBadgeVerticalOffsets(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setVerticalOffset((int) value);
	});	
}

private void setBadgeHorizontalOffsets(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setHorizontalOffset((int) value);
	});	
}

private void setBadgeGravities(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setBadgeGravity((int) value);
	});	
}

private void setBadgeMaxCharacterCounts(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setMaxCharacterCount((int) value);
	});	
}

private void setBadgeAlphas(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setAlpha((int) value);
	});	
}

private void setBadgeTextColors(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setBadgeTextColor((int) value);
	});
}

private void setBadgeIsVisibles(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setVisible((boolean) value);
	});
}



@SuppressLint("RestrictedApi")
private void setTextAppearanceResources(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setTextAppearance((int) value);
	});
}


	@SuppressLint("NewApi")
private static class OnTabSelectedListener implements TabLayout.OnTabSelectedListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnTabSelectedListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnTabSelectedListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onTabSelected(Tab tab){
    
	if (action == null || action.equals("onTabSelected")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onTabSelected");
	    java.util.Map<String, Object> obj = getOnTabSelectedEventObj(tab);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, tab);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnTabSelectedEventObj(Tab tab) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "tabselected");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        TabLayoutImpl.addEventInfo(obj, tab, w.getFragment());
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onTabSelected", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}public void onTabUnselected(Tab tab){
    
	if (action == null || action.equals("onTabUnselected")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onTabUnselected");
	    java.util.Map<String, Object> obj = getOnTabUnselectedEventObj(tab);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, tab);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnTabUnselectedEventObj(Tab tab) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "tabunselected");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        TabLayoutImpl.addEventInfo(obj, tab, w.getFragment());
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onTabUnselected", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}public void onTabReselected(Tab tab){
    
	if (action == null || action.equals("onTabReselected")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onTabReselected");
	    java.util.Map<String, Object> obj = getOnTabReselectedEventObj(tab);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, tab);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnTabReselectedEventObj(Tab tab) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "tabreselected");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        TabLayoutImpl.addEventInfo(obj, tab, w.getFragment());
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onTabReselected", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			tabLayout.setId((int) quickConvert(id, "id"));
		}
	}
	
    

		//end - body

//start - codecopy

private void updateTabTexts(Object objValue) {
	if (badgeMenuItemIds != null) {
		List<Object> badgeAttrs = PluginInvoker.getList(objValue);
		
		for (int i = 0; i < badgeMenuItemIds.size(); i++) {
			int id = (int) badgeMenuItemIds.get(i);
			Tab tab = findTabById(id);
			Object value = badgeAttrs.get(i);
			tab.setText((String) value);
		}
	}
}


private void addTab(Object tabItemText, Object tabItemIcon, Object tabItemId, Object tabItemLayout, Object tabItemCustomTabTitleId,
		Object tabItemCustomTabIconId, Object where) {
	IWidget layout = (IWidget) tabItemLayout;
	
	if (tabItemId != null && findTabById((int) tabItemId) != null) {
		return;
	}

	Tab tab = tabLayout.newTab();
	if (layout != null) {
		IWidget customView = loadLazyWidgets(tab, layout);
		tab.setCustomView((View) customView.asWidget());
		
		
		String customTabTitleId = PluginInvoker.getString(tabItemCustomTabTitleId);
		
		String customTabiconId = PluginInvoker.getString(tabItemCustomTabIconId);
		String text = PluginInvoker.getString(tabItemText);
		android.graphics.drawable.Drawable icon = (android.graphics.drawable.Drawable) tabItemIcon;
		
		if (customTabTitleId != null && text != null) {
			customView.findWidgetById(customTabTitleId).setAttribute("text", text, true);
		}
		
		if (customTabiconId != null && icon != null) {
			customView.findWidgetById(customTabiconId).setAttribute("src", icon, true);
		}
	} else {
		String text = PluginInvoker.getString(tabItemText);
		if (text != null) {
			tab.setText(text);
		}

		android.graphics.drawable.Drawable icon = (android.graphics.drawable.Drawable) tabItemIcon;
		if (icon!= null) {
			tab.setIcon(icon);
		}
	}
	
	Integer id = PluginInvoker.getInt(tabItemId);
	if (id!= null) {
		tab.setId(id);
	}
	
	String whereStr = PluginInvoker.getString(where);
	if (whereStr == null) {
		tabLayout.addTab(tab);
	} else {
		if (whereStr.startsWith("at:")) {
			whereStr = whereStr.replace("at:", "");
			int position = Integer.parseInt(whereStr);
			tabLayout.addTab(tab, position);	
		} else if (whereStr.startsWith("before:")) {
			whereStr = whereStr.replace("before:", "");
			int tabId = (int) quickConvert(whereStr, "id");
			Tab mytab = findTabById(tabId);
			tabLayout.addTab(tab, mytab.getPosition());	
		} else if (whereStr.startsWith("after:")) {
			whereStr = whereStr.replace("after:", "");
			int tabId = (int) quickConvert(whereStr, "id");
			Tab mytab = findTabById(tabId);
			tabLayout.addTab(tab, mytab.getPosition() + 1);	
		}
	}
	
}
@Override
public void initialized() {
	super.initialized();
	
	if (widgets != null) {
		for (IWidget child : widgets) {
			if (child.getLocalName().equals(TabItemImpl.LOCAL_NAME)) {
				Object tabItemLayout = child.getAttribute("layout", true);
				Object tabItemCustomTabTitleId = child.getAttribute("customTabTitleId", true);
				Object tabItemCustomTabIconId = child.getAttribute("customTabiconId", true);
				Object tabItemIcon = child.getAttribute("icon", true);
				Object tabItemText = child.getAttribute("text", true);
				Object tabItemId = child.getAttribute("id", true);
				
				addTab(tabItemText, tabItemIcon, tabItemId, tabItemLayout, tabItemCustomTabTitleId, tabItemCustomTabIconId, null);
			}
		}
		
		initThumbHeight();
	}
	
	replayBufferedEvents();
	
}

private int tabTextColor = android.graphics.Color.BLACK;
private int tabSelectedTextColor = android.graphics.Color.BLACK;
private void setTabTextColor(Object objValue) {
	this.tabTextColor = (int) objValue;
	tabLayout.setTabTextColors(tabTextColor, tabSelectedTextColor);
}

private void setTabSelectedTextColor(Object objValue) {
	this.tabSelectedTextColor = (int) objValue;
	tabLayout.setTabTextColors(tabTextColor, tabSelectedTextColor);
}


private void setTabTextAppearance(Object objValue) {
	applyTextAppearance(objValue);
	
	if (isInitialised()) {
		updateAllTabs();
	}
}

private void setPadding(Object objValue) {
	for (int i = 0; i < tabLayout.getTabCount(); i++) {
		Tab tab = tabLayout.getTabAt(i);
		ViewCompat.setPaddingRelative(
		          tab.view, (int) objValue, (int) objValue, (int) objValue, (int) objValue);
	}

	applyTabPaddingStart(objValue);
	applyTabPaddingTop(objValue);
	applyTabPaddingEnd(objValue);
	applyTabPaddingBottom(objValue);
	
	applyModeAndGravity();
}


private void setContentStart(Object objValue) {
	setTabContentInsetStart(objValue);
	applyModeAndGravity();
}

private void setTabContentInsetStart(Object objValue) {
	applyTabContentInsetStart(objValue);
}

private void setPaddingBottom(Object objValue) {
	for (int i = 0; i < tabLayout.getTabCount(); i++) {
		Tab tab = tabLayout.getTabAt(i);
		ViewCompat.setPaddingRelative(
				tab.view, getTabPaddingStart(), getTabPaddingTop(), getTabPaddingEnd(), (int) objValue);
	}
	applyTabPaddingBottom(objValue);
	applyModeAndGravity();
}

private void setPaddingEnd(Object objValue) {
	for (int i = 0; i < tabLayout.getTabCount(); i++) {
		Tab tab = tabLayout.getTabAt(i);
		ViewCompat.setPaddingRelative(
				tab.view, getTabPaddingStart(), getTabPaddingTop(), (int) objValue, getTabPaddingBottom());
	}
	applyTabPaddingEnd(objValue);
	applyModeAndGravity();
}

private void setPaddingTop(Object objValue) {
	for (int i = 0; i < tabLayout.getTabCount(); i++) {
		Tab tab = tabLayout.getTabAt(i);
		ViewCompat.setPaddingRelative(
				tab.view, getTabPaddingStart(), (int) objValue, getTabPaddingEnd(), getTabPaddingBottom());
	}
	
	applyTabPaddingTop(objValue);
	applyModeAndGravity();
}

private void setPaddingStart(Object objValue) {
	for (int i = 0; i < tabLayout.getTabCount(); i++) {
		Tab tab = tabLayout.getTabAt(i);
		ViewCompat.setPaddingRelative(
		          tab.view, (int) objValue, getTabPaddingTop(), getTabPaddingEnd(), getTabPaddingBottom());
	}

	applyTabPaddingStart(objValue);
	applyModeAndGravity();
}


private void setMinWidth(Object objValue) {
	applyRequestedTabMinWidth(objValue);
	
}

private void setMaxWidth(Object objValue) {
	applyRequestedTabMaxWidth(objValue);
	tabLayout.requestLayout();
}
private void selectTab(Object objValue) {
	tabLayout.selectTab(tabLayout.getTabAt((int)objValue));
}

private Tab findTabById(int id) {
	for (int i = 0; i < tabLayout.getTabCount(); i++) {
		Tab tab = tabLayout.getTabAt(i);
		if (tab.getId() == id) {
			return tab;
		}
	}
	
	return null;
}

public static void addEventInfo(Map<String, Object> obj, Tab tab, IFragment fragment) {
	Context context = (Context) fragment.getRootActivity();
	if (tab.getId() != View.NO_ID) {
		String idStr = context.getResources().getResourceEntryName(tab.getId());
		if (idStr == null) {
			idStr = IdGenerator.getName(tab.getId());
		}
		
		if (idStr != null) {
			obj.put("tabId", !idStr.startsWith("@") ? "@+id/" + idStr : idStr);
		}
	}
	
}


private void setupWithViewPager(String strValue) {
	IWidget viewPager = findNearestView(strValue);
	if (viewPager != null) {
		tabLayout.setupWithViewPager((androidx.viewpager.widget.ViewPager) viewPager.asWidget());
	}
}


private void setBackgroundDrawable(Object objValue) {
	for (int i = 0; i < tabLayout.getTabCount(); i++) {
		Tab tab = tabLayout.getTabAt(i);
		applyTabBackground(tab, objValue);
	}
	tabLayout.invalidate();
}


private void removeTabById(int id) {
	Tab tab = findTabById(id);
	if (tab != null) {
		tabLayout.removeTab(tab);
	}
}


private void removeTabByAt(int pos) {
	if (tabLayout.getTabCount() > pos) {
		tabLayout.removeTabAt(pos);
	}
}
//end - codecopy
//reflection code
private void applyTabContentInsetStart(Object objValue) {
	setFieldUsingReflection(tabLayout, "contentInsetStart", objValue);
}

private void applyTabBackground(Tab tab, Object objValue) {
	setFieldUsingReflection(getFieldValueUsingReflection(tab, "view"), "baseBackgroundDrawable", objValue);
}

private void applyRequestedTabMinWidth(Object objValue) {
	setFieldUsingReflection(tabLayout, "requestedTabMinWidth", objValue);
}

private void applyRequestedTabMaxWidth(Object objValue) {
	setFieldUsingReflection(tabLayout, "requestedTabMaxWidth", objValue);
}


private int getTabPaddingBottom() {
	return (int) getFieldValueUsingReflection(tabLayout, "tabPaddingBottom");
}

private int getTabPaddingEnd() {
	return (int) getFieldValueUsingReflection(tabLayout, "tabPaddingEnd");
}

private int getTabPaddingTop() {
	return (int) getFieldValueUsingReflection(tabLayout, "tabPaddingTop");
}

private int getTabPaddingStart() {
	return (int) getFieldValueUsingReflection(tabLayout, "tabPaddingStart");
}

private void applyTabPaddingBottom(Object objValue) {
	setFieldUsingReflection(tabLayout, "tabPaddingBottom", objValue);
}

private void applyTabPaddingEnd(Object objValue) {
	setFieldUsingReflection(tabLayout, "tabPaddingEnd", objValue);
}

private void applyTabPaddingTop(Object objValue) {
	setFieldUsingReflection(tabLayout, "tabPaddingTop", objValue);
}

private void applyTabPaddingStart(Object objValue) {
	setFieldUsingReflection(tabLayout, "tabPaddingStart", objValue);
}

private void applyModeAndGravity() {
	invokePrivateMethodUsingReflection(tabLayout, "applyModeAndGravity");
}

private void updateAllTabs() {
	invokePrivateMethodUsingReflection(tabLayout, "updateAllTabs");
}


private void applyTextAppearance(Object objValue) {
	setFieldUsingReflection(tabLayout, "tabTextAppearance", objValue);
}

private void initThumbHeight() {
}

private IWidget loadLazyWidgets(Tab tab, IWidget layout) {
	IWidget customView = layout.loadLazyWidgets((com.ashera.model.LoopParam) null);
	return customView;
}

}
