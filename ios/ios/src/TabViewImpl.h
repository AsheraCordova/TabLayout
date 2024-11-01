//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSTabLayoutPlugin\src\main\java\com\ashera\tablayout\TabViewImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_TabViewImpl")
#ifdef RESTRICT_TabViewImpl
#define INCLUDE_ALL_TabViewImpl 0
#else
#define INCLUDE_ALL_TabViewImpl 1
#endif
#undef RESTRICT_TabViewImpl

#if !defined (ASTabViewImpl_) && (INCLUDE_ALL_TabViewImpl || defined(INCLUDE_ASTabViewImpl))
#define ASTabViewImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ASTabViewImpl_TabViewBean;
@class ASTabViewImpl_TabViewCommandBuilder;
@class ASTabViewImpl_TabViewCommandParamsBuilder;
@class ASTabViewImpl_TabViewParamsBean;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASTabViewImpl : ASBaseHasWidgets
@property id uiView;

#pragma mark Public

- (instancetype)init;

- (instancetype)initWithNSString:(NSString *)localname;

- (instancetype)initWithNSString:(NSString *)groupName
                    withNSString:(NSString *)localname;

- (void)addWithASIWidget:(id<ASIWidget>)w
                 withInt:(jint)index;

- (id)asNativeWidget;

- (id)asWidget;

- (jboolean)checkIosVersionWithNSString:(NSString *)v;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (void)createView;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (ASTabViewImpl_TabViewBean *)getBean;

- (ASTabViewImpl_TabViewCommandBuilder *)getBuilder;

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (ASTabViewImpl_TabViewParamsBean *)getParamsBean;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)getParamsBuilder;

- (id)getPluginWithNSString:(NSString *)plugin;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)localName;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (jboolean)removeWithInt:(jint)index;

- (jboolean)removeWithASIWidget:(id<ASIWidget>)w;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setChildAttributeWithASIWidget:(id<ASIWidget>)w
                 withASWidgetAttribute:(ASWidgetAttribute *)key
                          withNSString:(NSString *)strValue
                                withId:(id)objValue;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setVisibleWithBoolean:(jboolean)b;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTabViewImpl)

inline NSString *ASTabViewImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASTabViewImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASTabViewImpl, LOCAL_NAME, NSString *)

inline NSString *ASTabViewImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASTabViewImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASTabViewImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASTabViewImpl_init(ASTabViewImpl *self);

FOUNDATION_EXPORT ASTabViewImpl *new_ASTabViewImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTabViewImpl *create_ASTabViewImpl_init(void);

FOUNDATION_EXPORT void ASTabViewImpl_initWithNSString_(ASTabViewImpl *self, NSString *localname);

FOUNDATION_EXPORT ASTabViewImpl *new_ASTabViewImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTabViewImpl *create_ASTabViewImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASTabViewImpl_initWithNSString_withNSString_(ASTabViewImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASTabViewImpl *new_ASTabViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTabViewImpl *create_ASTabViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASTabViewImpl)

@compatibility_alias ComAsheraTablayoutTabViewImpl ASTabViewImpl;

#endif

#if !defined (ASTabViewImpl_Divider_) && (INCLUDE_ALL_TabViewImpl || defined(INCLUDE_ASTabViewImpl_Divider))
#define ASTabViewImpl_Divider_

#define RESTRICT_AbstractBitFlagConverter 1
#define INCLUDE_ASAbstractBitFlagConverter 1
#include "AbstractBitFlagConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASTabViewImpl_Divider : ASAbstractBitFlagConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTabViewImpl_Divider)

FOUNDATION_EXPORT void ASTabViewImpl_Divider_init(ASTabViewImpl_Divider *self);

FOUNDATION_EXPORT ASTabViewImpl_Divider *new_ASTabViewImpl_Divider_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTabViewImpl_Divider *create_ASTabViewImpl_Divider_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASTabViewImpl_Divider)

