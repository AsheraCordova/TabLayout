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

/*-[
#include <UIKit/UIKit.h>
#include "ASUIView.h"
#include "HasLifeCycleDecorators.h"
]-*/
import com.google.j2objc.annotations.Property;
import androidx.core.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports
import com.google.android.material.tabs.TabLayout;

/*-[
#include "ASUIImageView.h"
]-*/
public class SlidingTabIndicatorImpl extends BaseHasWidgets {
	//start - body
	private @Property Object uiView;
	private r.android.graphics.Canvas canvas;
	public final static String LOCAL_NAME = "com.google.android.material.tabs.TabLayout.SlidingTabIndicator"; 
	public final static String GROUP_NAME = "com.google.android.material.tabs.TabLayout.SlidingTabIndicator";
	private com.google.android.material.tabs.TabLayout.SlidingTabIndicator slidingTabIndicator;
	

	
		@SuppressLint("NewApi")
		final static class Divider  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("none", 0x0);
				mapping.put("beginning", 0x1);
				mapping.put("end", 0x4);
				mapping.put("middle", 0x2);
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

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAligned").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAlignedChildIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("divider").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("measureWithLargestChild").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("weightSum").withType("float"));
		ConverterFactory.register("com.google.android.material.tabs.TabLayout.SlidingTabIndicator.divider", new Divider());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showDividers").withType("com.google.android.material.tabs.TabLayout.SlidingTabIndicator.divider"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dividerPadding").withType("dimension"));
	
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_gravity").withType("gravity").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_weight").withType("float").forChild());
	}
	
	public SlidingTabIndicatorImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  SlidingTabIndicatorImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  SlidingTabIndicatorImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new SlidingTabIndicatorImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		slidingTabIndicator = new SlidingTabIndicatorExt((com.google.android.material.tabs.TabLayout) getParent().asWidget());
		
		nativeCreate(params);
        createCanvas();
		
		
		ViewGroupImpl.registerCommandConveter(this);
		setWidgetOnNativeClass();
		
	}
	private native void setWidgetOnNativeClass() /*-[
		((ASUIView*) [self asNativeWidget]).widget = self;
	]-*/;

	@Override
	public Object asWidget() {
		return slidingTabIndicator;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		slidingTabIndicator.removeView((View) w.asWidget());
		 nativeRemoveView(w);            
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		slidingTabIndicator.removeViewAt(index);
		return true;
    }

	private void nativeRemoveView(IWidget widget) {
		r.android.animation.LayoutTransition layoutTransition = slidingTabIndicator.getLayoutTransition();
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
			        slidingTabIndicator.addView(view);
			    } else {
			        slidingTabIndicator.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		com.google.android.material.tabs.TabLayout.SlidingTabIndicator.LayoutParams layoutParams = (com.google.android.material.tabs.TabLayout.SlidingTabIndicator.LayoutParams) view.getLayoutParams();
		
		layoutParams = (com.google.android.material.tabs.TabLayout.SlidingTabIndicator.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new com.google.android.material.tabs.TabLayout.SlidingTabIndicator.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private com.google.android.material.tabs.TabLayout.SlidingTabIndicator.LayoutParams getLayoutParams(View view) {
		return (com.google.android.material.tabs.TabLayout.SlidingTabIndicator.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		com.google.android.material.tabs.TabLayout.SlidingTabIndicator.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
			case "layout_gravity": {
				
							layoutParams.gravity = ((int)objValue);
				
			}
			break;
			case "layout_weight": {
				
							layoutParams.weight = ((float)objValue);
				
			}
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
		com.google.android.material.tabs.TabLayout.SlidingTabIndicator.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
			case "layout_gravity": {
return layoutParams.gravity;			}

			case "layout_weight": {
return layoutParams.weight;			}

		}
		
		return null;

	}
	
@com.google.j2objc.annotations.WeakOuter		
	public class SlidingTabIndicatorExt extends com.google.android.material.tabs.TabLayout.SlidingTabIndicator implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return SlidingTabIndicatorImpl.this;
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

		public SlidingTabIndicatorExt(TabLayout tablayout) {
			tablayout.super(tablayout.getContext());
			
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
			ViewImpl.setDrawableBounds(SlidingTabIndicatorImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
			canvas.reset();
			onDraw(canvas);
	        ViewImpl.redrawDrawables(SlidingTabIndicatorImpl.this);
	        overlays = ViewImpl.drawOverlay(SlidingTabIndicatorImpl.this, overlays);
			
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
				SlidingTabIndicatorImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(SlidingTabIndicatorImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(SlidingTabIndicatorImpl.this);
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
        	SlidingTabIndicatorImpl.this.getParent().remove(SlidingTabIndicatorImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	appScreenLocation[0] = ViewImpl.getLocationXOnScreen(asNativeWidget());
        	appScreenLocation[1] = ViewImpl.getLocationYOnScreen(asNativeWidget());
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	
        	displayFrame.left = ViewImpl.getLocationXOnScreen(asNativeWidget());
        	displayFrame.top = ViewImpl.getLocationYOnScreen(asNativeWidget());
        	displayFrame.right = displayFrame.left + getWidth();
        	displayFrame.bottom = displayFrame.top + getHeight();
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
			SlidingTabIndicatorImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ViewImpl.nativeSetVisibility(asNativeWidget(), visibility != View.VISIBLE);
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(SlidingTabIndicatorImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(SlidingTabIndicatorImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(SlidingTabIndicatorImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(SlidingTabIndicatorImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(SlidingTabIndicatorImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(SlidingTabIndicatorImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(SlidingTabIndicatorImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(SlidingTabIndicatorImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(SlidingTabIndicatorImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(SlidingTabIndicatorImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(SlidingTabIndicatorImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(SlidingTabIndicatorImpl.this);
        }
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
		}
	
		@Override
		public void removeViewAt(int index) {
			super.removeViewAt(index);
			IWidget widget = widgets.get(index);
			SlidingTabIndicatorImpl.super.remove(index);

	        if (index + 1 <= slidingTabIndicator.getChildCount()) {
	            nativeRemoveView(widget);
	        }    
		}
	}
	@Override
	public Class getViewClass() {
		return SlidingTabIndicatorExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "baselineAligned": {


	slidingTabIndicator.setBaselineAligned((boolean)objValue);



			}
			break;
			case "baselineAlignedChildIndex": {


	slidingTabIndicator.setBaselineAlignedChildIndex((int)objValue);



			}
			break;
			case "divider": {
if (Build.VERSION.SDK_INT >= 11) {

	slidingTabIndicator.setDividerDrawable((r.android.graphics.drawable.Drawable)objValue);

}

			}
			break;
			case "gravity": {


	slidingTabIndicator.setGravity((int)objValue);



			}
			break;
			case "measureWithLargestChild": {
if (Build.VERSION.SDK_INT >= 11) {

	slidingTabIndicator.setMeasureWithLargestChildEnabled((boolean)objValue);

}

			}
			break;
			case "weightSum": {


	slidingTabIndicator.setWeightSum((float)objValue);



			}
			break;
			case "showDividers": {


		setShowDividers(objValue);



			}
			break;
			case "dividerPadding": {


		setDividerPadding(objValue);



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
			case "baselineAligned": {
return slidingTabIndicator.isBaselineAligned();			}
			case "baselineAlignedChildIndex": {
return slidingTabIndicator.getBaselineAlignedChildIndex();			}
			case "divider": {
if (Build.VERSION.SDK_INT >= 11) {
return slidingTabIndicator.getDividerDrawable();
}
break;			}
			case "gravity": {
if (Build.VERSION.SDK_INT >= 24) {
return slidingTabIndicator.getGravity();
}
break;			}
			case "measureWithLargestChild": {
if (Build.VERSION.SDK_INT >= 11) {
return slidingTabIndicator.isMeasureWithLargestChildEnabled();
}
break;			}
			case "weightSum": {
return slidingTabIndicator.getWeightSum();			}
			case "showDividers": {
return getShowDividers();			}
			case "dividerPadding": {
return getDividerPadding();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return uiView;
    }
    public native boolean checkIosVersion(String v) /*-[
		return ([[[UIDevice currentDevice] systemVersion] compare:v options:NSNumericSearch] == NSOrderedDescending);
	]-*/;
    public native void nativeCreate(Map<String, Object> params)/*-[
		ASUIView* uiView = [ASUIView new];
		uiView.backgroundColor = [UIColor clearColor];
		uiView_ = uiView;
	]-*/;
    
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
    
	

	@SuppressLint("NewApi")
	private void setDividerPadding(Object objValue) {
		if (Build.VERSION.SDK_INT >= 11) {
			slidingTabIndicator.setDividerPadding((int) objValue);
		}
	}

	@SuppressLint("NewApi")
	private void setShowDividers(Object objValue) {
		if (Build.VERSION.SDK_INT >= 11) {
			slidingTabIndicator.setShowDividers((int) objValue);
		}
	}

	@SuppressLint("NewApi")
	private Object getDividerPadding() {
		if (Build.VERSION.SDK_INT >= 11) {
			return slidingTabIndicator.getDividerPadding();
		}
		
		return null;
	}

	@SuppressLint("NewApi")
	private Object getShowDividers() {
		if (Build.VERSION.SDK_INT >= 11) {
			return slidingTabIndicator.getShowDividers();
		}
		return null;
	}
	


	@com.google.j2objc.annotations.WeakOuter
	private static final class CanvasImpl implements r.android.graphics.Canvas {
		private boolean canvasReset = true;
		private boolean requiresAttrChangeListener = true;
		private List<Object> imageViews = new java.util.ArrayList<Object>();
		@com.google.j2objc.annotations.Weak private IWidget widget;
		public CanvasImpl(IWidget widget) {
			this.widget = widget;
		}

		@Override
		public void draw(r.android.graphics.drawable.Drawable mDivider) {
			for (Object divider : imageViews) {
				if (ViewImpl.getX(divider) == mDivider.getLeft() && ViewImpl.getY(divider) == mDivider.getTop()) {
					return;
				}
			}
			
			Object image = mDivider.getDrawable();
			if (image != null) {
				if (image instanceof Integer){
					image = ViewImpl.getColor(image);
				}

				Object imageView = nativeCreateImageView(image);
				if (requiresAttrChangeListener) {
					mDivider.setAttributeChangeListener((name, value) -> {
						switch (name) {
						case "bounds":
							r.android.graphics.Rect rect = (r.android.graphics.Rect) value;
							ViewImpl.nativeMakeFrame(imageView, rect.left, rect.top, rect.right, rect.bottom);
							break;
						case "alpha":
							int alpha = (int) value;
							ViewImpl.setAlpha(imageView, alpha/255f);
							break;
						default:
							break;
						}
					});
				}
				ViewImpl.nativeMakeFrame(imageView, mDivider.getLeft(), mDivider.getTop(), mDivider.getRight(), mDivider.getBottom());
				imageViews.add(imageView);				
				ViewGroupImpl.nativeAddView(widget.asNativeWidget(), imageView);
			}
		}

		@Override
		public void reset() {
			if (canvasReset) {
				for (Object imageView : imageViews) {
					ViewGroupImpl.removeView(imageView);
				}
				imageViews.clear();
			}
		}
		
		public native Object nativeCreateImageView(Object image)/*-[
			ASUIImageView* imageView = [ASUIImageView new];
			if ([image isKindOfClass:[UIImage class]]) {
				imageView.image = image;
				imageView.backgroundColor = nil;
			}else if ([image isKindOfClass:[UIColor class]]) {
				imageView.backgroundColor = image;
				imageView.image = nil;
			}
			return imageView;
		]-*/;
	}

	private void createCanvas() {
		canvas = new CanvasImpl(this);
		
	}
	


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			slidingTabIndicator.setId((int) quickConvert(id, "id"));
		}
	}
	
    
    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
    }

		//end - body
}
