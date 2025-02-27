//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJTablayout\src\main\java\com\google\android\material\tabs\TabLayout.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_TabLayout")
#ifdef RESTRICT_TabLayout
#define INCLUDE_ALL_TabLayout 0
#else
#define INCLUDE_ALL_TabLayout 1
#endif
#undef RESTRICT_TabLayout
#ifdef INCLUDE_ADMTabLayout_ViewPagerOnTabSelectedListener
#define INCLUDE_ADMTabLayout_OnTabSelectedListener 1
#endif
#ifdef INCLUDE_ADMTabLayout_OnTabSelectedListener
#define INCLUDE_ADMTabLayout_BaseOnTabSelectedListener 1
#endif

#if !defined (ADMTabLayout_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout))
#define ADMTabLayout_

#define RESTRICT_HorizontalScrollView 1
#define INCLUDE_ADHorizontalScrollView 1
#include "HorizontalScrollView.h"

@class ADColorStateList;
@class ADDrawable;
@class ADMTabLayout_SlidingTabIndicator;
@class ADMTabLayout_Tab;
@class ADXPagerAdapter;
@class ADXViewPager;
@protocol ADMTabLayout_BaseOnTabSelectedListener;
@protocol ADMTabLayout_OnTabSelectedListener;

@interface ADMTabLayout : ADHorizontalScrollView {
 @public
  jint indicatorPosition_;
  ADMTabLayout_SlidingTabIndicator *slidingTabIndicator_;
  jint tabPaddingStart_;
  jint tabPaddingTop_;
  jint tabPaddingEnd_;
  jint tabPaddingBottom_;
  ADColorStateList *tabTextColors_;
  ADColorStateList *tabIconTint_;
  ADDrawable *tabSelectedIndicator_;
  jfloat tabTextSize_;
  jfloat tabTextMultiLineSize_;
  jint tabBackgroundResId_;
  jint tabMaxWidth_;
  jint tabGravity_;
  jint tabIndicatorAnimationDuration_;
  jint tabIndicatorGravity_;
  jint mode_;
  jboolean inlineLabel_;
  jboolean tabIndicatorFullWidth_;
  jint tabIndicatorHeight_;
  jint tabIndicatorAnimationMode_;
  ADXViewPager *viewPager_;
}

#pragma mark Public

- (instancetype)init;

- (void)addOnTabSelectedListenerWithADMTabLayout_BaseOnTabSelectedListener:(id<ADMTabLayout_BaseOnTabSelectedListener>)listener;

- (void)addOnTabSelectedListenerWithADMTabLayout_OnTabSelectedListener:(id<ADMTabLayout_OnTabSelectedListener>)listener;

- (void)addTabWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

- (void)addTabWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab
                       withBoolean:(jboolean)setSelected;

- (void)addTabWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab
                           withInt:(jint)position;

- (void)addTabWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab
                           withInt:(jint)position
                       withBoolean:(jboolean)setSelected;

- (void)addTabViewWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

- (void)animateToTabWithInt:(jint)newPosition;

- (void)applyModeAndGravity;

- (jint)getScrollX;

- (jint)getSelectedTabPosition;

- (ADMTabLayout_Tab *)getTabAtWithInt:(jint)index;

- (jint)getTabCount;

- (ADColorStateList *)getTabIconTint;

- (jint)getTabIndicatorAnimationMode;

- (jint)getTabPaddingBottom;

- (jint)getTabPaddingEnd;

- (jint)getTabPaddingStart;

- (jint)getTabPaddingTop;

- (ADDrawable *)getTabSelectedIndicator;

- (ADColorStateList *)getTabTextColors;

- (void)initTabLayout OBJC_METHOD_FAMILY_NONE;

- (jboolean)isTabIndicatorFullWidth;

- (ADMTabLayout_Tab *)newTab OBJC_METHOD_FAMILY_NONE;

- (void)removeAllTabs;