#endif

#if !defined (ASTabViewImpl_TabViewExt_) && (INCLUDE_ALL_TabViewImpl || defined(INCLUDE_ASTabViewImpl_TabViewExt))
#define ASTabViewImpl_TabViewExt_

#define RESTRICT_TabLayout 1
#define INCLUDE_ADMTabLayout_TabView 1
#include "TabLayout.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADContext;
@class ADMTabLayout;
@class ADRect;
@class ADView;
@class ASTabViewImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASTabViewImpl_TabViewExt : ADMTabLayout_TabView < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASTabViewImpl:(ASTabViewImpl *)outer$
                     withADMTabLayout:(ADMTabLayout *)tablayout;

- (void)drawableStateChanged;

- (void)endViewTransitionWithADView:(ADView *)view;

- (void)executeWithNSString:(NSString *)method
          withNSObjectArray:(IOSObjectArray *)canvas;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

- (void)getLocationOnScreenWithIntArray:(IOSIntArray *)appScreenLocation;

- (jint)getMaxHeight;

- (jint)getMaxWidth;

- (id<JavaUtilList>)getMethods;

- (id<ASIWidget>)getWidget;

- (void)getWindowVisibleDisplayFrameWithADRect:(ADRect *)displayFrame;

- (ADView *)inflateViewWithNSString:(NSString *)layout;

- (void)initialized OBJC_METHOD_FAMILY_NONE;

- (id<ASILifeCycleDecorator>)newInstanceWithASIWidget:(id<ASIWidget>)widget OBJC_METHOD_FAMILY_NONE;

- (void)offsetLeftAndRightWithInt:(jint)offset;

- (void)offsetTopAndBottomWithInt:(jint)offset;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

- (void)remeasure;

- (void)removeFromParent;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue;

- (void)setMaxHeightWithInt:(jint)height;

- (void)setMaxWidthWithInt:(jint)width;

- (void)setMyAttributeWithNSString:(NSString *)name
                            withId:(id)value;

- (void)setState0WithId:(id)value;

- (void)setState1WithId:(id)value;

- (void)setState2WithId:(id)value;

- (void)setState3WithId:(id)value;

- (void)setState4WithId:(id)value;

- (void)setVisibilityWithInt:(jint)visibility;

- (void)state0;

- (void)state1;

- (void)state2;

- (void)state3;

- (void)state4;

- (void)stateNo;

- (void)stateYes;

- (void)updateMeasuredDimensionWithInt:(jint)width
                               withInt:(jint)height;

#pragma mark Protected

- (void)onLayoutWithBoolean:(jboolean)changed
                    withInt:(jint)l
                    withInt:(jint)t
                    withInt:(jint)r
                    withInt:(jint)b;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithADMTabLayout:(ADMTabLayout *)outer$
                       withADContext:(ADContext *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTabViewImpl_TabViewExt)

FOUNDATION_EXPORT void ASTabViewImpl_TabViewExt_initWithASTabViewImpl_withADMTabLayout_(ASTabViewImpl_TabViewExt *self, ASTabViewImpl *outer$, ADMTabLayout *tablayout);

FOUNDATION_EXPORT ASTabViewImpl_TabViewExt *new_ASTabViewImpl_TabViewExt_initWithASTabViewImpl_withADMTabLayout_(ASTabViewImpl *outer$, ADMTabLayout *tablayout) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTabViewImpl_TabViewExt *create_ASTabViewImpl_TabViewExt_initWithASTabViewImpl_withADMTabLayout_(ASTabViewImpl *outer$, ADMTabLayout *tablayout);

J2OBJC_TYPE_LITERAL_HEADER(ASTabViewImpl_TabViewExt)

#endif

