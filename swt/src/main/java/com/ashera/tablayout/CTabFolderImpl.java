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

import androidx.core.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.Tab;
import r.android.content.res.ColorStateList;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.Display;
import static com.ashera.common.DisposeUtil.*;
public class CTabFolderImpl extends BaseHasWidgets {
	//start - body
	private Object pane;
	public final static String LOCAL_NAME = "CTabFolder"; 
	public final static String GROUP_NAME = "com.google.android.material.tabs.TabLayout";
	private com.google.android.material.tabs.TabLayout tabLayout;
	

	
		@SuppressLint("NewApi")
		final static class Font extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("monospace",  0x3);
				mapping.put("normal",  0x0);
				mapping.put("sans",  0x1);
				mapping.put("serif",  0x2);
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
		final static class TextStyle  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("bold", 0x1);
				mapping.put("italic", 0x2);
				mapping.put("normal", 0x0);
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

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabSelectedTextColor").withType("color").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tabTextColor").withType("color").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
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
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeNumbers").withType("array").withArrayType("int").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeIsVisibles").withType("array").withArrayType("boolean").withOrder(10).withBufferStrategy(BUFFER_STRATEGY_DURING_INIT).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padSpaceCount").withType("int").withOrder(-1));
		ConverterFactory.register("CTabFolder.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("CTabFolder.font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("CTabFolder.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("CTabFolder.textStyle").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtBorderVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("menuItemIds").withType("array").withArrayType("id").withOrder(-1));
	
	}
	
	public CTabFolderImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  CTabFolderImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  CTabFolderImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new CTabFolderImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		tabLayout = new CTabFolderExt();
		
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
	
		
	public class CTabFolderExt extends com.google.android.material.tabs.TabLayout implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return CTabFolderImpl.this;
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

		public CTabFolderExt() {
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
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			ViewImpl.setDrawableBounds(CTabFolderImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(CTabFolderImpl.this);
	        overlays = ViewImpl.drawOverlay(CTabFolderImpl.this, overlays);
			
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
				CTabFolderImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(CTabFolderImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(CTabFolderImpl.this);
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
        	CTabFolderImpl.this.getParent().remove(CTabFolderImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	org.eclipse.swt.widgets.Control control = (org.eclipse.swt.widgets.Control) asNativeWidget();
			appScreenLocation[0] = control.toDisplay(0, 0).x;
        	appScreenLocation[1] = control.toDisplay(0, 0).y;
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	org.eclipse.swt.widgets.Shell shell = ((org.eclipse.swt.widgets.Control)asNativeWidget()).getShell();
        	displayFrame.left = shell.toDisplay(0, 0).x ;
			displayFrame.top = shell.getShell().toDisplay(0, 0).y ;
        	displayFrame.bottom = displayFrame.top + shell.getClientArea().height;
        	displayFrame.right = displayFrame.left + shell.getBounds().width;
        	
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
			CTabFolderImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            org.eclipse.swt.widgets.Control control = ((org.eclipse.swt.widgets.Control)asNativeWidget());
            if (!control.isDisposed()) {
            	control.setVisible(View.VISIBLE == visibility);
            }
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(CTabFolderImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(CTabFolderImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(CTabFolderImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(CTabFolderImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(CTabFolderImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(CTabFolderImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(CTabFolderImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(CTabFolderImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(CTabFolderImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(CTabFolderImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(CTabFolderImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(CTabFolderImpl.this);
        }
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
		}
	
	}
	@Override
	public Class getViewClass() {
		return CTabFolderExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "tabSelectedTextColor": {


		setTabSelectedTextColor(objValue);



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
			case "updateTabTexts": {


		updateTabTexts(objValue);



			}
			break;
			case "setupWithViewPager": {


		setupWithViewPager(strValue);



			}
			break;
			case "badgeNumbers": {


		setBadgeNumbers(objValue);



			}
			break;
			case "badgeIsVisibles": {


		setBadgeIsVisibles(objValue);



			}
			break;
			case "padSpaceCount": {


		setPadSpaceCount((int) objValue);



			}
			break;
			case "typeface": {


		setTypeFace(objValue, strValue);



			}
			break;
			case "textStyle": {


		setTextStyle(objValue);



			}
			break;
			case "fontFamily": {


		setFontFamily(objValue, strValue);



			}
			break;
			case "textSize": {


		setMyTextSize(objValue);



			}
			break;
			case "swtBorderVisible": {


		tabFolder.setBorderVisible((boolean) objValue);



			}
			break;
			case "menuItemIds": {


		setBadgeMenuItemIds(objValue);



			}
			break;
		default:
			break;
		}
		postSetAttribute(key, strValue, objValue, decorator);
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
			case "textSize": {
return getTextSize();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return pane;
    }
    public boolean isWidgetDisposed() {
		return ((org.eclipse.swt.widgets.Control) pane).isDisposed();
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
    
	

    private Map<String, com.ashera.model.FontDescriptor> fontDescriptors ;

    private void setTypeFace(Object objValue, String strValue) {
        setFontFamily(objValue, strValue);
    }
    
    private void setFontFamily(Object objValue, String strValue) {
        if (objValue instanceof Integer) {
            objValue = PluginInvoker.convertFrom(ConverterFactory.get(CommonConverters.font), null, strValue, fragment);
        }
        this.fontDescriptors = (Map<String, com.ashera.model.FontDescriptor>) objValue;
		int style = nativeGetFontStyle();
		int height = nativeGetFontSize();
        
        String weight = "400";
        if ((style & BOLD_FONT_TRAIT) != 0) {
            weight = "700";
        }
        String fontStyle = "normal";
        if ((style & ITALIC_FONT_TRAIT) != 0) {
            fontStyle = "italic";
        }
        com.ashera.model.FontDescriptor fontDescriptor = fontDescriptors.get(fontStyle + "_" + weight);
        nativeSetCustomFont(height, fontDescriptor);
    }

    
    private void setTextStyle(Object objValue) {
        int value = (int)objValue;

        if (fontDescriptors != null) {
            int height = nativeGetFontSize();
            
            String weight = "400";
            if ((value & 0x1) != 0) {
                weight = "700";
            }
            String fontStyle = "normal";
            if ((value & 0x2) != 0) {
                fontStyle = "italic";
            }
            com.ashera.model.FontDescriptor fontDescriptor = fontDescriptors.get(fontStyle + "_" + weight);
            nativeSetCustomFont(height, fontDescriptor);
        } else {
            int style = NORMAL_FONT_TRAIT; 
            if ((value & 0x1) != 0) {
                style = style | BOLD_FONT_TRAIT;
            }
            if ((value & 0x2) != 0) {
                style = style | ITALIC_FONT_TRAIT;
            }       
            nativeSetFontStyle(style);
        }

    }
	


	private int nativeGetFontSize() {
		FontData[] fontData = tabFolder.getFont().getFontData();
        int height = fontData[0].getHeight();
		return height;
	}

	private int nativeGetFontStyle() {
		FontData[] fontData = tabFolder.getFont().getFontData();
        int style = fontData[0].getStyle();
		return style;
	}

	private void nativeSetCustomFont(int height, com.ashera.model.FontDescriptor fontDescriptor) {
		final org.eclipse.swt.graphics.Font newFont = new org.eclipse.swt.graphics.Font(Display.getDefault(), fontDescriptor.getName(), height, fontDescriptor.getStyle());
		setFont(newFont);
	}

	private void nativeSetFontStyle(int style) {
		FontData[] fontData = tabFolder.getFont().getFontData();
		for(int i = 0; i < fontData.length; ++i) {
		    fontData[i].setStyle(style);
		}

		final org.eclipse.swt.graphics.Font newFont = new org.eclipse.swt.graphics.Font(Display.getDefault(), fontData);
		setFont(newFont);
	}

    private void setFont(final org.eclipse.swt.graphics.Font newFont) {
        disposeAll(this.newFont);
        this.newFont = newFont;
        tabFolder.setFont(newFont);
    }

    private void setMyTextSize(Object objValue) {
        FontData[] fontData = tabFolder.getFont().getFontData();
        for(int i = 0; i < fontData.length; ++i) {
            float fontSize = ((float) objValue) * getFragment().getRootActivity().getScaleFactor();
			fontData[i].setHeight((int) fontSize);
        }

        final org.eclipse.swt.graphics.Font newFont = new org.eclipse.swt.graphics.Font(Display.getDefault(), fontData);
        setFont(newFont);
    }
    
	
	private Object getTextSize() {
		return tabFolder.getFont().getFontData()[0].getHeight();
	}
    


    private org.eclipse.swt.graphics.Font newFont;
	private static final int ITALIC_FONT_TRAIT = org.eclipse.swt.SWT.ITALIC;
	private static final int BOLD_FONT_TRAIT = org.eclipse.swt.SWT.BOLD;
	private static final int NORMAL_FONT_TRAIT = org.eclipse.swt.SWT.NORMAL;
	

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
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        CTabFolderImpl.addEventInfo(obj, tab);
    
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
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        CTabFolderImpl.addEventInfo(obj, tab);
    
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
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        CTabFolderImpl.addEventInfo(obj, tab);
    
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
    public int getStyle(String key, int initStyle, Map<String, Object> params, IFragment fragment) {
    	if (params == null) {
    		return initStyle;
    	}
    	Object style = params.get(key);
		if (style == null) {
			return initStyle;
		}
		int convertFrom = (int) ConverterFactory.get("swtbitflag").convertFrom(style.toString(), null, fragment);
		return convertFrom;
	}
	
	public int getStyle(Map<String, Object> params, IFragment fragment) {
		return getStyle("swtStyle", org.eclipse.swt.SWT.NONE, params, fragment);
	}
	
	public int getStyle(int initStyle, Map<String, Object> params, IFragment fragment) {
		return getStyle("swtStyle", initStyle, params, fragment);
	}

		//end - body

//start - codecopy
org.eclipse.swt.custom.CTabFolder tabFolder;


private void removeTabById(int id) {
	org.eclipse.swt.custom.CTabItem tab = findTabById(id);
	if (tab != null) {
		tabLayout.removeTab((Tab) tab.getData());
	}
}


private void removeTabByAt(int pos) {
	if (tabFolder.getItemCount() > pos) {
		tabLayout.removeTabAt(pos);
	}
}


private int padSpaceCount;
private void setPadSpaceCount(int padSpaceCount) {
	this.padSpaceCount = padSpaceCount;
}
private void nativeCreate(Map<String, Object> params) {
	tabLayout = new CustomCTabFolderExt();
	tabFolder = new org.eclipse.swt.custom.CTabFolder(ViewImpl.getParent(this), org.eclipse.swt.SWT.TOP);
	pane = tabFolder;
	tabFolder.setLayout(new org.eclipse.nebula.widgets.layout.AbsoluteLayout());
	tabFolder.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
		@Override
		public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
			super.widgetSelected(e);
			
			tabLayout.selectTab((com.google.android.material.tabs.TabLayout.Tab) tabFolder.getItem(tabFolder.getSelectionIndex()).getData());
		}
		
		@Override
		public void widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent e) {
			widgetSelected(e);
		}
	});
}
private List<Object> badgeMenuItemIds;
private void setBadgeMenuItemIds(Object objValue) {
	badgeMenuItemIds = PluginInvoker.getList(objValue);
}

private void setBadgeNumbers(Object objValue) {
	setValueOnBadgeDrawable(objValue, (tab, value) -> {		
		tab.setData("badgeNumber", value);
		tab.setText(getFinalText(tab));
	});

}

private void setBadgeIsVisibles(Object objValue) {
	setValueOnBadgeDrawable(objValue, (tab, value) -> {
		tab.setData("badgeIsVisible", value);
		tab.setText(getFinalText(tab));
	});
}


private void updateTabTexts(Object objValue) {
	setValueOnBadgeDrawable(objValue, (tab, value) -> {
		((Tab) tab.getData()).setText((String) value);
		tab.setText(getFinalText(tab));
	});
}

private org.eclipse.swt.custom.CTabItem findTabById(int id) {
	for (int i = 0; i < tabFolder.getItemCount(); i++) {
		org.eclipse.swt.custom.CTabItem cTabItem = tabFolder.getItem(i);
		Tab tab = (Tab) cTabItem.getData();
		if (tab.getId() == id) {
			return cTabItem;
		}
	}
	
	return null;
}
public static interface ValueSetter {
	void setValueOnBadgeDrawable(org.eclipse.swt.custom.CTabItem tab, Object value);
}
private void setValueOnBadgeDrawable(Object objValue, ValueSetter valueSetter) {
	if (badgeMenuItemIds != null) {
		List<Object> badgeAttrs = PluginInvoker.getList(objValue);
		
		for (int i = 0; i < badgeMenuItemIds.size(); i++) {
			int id = (int) badgeMenuItemIds.get(i);
			org.eclipse.swt.custom.CTabItem badge = findTabById(id);
			Object value = badgeAttrs.get(i);
			valueSetter.setValueOnBadgeDrawable(badge, value);
		}
	}
}

private String getFinalText(org.eclipse.swt.custom.CTabItem tab) {
	String text = (String) ((Tab) tab.getData()).getText();
	Boolean isBadgeVisible = (Boolean) tab.getData("badgeIsVisible");
	Integer badgeNumber = (Integer) tab.getData("badgeNumber");
	
	String mytext;
	if (isBadgeVisible == null || isBadgeVisible.booleanValue()) {
		if (badgeNumber != null) {
			mytext = String.format(text + " (%d)", badgeNumber);
		} else {
			mytext = text;
		}
	} else {
		mytext = text;
	}
	
	mytext = padText(mytext);
	
	return mytext;
}

private String padText(String text) {
	if (padSpaceCount > 0) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < padSpaceCount; i++) {
		    sb.append(' ');
		}
		text = sb.toString() + text + sb.toString();
	}
	
	return text;
}


public class TabNative extends com.google.android.material.tabs.TabLayout.Tab {
	org.eclipse.swt.custom.CTabItem tab;
	public TabNative(org.eclipse.swt.custom.CTabFolder tabFolder, int index) {
		this.parent = tabLayout;
		if (index >= 0) {
			this.tab = new org.eclipse.swt.custom.CTabItem(tabFolder, org.eclipse.swt.SWT.NONE, index);
		} else {
			this.tab = new org.eclipse.swt.custom.CTabItem(tabFolder, org.eclipse.swt.SWT.NONE);
		}
		this.tab.setData(this);
		updateMiniumHeight();
		
	}
	
	@Override
	public com.google.android.material.tabs.TabLayout.Tab setText(java.lang.CharSequence text) {
		Tab mytab = super.setText(text);
		if (text != null) {
			String mytext = (String) text;
			mytext = padText(mytext);
			tab.setText(mytext);
		}
		return mytab;
	}
	
	@Override
	public com.google.android.material.tabs.TabLayout.Tab setIcon(r.android.graphics.drawable.Drawable icon) {
		Tab mytab = super.setIcon(icon);
		if (icon != null) {
			Object objValue = icon.getDrawable();
			 if (objValue instanceof org.eclipse.swt.graphics.Image) {
				org.eclipse.swt.graphics.Image image = (org.eclipse.swt.graphics.Image) objValue;
				r.android.content.res.ColorStateList tintColorState = tabLayout.getTabIconTint();
				if (tintColorState != null) {
					Object tintColor = tintColorState.getColorForState(tabLayout.getDrawableState(), r.android.graphics.Color.RED);
					tintColor = ViewImpl.getColor(tintColor);
					image = com.ashera.common.ImageUtils.tintImage(image, (org.eclipse.swt.graphics.Color) tintColor, null);
					fragment.addDisposable(image);
				}
	           
	           tab.setImage(image);
			 }
		}
		return mytab;
	}
	
	@Override
	public void select() {
		super.select();
	}
}
@Override
public void initialized() {
	super.initialized();
	if (widgets != null) {
		for (IWidget child : widgets) {
			if (child.getLocalName().equals(TabItemImpl.LOCAL_NAME)) {
				Object tabItemText = child.getAttribute("text", true);
				Object tabItemIcon = child.getAttribute("icon", true);
				Object tabItemId = child.getAttribute("id", true);
				addTab(tabItemText, tabItemIcon, tabItemId, null, null, null, null);
			}
		}
	}

	updateMiniumHeight();
	if (tabFolder.getItemCount() > 0) {
		int selectionIndex = tabFolder.getSelectionIndex();
		if (selectionIndex < 0) {
			selectionIndex = 0;
		}
		tabLayout.selectTab((Tab) tabFolder.getItem(0).getData());
	}
	
	replayBufferedEvents();
}

private void addTab(Object tabItemText, Object tabItemIcon, Object tabItemId, Object layout, Object customTabTitleId, Object customTabiconId,  Object where) {
	if (tabItemId != null && findTabById((int) tabItemId) != null) {
		return;
	}
	int index = -1;
	if (where != null) {
		String whereStr = where.toString(); 
		if (whereStr.startsWith("at:")) {
			whereStr = whereStr.replace("at:", "");
			index = Integer.parseInt(whereStr);
		} else if (whereStr.startsWith("before:")) {
			whereStr = whereStr.replace("before:", "");
			int tabId = (int) quickConvert(whereStr, "id");
			org.eclipse.swt.custom.CTabItem mytab = findTabById(tabId);
			index = tabFolder.indexOf(mytab);
		} else if (whereStr.startsWith("after:")) {
			whereStr = whereStr.replace("after:", "");
			int tabId = (int) quickConvert(whereStr, "id");
			org.eclipse.swt.custom.CTabItem mytab = findTabById(tabId);
			index = tabFolder.indexOf(mytab) + 1;
		}
	}
	((CustomCTabFolderExt)tabLayout).insertIndex = index;
	Tab tab = tabLayout.newTab();
	((CustomCTabFolderExt)tabLayout).insertIndex = -1;
	String text = (String) tabItemText;
	if (text != null) {
		tab.setText(text);
	}
	
	r.android.graphics.drawable.Drawable icon = (r.android.graphics.drawable.Drawable) tabItemIcon;
	if (icon!= null) {
		tab.setIcon(icon);
	}
	
	Integer id = (Integer) tabItemId;
	if (id!= null) {
		tab.setId(id);
	}
}

public static void addEventInfo(Map<String, Object> obj, Tab tab) {
	String idStr = IdGenerator.getName(tab.getId());
	obj.put("tabId", idStr);
}

private void selectTab(Object objValue) {
	int index = (int) objValue;
	if (index < tabFolder.getItemCount()) {
		tabLayout.selectTab((Tab) tabFolder.getItem(index).getData());	
	}
}

private void setupWithViewPager(String strValue) {
	IWidget viewPager = findNearestView(strValue);
	if (viewPager != null) {
		tabLayout.setupWithViewPager((androidx.viewpager.widget.ViewPager) viewPager.asWidget());
	}
}

public class CustomCTabFolderExt extends CTabFolderExt {
	private int insertIndex = -1;
	@Override
	public void removeAllTabs() {
		while (tabFolder.getItemCount() > 0) {
		    org.eclipse.swt.custom.CTabItem item = tabFolder.getItem(0);
		    item.dispose();
		}
	}
	
	@Override
	public void removeTabAt(int position) {
		if (tabFolder.getItemCount() > position) {
		    org.eclipse.swt.custom.CTabItem item = tabFolder.getItem(position);
		    item.dispose();
		}
	}
	
	@Override
	public void removeTab(com.google.android.material.tabs.TabLayout.Tab tab) {
		((TabNative) tab).tab.dispose();
	}

	@Override
	public void addTabView(com.google.android.material.tabs.TabLayout.Tab tab) {
	}
	
	@Override
	public com.google.android.material.tabs.TabLayout.Tab newTab() {
		return  new TabNative(tabFolder, insertIndex);
	}
	
	@Override
	public void animateToTab(int newPosition) {
	}
	
	@Override
	public void setScrollPosition(  int position,  float positionOffset,  boolean updateSelectedTabView,  boolean updateIndicatorPosition,  boolean alwaysScroll){
		
	}
	
	@Override
	public void setSelectedTabView(int position){
	}
	
	@Override
	public void setTabIconTint(r.android.content.res.ColorStateList iconTint) {
		super.setTabIconTint(iconTint);
		
		if (isInitialised()) {
			for (int i = 0; i < tabFolder.getItemCount(); i++) {
				org.eclipse.swt.custom.CTabItem cTabItem = tabFolder.getItem(i);
				Tab tab = (Tab) cTabItem.getData();
				tab.setIcon(tab.getIcon());
			}
		}
	}
	
	@Override
	public void selectTab(final Tab tab,boolean updateIndicator) {
		super.selectTab(tab, updateIndicator);
		for (int i = 0; i < tabFolder.getItemCount(); i++) {
			org.eclipse.swt.custom.CTabItem cTabItem = tabFolder.getItem(i);
			if (cTabItem.getData() == tab) {
				tabFolder.setSelection(cTabItem);
				break;
			}
		}
	}
}


private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
		ILifeCycleDecorator decorator) {
	if (isInitialised()) {
		updateMiniumHeight();
	}
}

private void updateMiniumHeight() {
	tabLayout.setMinimumHeight(Math.abs(tabFolder.getClientArea().height));
}

//end - codecopy
private void setTabTextColor(Object objValue) {
	tabFolder.setForeground((org.eclipse.swt.graphics.Color) ViewImpl.getColor(objValue));
}

private void setTabSelectedTextColor(Object objValue) {
	tabFolder.setSelectionForeground((org.eclipse.swt.graphics.Color) ViewImpl.getColor(objValue));
}


}