- (void)removeOnTabSelectedListenerWithADMTabLayout_BaseOnTabSelectedListener:(id<ADMTabLayout_BaseOnTabSelectedListener>)listener;

- (void)removeOnTabSelectedListenerWithADMTabLayout_OnTabSelectedListener:(id<ADMTabLayout_OnTabSelectedListener>)listener;

- (void)removeTabWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

- (void)removeTabAtWithInt:(jint)position;

- (void)requestLayout;

- (void)selectTabWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

- (void)selectTabWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab
                          withBoolean:(jboolean)updateIndicator;

- (void)setContentInsetStartWithInt:(jint)contentInsetStart;

- (void)setInlineLabelWithBoolean:(jboolean)inline_;

- (void)setOnTabSelectedListenerWithADMTabLayout_BaseOnTabSelectedListener:(id<ADMTabLayout_BaseOnTabSelectedListener>)listener;

- (void)setOnTabSelectedListenerWithADMTabLayout_OnTabSelectedListener:(id<ADMTabLayout_OnTabSelectedListener>)listener;

- (void)setRequestedTabMaxWidthWithInt:(jint)requestedTabMaxWidth;

- (void)setRequestedTabMinWidthWithInt:(jint)requestedTabMinWidth;

- (void)setScrollPositionWithInt:(jint)position
                       withFloat:(jfloat)positionOffset
                     withBoolean:(jboolean)updateSelectedTabView;

- (void)setScrollPositionWithInt:(jint)position
                       withFloat:(jfloat)positionOffset
                     withBoolean:(jboolean)updateSelectedTabView
                     withBoolean:(jboolean)updateIndicatorPosition;

- (void)setScrollPositionWithInt:(jint)position
                       withFloat:(jfloat)positionOffset
                     withBoolean:(jboolean)updateSelectedTabView
                     withBoolean:(jboolean)updateIndicatorPosition
                     withBoolean:(jboolean)alwaysScroll;

- (void)setSelectedTabIndicatorColorWithInt:(jint)color;

- (void)setSelectedTabIndicatorGravityWithInt:(jint)indicatorGravity;

- (void)setSelectedTabIndicatorHeightWithInt:(jint)height;

- (void)setSelectedTabViewWithInt:(jint)position;

- (void)setTabGravityWithInt:(jint)gravity;

- (void)setTabIconTintWithADColorStateList:(ADColorStateList *)iconTint;

- (void)setTabIndicatorAnimationModeWithInt:(jint)tabIndicatorAnimationMode;

- (void)setTabIndicatorFullWidthWithBoolean:(jboolean)tabIndicatorFullWidth;

- (void)setTabModeWithInt:(jint)mode;

- (void)setTabPaddingBottomWithInt:(jint)tabPaddingBottom;

- (void)setTabPaddingEndWithInt:(jint)tabPaddingEnd;

- (void)setTabPaddingStartWithInt:(jint)tabPaddingStart;

- (void)setTabPaddingTopWithInt:(jint)tabPaddingTop;

- (void)setTabTextAppearanceWithNSString:(NSString *)tabTextAppearance;

- (void)setTabTextColorsWithADColorStateList:(ADColorStateList *)textColor;

- (void)setTabTextColorsWithInt:(jint)normalColor
                        withInt:(jint)selectedColor;

- (void)setupWithViewPagerWithADXViewPager:(ADXViewPager *)viewPager;

- (void)setupWithViewPagerWithADXViewPager:(ADXViewPager *)viewPager
                               withBoolean:(jboolean)autoRefresh;

- (void)updateAllTabs;

#pragma mark Protected

- (ADMTabLayout_Tab *)createTabFromPool;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

- (jboolean)releaseFromTabPoolWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

#pragma mark Package-Private

- (jint)getTabMaxWidth;

- (void)populateFromPagerAdapter;

- (void)setPagerAdapterWithADXPagerAdapter:(ADXPagerAdapter *)adapter
                               withBoolean:(jboolean)addObserver;