#if !defined (ASTabViewImpl_TabViewCommandBuilder_) && (INCLUDE_ALL_TabViewImpl || defined(INCLUDE_ASTabViewImpl_TabViewCommandBuilder))
#define ASTabViewImpl_TabViewCommandBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandBuilder 1
#include "ViewGroupImpl.h"

@class ASTabViewImpl;

@interface ASTabViewImpl_TabViewCommandBuilder : ASViewGroupImpl_ViewGroupCommandBuilder

#pragma mark Public

- (instancetype)initWithASTabViewImpl:(ASTabViewImpl *)outer$;

- (ASTabViewImpl_TabViewCommandBuilder *)addAllModelWithId:(id)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)addModelByIndexWithId:(id)arg0
                                                        withId:(id)arg1;

- (ASTabViewImpl_TabViewCommandBuilder *)addModelWithId:(id)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)animatorXmlWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)endAnimator;

- (ASTabViewImpl_TabViewCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (id)getBaselineAlignedChildIndex;

- (id)getDivider;

- (id)getDividerPadding;

- (id)getGravity;

- (id)getShowDividers;

- (id)getWeightSum;

- (ASTabViewImpl_TabViewCommandBuilder *)invalidate;

- (id)isBaselineAligned;

- (id)isMeasureWithLargestChild;

- (ASTabViewImpl_TabViewCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)removeModelAtIndexWithInt:(jint)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)removeModelByIdWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)requestLayout;

- (ASTabViewImpl_TabViewCommandBuilder *)reset;

- (ASTabViewImpl_TabViewCommandBuilder *)setAddStatesFromChildrenWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setAnimateLayoutChangesWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setAnimateParentHierarchyWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setBaselineAlignedWithBoolean:(jboolean)value;

- (ASTabViewImpl_TabViewCommandBuilder *)setBaselineAlignedChildIndexWithInt:(jint)value;

- (ASTabViewImpl_TabViewCommandBuilder *)setBottomWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setChildXmlWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setClipChildrenWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setClipToPaddingWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setDividerWithNSString:(NSString *)value;

- (ASTabViewImpl_TabViewCommandBuilder *)setDividerPaddingWithNSString:(NSString *)value;

