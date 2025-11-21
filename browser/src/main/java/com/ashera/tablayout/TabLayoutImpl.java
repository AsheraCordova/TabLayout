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

import r.android.annotation.SuppressLint;
import r.android.content.Context;
import r.android.os.Build;
import r.android.view.*;
import r.android.widget.*;
import r.android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import r.android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import org.teavm.jso.dom.html.HTMLElement;

import static com.ashera.widget.IWidget.*;
//end - imports
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.Tab;
import r.android.content.res.ColorStateList;
import com.google.android.material.badge.BadgeDrawable;
import androidx.core.view.ViewCompat;
public class TabLayoutImpl extends BaseHasWidgets {
	//start - body
	private HTMLElement htmlElement;
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

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabBackground").withType("drawable").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabContentStart").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("com.google.android.material.tabs.TabLayout.tabGravity", new TabGravity());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabGravity").withType("com.google.android.material.tabs.TabLayout.tabGravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("com.google.android.material.tabs.TabLayout.tabIndicatorAnimationMode", new TabIndicatorAnimationMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorAnimationMode").withType("com.google.android.material.tabs.TabLayout.tabIndicatorAnimationMode").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorFullWidth").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("com.google.android.material.tabs.TabLayout.tabIndicatorGravity", new TabIndicatorGravity());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorGravity").withType("com.google.android.material.tabs.TabLayout.tabIndicatorGravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabInlineLabel").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabMaxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabMinWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("com.google.android.material.tabs.TabLayout.tabMode", new TabMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabMode").withType("com.google.android.material.tabs.TabLayout.tabMode").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPadding").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPaddingBottom").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPaddingEnd").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPaddingStart").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabPaddingTop").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("removeTab").withType("id").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("removeTabAt").withType("int").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("removeAllTabs").withType("nil").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTabSelected").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTabUnselected").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTabReselected").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("addTab").withType("object").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIconTint").withType("colorstate").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectTab").withType("int").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("updateTabTexts").withType("array").withArrayType("resourcestring").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("setupWithViewPager").withType("id").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabIndicatorColor").withType("colorint"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabSelectedTextColor").withType("colorint"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabTextColor").withType("colorint"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabTextAppearance").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeNumbers").withType("array").withArrayType("int").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeAlphas").withType("array").withArrayType("int").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeMaxCharacterCounts").withType("array").withArrayType("int").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeGravities").withType("array").withArrayType("gravity").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeHorizontalOffsets").withType("array").withArrayType("dimension").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeVerticalOffsets").withType("array").withArrayType("dimension").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeIsVisibles").withType("array").withArrayType("boolean").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeBackgroundColors").withType("array").withArrayType("colorint").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeTextColors").withType("array").withArrayType("colorint").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeTextAppearanceResources").withType("array").withArrayType("string").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("menuItemIds").withType("array").withArrayType("id").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollX").withType("dimension").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
	
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
		tabLayout = new TabLayoutExt();
		
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
		 nativeRemoveView(w);            
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= tabLayout.getChildCount()) {
            tabLayout.removeViewAt(index);
            nativeRemoveView(widget);
        }    
        return remove;
    }

	private void nativeRemoveView(IWidget widget) {
		r.android.animation.LayoutTransition layoutTransition = tabLayout.getLayoutTransition();
		if (layoutTransition != null && (
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.CHANGE_DISAPPEARING) ||
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.DISAPPEARING)
				)) {
			addToBufferedRunnables(() -> ViewGroupImpl.nativeRemoveView(widget));          
		} else {
			ViewGroupImpl.nativeRemoveView(widget);
		}
	}
	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        tabLayout.addView(view);
			    } else {
			        tabLayout.addView(view, index);
			    }
		}
		
		if (!((View) w.asWidget() instanceof com.ashera.model.IViewStub)) {ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());}//(asNativeWidget(), w.asNativeWidget());
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
		private List<IWidget> overlays;
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

		public TabLayoutExt() {
			super();
			
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
			postOnMeasure(widthMeasureSpec, heightMeasureSpec);
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			ViewImpl.setDrawableBounds(TabLayoutImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrameForHorizontalScrollView(asNativeWidget(), l, t, r, b, (int) (computeHorizontalScrollRange()));
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(TabLayoutImpl.this);
	        overlays = ViewImpl.drawOverlay(TabLayoutImpl.this, overlays);
			
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
		public void execute(String method, Object... canvas) {
			
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
    		
    		IWidget widget = template.loadLazyWidgets(TabLayoutImpl.this);
			return (View) widget.asWidget();
    	}   
        
    	@Override
		public void remeasure() {
    		if (getFragment() != null) {
    			getFragment().remeasure();
    		}
		}
    	
        @Override
		public void removeFromParent() {
        	TabLayoutImpl.this.getParent().remove(TabLayoutImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	appScreenLocation[0] = htmlElement.getBoundingClientRect().getLeft();
        	appScreenLocation[1] = htmlElement.getBoundingClientRect().getTop();
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	
        	org.teavm.jso.dom.html.TextRectangle boundingClientRect = htmlElement.getBoundingClientRect();
			displayFrame.top = boundingClientRect.getTop();
        	displayFrame.left = boundingClientRect.getLeft();
        	displayFrame.bottom = boundingClientRect.getBottom();
        	displayFrame.right = boundingClientRect.getRight();
        }
        @Override
		public void offsetTopAndBottom(int offset) {
			super.offsetTopAndBottom(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void offsetLeftAndRight(int offset) {
			super.offsetLeftAndRight(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void setMyAttribute(String name, Object value) {
			if (name.equals("state0")) {
				setState0(value);
				return;
			}
			if (name.equals("state1")) {
				setState1(value);
				return;
			}
			if (name.equals("state2")) {
				setState2(value);
				return;
			}
			if (name.equals("state3")) {
				setState3(value);
				return;
			}
			if (name.equals("state4")) {
				setState4(value);
				return;
			}
			TabLayoutImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((HTMLElement)asNativeWidget()).getStyle().setProperty("display", visibility != View.VISIBLE ? "none" : "block");
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(TabLayoutImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(TabLayoutImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(TabLayoutImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(TabLayoutImpl.this, 3, value);
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
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
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
			case "updateTabTexts": {


		updateTabTexts(objValue);



			}
			break;
			case "setupWithViewPager": {


		setupWithViewPager(strValue);



			}
			break;
			case "tabIndicatorColor": {


	tabLayout.setSelectedTabIndicatorColor((int)objValue);



			}
			break;
			case "tabSelectedTextColor": {


		setTabSelectedTextColor(objValue);



			}
			break;
			case "tabTextColor": {


		setTabTextColor(objValue);



			}
			break;
			case "tabTextAppearance": {


		setTabTextAppearance(objValue);



			}
			break;
			case "badgeNumbers": {


		setBadgeNumbers(objValue);



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
			case "badgeBackgroundColors": {


		setBadgeBackgroundColors(objValue);



			}
			break;
			case "badgeTextColors": {


		setBadgeTextColors(objValue);



			}
			break;
			case "badgeTextAppearanceResources": {


		setTextAppearanceResources(objValue);



			}
			break;
			case "menuItemIds": {


		setBadgeMenuItemIds(objValue);



			}
			break;
			case "scrollX": {


		setScrollX(objValue);



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
			case "scrollX": {
return getScrollX();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return htmlElement;
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
		r.android.graphics.drawable.Drawable icon = (r.android.graphics.drawable.Drawable) tabItemIcon;
		
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

		r.android.graphics.drawable.Drawable icon = (r.android.graphics.drawable.Drawable) tabItemIcon;
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

private int tabTextColor = r.android.graphics.Color.BLACK;
private int tabSelectedTextColor = r.android.graphics.Color.BLACK;
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



	int thumbHeight = 0;
	private void postOnMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		tabLayout.adjustPaddingIfScrollBarPresent(widthMeasureSpec, heightMeasureSpec, thumbHeight);
	}
	


    @org.teavm.jso.JSBody(params = {}, script = "return window.getScrollbarWidth();")
    private static native int getScrollbarWidth();

    private void initThumbHeight() {
		thumbHeight = getScrollbarWidth();
	}
    


	private void setScrollX(Object objValue) {
    	if (!isInitialised()) {
    		 org.teavm.jso.dom.html.HTMLDocument.current().addEventListener("DOMContentLoaded", new org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.Event>() {
				@Override
				public void handleEvent(org.teavm.jso.dom.events.Event evt) {
					htmlElement.setScrollLeft((int) objValue);
				}
    			 
    		 });
    	} else {
			htmlElement.setScrollLeft((int) objValue);
    	}
    }
	
	private Object getScrollX() {
		return htmlElement.getScrollLeft();
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



private void setTextAppearanceResources(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setTextAppearanceResource((String) value);
	});
	
}



private void applyTabContentInsetStart(Object objValue) {
	tabLayout.setContentInsetStart((int) objValue);
}

private void applyTabBackground(Tab tab, Object objValue) {
	tab.view.setBaseBackgroundDrawable((r.android.graphics.drawable.Drawable) objValue);
}

private void applyRequestedTabMinWidth(Object objValue) {
	tabLayout.setRequestedTabMinWidth((int) objValue);
}

private void applyRequestedTabMaxWidth(Object objValue) {
	tabLayout.setRequestedTabMaxWidth((int) objValue);
}


private int getTabPaddingBottom() {
	return tabLayout.getTabPaddingBottom();
}

private int getTabPaddingEnd() {
	return tabLayout.getTabPaddingEnd();
}

private int getTabPaddingTop() {
	return tabLayout.getTabPaddingTop();
}

private int getTabPaddingStart() {
	return tabLayout.getTabPaddingStart();
}

private void applyTabPaddingBottom(Object objValue) {
	tabLayout.setTabPaddingBottom((int) objValue);
}

private void applyTabPaddingEnd(Object objValue) {
	tabLayout.setTabPaddingEnd((int) objValue);
}

private void applyTabPaddingTop(Object objValue) {
	tabLayout.setTabPaddingTop((int) objValue);
}

private void applyTabPaddingStart(Object objValue) {
	tabLayout.setTabPaddingStart((int) objValue);
}

private void applyModeAndGravity() {
	tabLayout.applyModeAndGravity();
}

private void updateAllTabs() {
	tabLayout.updateAllTabs();
}


private void applyTextAppearance(Object objValue) {
	tabLayout.setTabTextAppearance((String) objValue);
}


private IWidget loadLazyWidgets(Tab tab, IWidget layout) {
	IWidget customView = layout.loadLazyWidgets((HasWidgets)((ILifeCycleDecorator) tab.view).getWidget());
	return customView;
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
	
    
    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
    }

		//end - body

private void nativeCreate(Map<String, Object> params) {
	htmlElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
	htmlElement.getStyle().setProperty("overflow-x", "auto");
	htmlElement.getStyle().setProperty("overflow-y", "hidden");
	htmlElement.getStyle().setProperty("box-sizing", "border-box");
	tabLayout.initTabLayout();
}
}