- (void)updateTabViewsWithBoolean:(jboolean)requestLayout;

- (void)updateViewPagerScrollStateWithInt:(jint)scrollState;

@end

J2OBJC_STATIC_INIT(ADMTabLayout)

J2OBJC_FIELD_SETTER(ADMTabLayout, slidingTabIndicator_, ADMTabLayout_SlidingTabIndicator *)
J2OBJC_FIELD_SETTER(ADMTabLayout, tabTextColors_, ADColorStateList *)
J2OBJC_FIELD_SETTER(ADMTabLayout, tabIconTint_, ADColorStateList *)
J2OBJC_FIELD_SETTER(ADMTabLayout, tabSelectedIndicator_, ADDrawable *)
J2OBJC_FIELD_SETTER(ADMTabLayout, viewPager_, ADXViewPager *)

inline jint ADMTabLayout_get_DEFAULT_GAP_TEXT_ICON(void);
#define ADMTabLayout_DEFAULT_GAP_TEXT_ICON 8
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, DEFAULT_GAP_TEXT_ICON, jint)

inline jint ADMTabLayout_get_FIXED_WRAP_GUTTER_MIN(void);
#define ADMTabLayout_FIXED_WRAP_GUTTER_MIN 16
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, FIXED_WRAP_GUTTER_MIN, jint)

inline jint ADMTabLayout_get_MODE_SCROLLABLE(void);
#define ADMTabLayout_MODE_SCROLLABLE 0
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, MODE_SCROLLABLE, jint)

inline jint ADMTabLayout_get_MODE_FIXED(void);
#define ADMTabLayout_MODE_FIXED 1
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, MODE_FIXED, jint)

inline jint ADMTabLayout_get_MODE_AUTO(void);
#define ADMTabLayout_MODE_AUTO 2
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, MODE_AUTO, jint)

inline jint ADMTabLayout_get_TAB_LABEL_VISIBILITY_UNLABELED(void);
#define ADMTabLayout_TAB_LABEL_VISIBILITY_UNLABELED 0
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, TAB_LABEL_VISIBILITY_UNLABELED, jint)

inline jint ADMTabLayout_get_TAB_LABEL_VISIBILITY_LABELED(void);
#define ADMTabLayout_TAB_LABEL_VISIBILITY_LABELED 1
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, TAB_LABEL_VISIBILITY_LABELED, jint)

inline jint ADMTabLayout_get_GRAVITY_FILL(void);
#define ADMTabLayout_GRAVITY_FILL 0
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, GRAVITY_FILL, jint)

inline jint ADMTabLayout_get_GRAVITY_CENTER(void);
#define ADMTabLayout_GRAVITY_CENTER 1
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, GRAVITY_CENTER, jint)

inline jint ADMTabLayout_get_GRAVITY_START(void);
#define ADMTabLayout_GRAVITY_START 2
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, GRAVITY_START, jint)

inline jint ADMTabLayout_get_INDICATOR_GRAVITY_BOTTOM(void);
#define ADMTabLayout_INDICATOR_GRAVITY_BOTTOM 0
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, INDICATOR_GRAVITY_BOTTOM, jint)

inline jint ADMTabLayout_get_INDICATOR_GRAVITY_CENTER(void);
#define ADMTabLayout_INDICATOR_GRAVITY_CENTER 1
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, INDICATOR_GRAVITY_CENTER, jint)

inline jint ADMTabLayout_get_INDICATOR_GRAVITY_TOP(void);
#define ADMTabLayout_INDICATOR_GRAVITY_TOP 2
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, INDICATOR_GRAVITY_TOP, jint)

inline jint ADMTabLayout_get_INDICATOR_GRAVITY_STRETCH(void);
#define ADMTabLayout_INDICATOR_GRAVITY_STRETCH 3
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, INDICATOR_GRAVITY_STRETCH, jint)