- (ASTabViewImpl_TabViewCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setElevationWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setGravityWithNSString:(NSString *)value;

- (ASTabViewImpl_TabViewCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setLayoutModeWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setLayoutTransitionDurationWithInt:(jint)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setLayoutTransitionWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setLeftWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setListitemWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setMaxHeightWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setMaxWidthWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setMeasureWithLargestChildWithBoolean:(jboolean)value;

- (ASTabViewImpl_TabViewCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setModelDescPathWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setModelForWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setModelIdPathWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnAnimationCancelWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnAnimationEndWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnAnimationRepeatWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnAnimationStartWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnChildViewAddedWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnChildViewRemovedWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setPaddingBottomWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setPaddingEndWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setPaddingLeftWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setPaddingRightWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setPaddingStartWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setPaddingTopWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setPaddingWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setRightWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setShowDividersWithNSString:(NSString *)value;

- (ASTabViewImpl_TabViewCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setTopWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)setWeightSumWithFloat:(jfloat)value;

- (ASTabViewImpl_TabViewCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASTabViewImpl_TabViewCommandBuilder *)startAnimator;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetAddStatesFromChildren;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetAlpha;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetBackground;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetBackgroundTint;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetBackgroundTintMode;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetBaselineAligned;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetBaselineAlignedChildIndex;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetBottom;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetClickable;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetClipChildren;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetClipToPadding;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetContentDescription;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetDivider;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetDividerPadding;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetDuplicateParentState;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetEnabled;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetFocusable;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetForeground;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetForegroundGravity;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetForegroundTint;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetForegroundTintMode;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetGravity;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetId;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosAccessibilityHint;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosAccessibilityValue;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosAlpha;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosBackgroundColor;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosClipsToBounds;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosContentScaleFactor;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosIsFocused;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosIsHidden;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosIsOpaque;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosLargeContentImage;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosLargeContentTitle;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosTag;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosTintColor;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetKeepScreenOn;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetLayoutDirection;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetLayoutMode;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetLeft;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetLongClickable;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetMaxHeight;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetMaxWidth;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetMeasureWithLargestChild;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetMinHeight;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetMinWidth;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetModelDescPath;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetModelIdPath;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetModelParam;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetModelPojoToUi;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetModelSyncEvents;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetModelUiToPojo;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetPaddingBottom;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetPaddingEnd;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetPaddingLeft;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetPaddingRight;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetPaddingStart;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetPaddingTop;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetRight;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetRotation;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetRotationX;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetRotationY;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetScaleX;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetScaleY;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetSelected;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetShowDividers;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetTextAlignment;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetTextDirection;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetTop;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetTransformPivotX;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetTransformPivotY;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetTranslationX;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetTranslationY;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetTranslationZ;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetValidateForm;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetVisibility;

- (ASTabViewImpl_TabViewCommandBuilder *)tryGetWeightSum;

- (ASTabViewImpl_TabViewCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                              withId:(id)arg1;

- (ASTabViewImpl_TabViewCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTabViewImpl_TabViewCommandBuilder)

FOUNDATION_EXPORT void ASTabViewImpl_TabViewCommandBuilder_initWithASTabViewImpl_(ASTabViewImpl_TabViewCommandBuilder *self, ASTabViewImpl *outer$);

FOUNDATION_EXPORT ASTabViewImpl_TabViewCommandBuilder *new_ASTabViewImpl_TabViewCommandBuilder_initWithASTabViewImpl_(ASTabViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTabViewImpl_TabViewCommandBuilder *create_ASTabViewImpl_TabViewCommandBuilder_initWithASTabViewImpl_(ASTabViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTabViewImpl_TabViewCommandBuilder)

#endif

#if !defined (ASTabViewImpl_TabViewBean_) && (INCLUDE_ALL_TabViewImpl || defined(INCLUDE_ASTabViewImpl_TabViewBean))
#define ASTabViewImpl_TabViewBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupBean 1
#include "ViewGroupImpl.h"

@class ASTabViewImpl;
@protocol ASIWidget;

@interface ASTabViewImpl_TabViewBean : ASViewGroupImpl_ViewGroupBean

#pragma mark Public

- (instancetype)initWithASTabViewImpl:(ASTabViewImpl *)outer$;

- (id)getBaselineAlignedChildIndex;

- (id)getDivider;

- (id)getDividerPadding;

- (id)getGravity;

- (id)getShowDividers;

- (id)getWeightSum;

- (id)isBaselineAligned;

- (id)isMeasureWithLargestChild;

- (void)setBaselineAlignedWithBoolean:(jboolean)value;

- (void)setBaselineAlignedChildIndexWithInt:(jint)value;

- (void)setDividerWithNSString:(NSString *)value;

- (void)setDividerPaddingWithNSString:(NSString *)value;

- (void)setGravityWithNSString:(NSString *)value;

- (void)setMeasureWithLargestChildWithBoolean:(jboolean)value;

- (void)setShowDividersWithNSString:(NSString *)value;

- (void)setWeightSumWithFloat:(jfloat)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTabViewImpl_TabViewBean)

FOUNDATION_EXPORT void ASTabViewImpl_TabViewBean_initWithASTabViewImpl_(ASTabViewImpl_TabViewBean *self, ASTabViewImpl *outer$);

FOUNDATION_EXPORT ASTabViewImpl_TabViewBean *new_ASTabViewImpl_TabViewBean_initWithASTabViewImpl_(ASTabViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTabViewImpl_TabViewBean *create_ASTabViewImpl_TabViewBean_initWithASTabViewImpl_(ASTabViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTabViewImpl_TabViewBean)

#endif

#if !defined (ASTabViewImpl_TabViewParamsBean_) && (INCLUDE_ALL_TabViewImpl || defined(INCLUDE_ASTabViewImpl_TabViewParamsBean))
#define ASTabViewImpl_TabViewParamsBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupParamsBean 1
#include "ViewGroupImpl.h"

@class ASTabViewImpl;
@protocol ASIWidget;

@interface ASTabViewImpl_TabViewParamsBean : ASViewGroupImpl_ViewGroupParamsBean

#pragma mark Public

- (instancetype)initWithASTabViewImpl:(ASTabViewImpl *)outer$;

- (id)getLayoutGravityWithASIWidget:(id<ASIWidget>)w;

- (id)getLayoutWeightWithASIWidget:(id<ASIWidget>)w;

- (void)setLayoutGravityWithASIWidget:(id<ASIWidget>)w
                         withNSString:(NSString *)value;

- (void)setLayoutWeightWithASIWidget:(id<ASIWidget>)w
                           withFloat:(jfloat)value;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTabViewImpl_TabViewParamsBean)

FOUNDATION_EXPORT void ASTabViewImpl_TabViewParamsBean_initWithASTabViewImpl_(ASTabViewImpl_TabViewParamsBean *self, ASTabViewImpl *outer$);

FOUNDATION_EXPORT ASTabViewImpl_TabViewParamsBean *new_ASTabViewImpl_TabViewParamsBean_initWithASTabViewImpl_(ASTabViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTabViewImpl_TabViewParamsBean *create_ASTabViewImpl_TabViewParamsBean_initWithASTabViewImpl_(ASTabViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTabViewImpl_TabViewParamsBean)

#endif

#if !defined (ASTabViewImpl_TabViewCommandParamsBuilder_) && (INCLUDE_ALL_TabViewImpl || defined(INCLUDE_ASTabViewImpl_TabViewCommandParamsBuilder))
#define ASTabViewImpl_TabViewCommandParamsBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandParamsBuilder 1
#include "ViewGroupImpl.h"

@class ASTabViewImpl;

@interface ASTabViewImpl_TabViewCommandParamsBuilder : ASViewGroupImpl_ViewGroupCommandParamsBuilder

#pragma mark Public

- (instancetype)initWithASTabViewImpl:(ASTabViewImpl *)outer$;

- (id)getLayoutGravity;

- (id)getLayoutWeight;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)reset;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutGravityWithNSString:(NSString *)value;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutMarginBottomWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutMarginEndWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutMarginHorizontalWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutMarginLeftWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutMarginRightWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutMarginStartWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutMarginTopWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutMarginVerticalWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutMarginWithNSString:(NSString *)arg0;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)setLayoutWeightWithFloat:(jfloat)value;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)tryGetLayoutGravity;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)tryGetLayoutMarginBottom;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)tryGetLayoutMarginEnd;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)tryGetLayoutMarginLeft;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)tryGetLayoutMarginRight;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)tryGetLayoutMarginStart;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)tryGetLayoutMarginTop;

- (ASTabViewImpl_TabViewCommandParamsBuilder *)tryGetLayoutWeight;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTabViewImpl_TabViewCommandParamsBuilder)

FOUNDATION_EXPORT void ASTabViewImpl_TabViewCommandParamsBuilder_initWithASTabViewImpl_(ASTabViewImpl_TabViewCommandParamsBuilder *self, ASTabViewImpl *outer$);

FOUNDATION_EXPORT ASTabViewImpl_TabViewCommandParamsBuilder *new_ASTabViewImpl_TabViewCommandParamsBuilder_initWithASTabViewImpl_(ASTabViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTabViewImpl_TabViewCommandParamsBuilder *create_ASTabViewImpl_TabViewCommandParamsBuilder_initWithASTabViewImpl_(ASTabViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTabViewImpl_TabViewCommandParamsBuilder)

#endif

#pragma pop_macro("INCLUDE_ALL_TabViewImpl")