inline jint ADMTabLayout_get_INDICATOR_ANIMATION_MODE_LINEAR(void);
#define ADMTabLayout_INDICATOR_ANIMATION_MODE_LINEAR 0
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, INDICATOR_ANIMATION_MODE_LINEAR, jint)

inline jint ADMTabLayout_get_INDICATOR_ANIMATION_MODE_ELASTIC(void);
#define ADMTabLayout_INDICATOR_ANIMATION_MODE_ELASTIC 1
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, INDICATOR_ANIMATION_MODE_ELASTIC, jint)

inline jint ADMTabLayout_get_INDICATOR_ANIMATION_MODE_FADE(void);
#define ADMTabLayout_INDICATOR_ANIMATION_MODE_FADE 2
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout, INDICATOR_ANIMATION_MODE_FADE, jint)

FOUNDATION_EXPORT void ADMTabLayout_init(ADMTabLayout *self);

FOUNDATION_EXPORT ADMTabLayout *new_ADMTabLayout_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabLayout *create_ADMTabLayout_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout)

@compatibility_alias ComGoogleAndroidMaterialTabsTabLayout ADMTabLayout;

#endif

#if !defined (ADMTabLayout_BaseOnTabSelectedListener_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_BaseOnTabSelectedListener))
#define ADMTabLayout_BaseOnTabSelectedListener_

@class ADMTabLayout_Tab;

@protocol ADMTabLayout_BaseOnTabSelectedListener < JavaObject >

- (void)onTabSelectedWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

- (void)onTabUnselectedWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

- (void)onTabReselectedWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_BaseOnTabSelectedListener)

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_BaseOnTabSelectedListener)

#endif

#if !defined (ADMTabLayout_OnTabSelectedListener_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_OnTabSelectedListener))
#define ADMTabLayout_OnTabSelectedListener_

@protocol ADMTabLayout_OnTabSelectedListener < ADMTabLayout_BaseOnTabSelectedListener, JavaObject >

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_OnTabSelectedListener)

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_OnTabSelectedListener)

#endif

#if !defined (ADMTabLayout_Tab_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_Tab))
#define ADMTabLayout_Tab_

@class ADDrawable;
@class ADMTabLayout;
@class ADMTabLayout_TabView;
@class ADView;
@class ADXBadgeDrawable;
@protocol JavaLangCharSequence;

@interface ADMTabLayout_Tab : NSObject {
 @public
  ADMTabLayout *parent_;
  ADMTabLayout_TabView *view_;
}

#pragma mark Public

- (instancetype)init;

- (ADXBadgeDrawable *)getBadge;

- (ADView *)getCustomView;

- (ADDrawable *)getIcon;

- (jint)getId;

- (ADXBadgeDrawable *)getOrCreateBadge;

- (jint)getPosition;

- (jint)getTabLabelVisibility;

- (id)getTag;

- (id<JavaLangCharSequence>)getText;

- (jboolean)isSelected;

- (void)removeBadge;

- (void)select;

- (ADMTabLayout_Tab *)setCustomViewWithADView:(ADView *)view;

- (ADMTabLayout_Tab *)setIconWithADDrawable:(ADDrawable *)icon;

- (ADMTabLayout_Tab *)setIdWithInt:(jint)id_;

- (ADMTabLayout_Tab *)setTabLabelVisibilityWithInt:(jint)mode;

- (ADMTabLayout_Tab *)setTagWithId:(id)tag;

- (ADMTabLayout_Tab *)setTextWithJavaLangCharSequence:(id<JavaLangCharSequence>)text;

#pragma mark Package-Private

- (void)reset;

- (void)setPositionWithInt:(jint)position;

- (void)updateView;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_Tab)

J2OBJC_FIELD_SETTER(ADMTabLayout_Tab, parent_, ADMTabLayout *)
J2OBJC_FIELD_SETTER(ADMTabLayout_Tab, view_, ADMTabLayout_TabView *)

inline jint ADMTabLayout_Tab_get_INVALID_POSITION(void);
#define ADMTabLayout_Tab_INVALID_POSITION -1
J2OBJC_STATIC_FIELD_CONSTANT(ADMTabLayout_Tab, INVALID_POSITION, jint)

FOUNDATION_EXPORT void ADMTabLayout_Tab_init(ADMTabLayout_Tab *self);

FOUNDATION_EXPORT ADMTabLayout_Tab *new_ADMTabLayout_Tab_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabLayout_Tab *create_ADMTabLayout_Tab_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_Tab)

#endif

#if !defined (ADMTabLayout_TabView_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_TabView))
#define ADMTabLayout_TabView_

#define RESTRICT_LinearLayout 1
#define INCLUDE_ADLinearLayout 1
#include "LinearLayout.h"

@class ADContext;
@class ADDrawable;
@class ADMTabLayout;
@class ADMTabLayout_Tab;
@class ADView;

@interface ADMTabLayout_TabView : ADLinearLayout

#pragma mark Public

- (instancetype)initWithADMTabLayout:(ADMTabLayout *)outer$
                       withADContext:(ADContext *)context;

- (void)addClickListenerWithADView:(ADView *)view
                       withBoolean:(jboolean)allPlatforms;

- (ADMTabLayout_Tab *)getTab;

- (void)initTabView OBJC_METHOD_FAMILY_NONE;

- (void)onMeasureWithInt:(jint)origWidthMeasureSpec
                 withInt:(jint)origHeightMeasureSpec;

- (jboolean)performClick;

- (void)setBaseBackgroundDrawableWithADDrawable:(ADDrawable *)baseBackgroundDrawable;

- (void)setSelectedWithBoolean:(jboolean)selected;

#pragma mark Protected

- (void)drawableStateChanged;

#pragma mark Package-Private

- (jint)getContentHeight;

- (jint)getContentWidth;

- (void)reset;

- (void)setTabWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

- (void)update;

- (void)updateOrientation;

- (void)updateTab;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

- (instancetype)initWithADContext:(ADContext *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_TabView)

FOUNDATION_EXPORT void ADMTabLayout_TabView_initWithADMTabLayout_withADContext_(ADMTabLayout_TabView *self, ADMTabLayout *outer$, ADContext *context);

FOUNDATION_EXPORT ADMTabLayout_TabView *new_ADMTabLayout_TabView_initWithADMTabLayout_withADContext_(ADMTabLayout *outer$, ADContext *context) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabLayout_TabView *create_ADMTabLayout_TabView_initWithADMTabLayout_withADContext_(ADMTabLayout *outer$, ADContext *context);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_TabView)

#endif

#if !defined (ADMTabLayout_SlidingTabIndicator_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_SlidingTabIndicator))
#define ADMTabLayout_SlidingTabIndicator_

#define RESTRICT_LinearLayout 1
#define INCLUDE_ADLinearLayout 1
#include "LinearLayout.h"

@class ADContext;
@class ADMTabLayout;
@class ADValueAnimator;
@protocol ADCanvas;

@interface ADMTabLayout_SlidingTabIndicator : ADLinearLayout {
 @public
  ADValueAnimator *indicatorAnimator_;
}

#pragma mark Public

- (instancetype)initWithADMTabLayout:(ADMTabLayout *)outer$
                       withADContext:(ADContext *)context;

- (void)onDrawWithADCanvas:(id<ADCanvas>)canvas;

- (void)onRtlPropertiesChangedWithInt:(jint)layoutDirection;

#pragma mark Protected

- (void)onLayoutWithBoolean:(jboolean)changed
                    withInt:(jint)l
                    withInt:(jint)t
                    withInt:(jint)r
                    withInt:(jint)b;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

#pragma mark Package-Private

- (void)animateIndicatorToPositionWithInt:(jint)position
                                  withInt:(jint)duration;

- (jboolean)childrenNeedLayout;

- (void)setIndicatorPositionFromTabPositionWithInt:(jint)position
                                         withFloat:(jfloat)positionOffset;

- (void)setSelectedIndicatorHeightWithInt:(jint)height;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

- (instancetype)initWithADContext:(ADContext *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_SlidingTabIndicator)

J2OBJC_FIELD_SETTER(ADMTabLayout_SlidingTabIndicator, indicatorAnimator_, ADValueAnimator *)

FOUNDATION_EXPORT void ADMTabLayout_SlidingTabIndicator_initWithADMTabLayout_withADContext_(ADMTabLayout_SlidingTabIndicator *self, ADMTabLayout *outer$, ADContext *context);

FOUNDATION_EXPORT ADMTabLayout_SlidingTabIndicator *new_ADMTabLayout_SlidingTabIndicator_initWithADMTabLayout_withADContext_(ADMTabLayout *outer$, ADContext *context) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabLayout_SlidingTabIndicator *create_ADMTabLayout_SlidingTabIndicator_initWithADMTabLayout_withADContext_(ADMTabLayout *outer$, ADContext *context);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_SlidingTabIndicator)

#endif

#if !defined (ADMTabLayout_TabLayoutOnPageChangeListener_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_TabLayoutOnPageChangeListener))
#define ADMTabLayout_TabLayoutOnPageChangeListener_

#define RESTRICT_ViewPager 1
#define INCLUDE_ADXViewPager_OnPageChangeListener 1
#include "ViewPager.h"

@class ADMTabLayout;

@interface ADMTabLayout_TabLayoutOnPageChangeListener : NSObject < ADXViewPager_OnPageChangeListener >

#pragma mark Public

- (instancetype)initWithADMTabLayout:(ADMTabLayout *)tabLayout;

- (void)onPageScrolledWithInt:(jint)position
                    withFloat:(jfloat)positionOffset
                      withInt:(jint)positionOffsetPixels;

- (void)onPageScrollStateChangedWithInt:(jint)state;

- (void)onPageSelectedWithInt:(jint)position;

#pragma mark Package-Private

- (void)reset;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_TabLayoutOnPageChangeListener)

FOUNDATION_EXPORT void ADMTabLayout_TabLayoutOnPageChangeListener_initWithADMTabLayout_(ADMTabLayout_TabLayoutOnPageChangeListener *self, ADMTabLayout *tabLayout);

FOUNDATION_EXPORT ADMTabLayout_TabLayoutOnPageChangeListener *new_ADMTabLayout_TabLayoutOnPageChangeListener_initWithADMTabLayout_(ADMTabLayout *tabLayout) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabLayout_TabLayoutOnPageChangeListener *create_ADMTabLayout_TabLayoutOnPageChangeListener_initWithADMTabLayout_(ADMTabLayout *tabLayout);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_TabLayoutOnPageChangeListener)

#endif

#if !defined (ADMTabLayout_ViewPagerOnTabSelectedListener_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_ViewPagerOnTabSelectedListener))
#define ADMTabLayout_ViewPagerOnTabSelectedListener_

@class ADMTabLayout_Tab;
@class ADXViewPager;

@interface ADMTabLayout_ViewPagerOnTabSelectedListener : NSObject < ADMTabLayout_OnTabSelectedListener >

#pragma mark Public

- (instancetype)initWithADXViewPager:(ADXViewPager *)viewPager;

- (void)onTabReselectedWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

- (void)onTabSelectedWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

- (void)onTabUnselectedWithADMTabLayout_Tab:(ADMTabLayout_Tab *)tab;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_ViewPagerOnTabSelectedListener)

FOUNDATION_EXPORT void ADMTabLayout_ViewPagerOnTabSelectedListener_initWithADXViewPager_(ADMTabLayout_ViewPagerOnTabSelectedListener *self, ADXViewPager *viewPager);

FOUNDATION_EXPORT ADMTabLayout_ViewPagerOnTabSelectedListener *new_ADMTabLayout_ViewPagerOnTabSelectedListener_initWithADXViewPager_(ADXViewPager *viewPager) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabLayout_ViewPagerOnTabSelectedListener *create_ADMTabLayout_ViewPagerOnTabSelectedListener_initWithADXViewPager_(ADXViewPager *viewPager);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_ViewPagerOnTabSelectedListener)

#endif

#if !defined (ADMTabLayout_TextViewCompat_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_TextViewCompat))
#define ADMTabLayout_TextViewCompat_

@class ADMTabLayout_Layout;
@class ADTextView;

@interface ADMTabLayout_TextViewCompat : NSObject

#pragma mark Public

+ (ADMTabLayout_Layout *)getLayoutWithADTextView:(ADTextView *)textView;

+ (jint)getLineCountWithADTextView:(ADTextView *)textView;

+ (jint)getMaxLinesWithADTextView:(ADTextView *)textView;

+ (jint)getTextSizeWithADTextView:(ADTextView *)textView;

+ (void)setTextAppearanceWithADTextView:(ADTextView *)textView
                           withNSString:(NSString *)textAppearance;

+ (void)setTextSizeWithADTextView:(ADTextView *)textView
                        withFloat:(jfloat)textSize;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_TextViewCompat)

FOUNDATION_EXPORT void ADMTabLayout_TextViewCompat_init(ADMTabLayout_TextViewCompat *self);

FOUNDATION_EXPORT ADMTabLayout_TextViewCompat *new_ADMTabLayout_TextViewCompat_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabLayout_TextViewCompat *create_ADMTabLayout_TextViewCompat_init(void);

FOUNDATION_EXPORT jint ADMTabLayout_TextViewCompat_getMaxLinesWithADTextView_(ADTextView *textView);

FOUNDATION_EXPORT void ADMTabLayout_TextViewCompat_setTextAppearanceWithADTextView_withNSString_(ADTextView *textView, NSString *textAppearance);

FOUNDATION_EXPORT jint ADMTabLayout_TextViewCompat_getLineCountWithADTextView_(ADTextView *textView);

FOUNDATION_EXPORT jint ADMTabLayout_TextViewCompat_getTextSizeWithADTextView_(ADTextView *textView);

FOUNDATION_EXPORT ADMTabLayout_Layout *ADMTabLayout_TextViewCompat_getLayoutWithADTextView_(ADTextView *textView);

FOUNDATION_EXPORT void ADMTabLayout_TextViewCompat_setTextSizeWithADTextView_withFloat_(ADTextView *textView, jfloat textSize);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_TextViewCompat)

#endif

#if !defined (ADMTabLayout_Paint_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_Paint))
#define ADMTabLayout_Paint_

@interface ADMTabLayout_Paint : NSObject

#pragma mark Public

- (jfloat)getTextSize;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_Paint)

FOUNDATION_EXPORT void ADMTabLayout_Paint_init(ADMTabLayout_Paint *self);

FOUNDATION_EXPORT ADMTabLayout_Paint *new_ADMTabLayout_Paint_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabLayout_Paint *create_ADMTabLayout_Paint_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_Paint)

#endif

#if !defined (ADMTabLayout_Layout_) && (INCLUDE_ALL_TabLayout || defined(INCLUDE_ADMTabLayout_Layout))
#define ADMTabLayout_Layout_

@class ADMTabLayout_Paint;

@interface ADMTabLayout_Layout : NSObject

#pragma mark Public

- (jint)getLineWidthWithInt:(jint)line;

- (ADMTabLayout_Paint *)getPaint;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabLayout_Layout)

FOUNDATION_EXPORT void ADMTabLayout_Layout_init(ADMTabLayout_Layout *self);

FOUNDATION_EXPORT ADMTabLayout_Layout *new_ADMTabLayout_Layout_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabLayout_Layout *create_ADMTabLayout_Layout_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabLayout_Layout)

#endif

#pragma pop_macro("INCLUDE_ALL_TabLayout")
