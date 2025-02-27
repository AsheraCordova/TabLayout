//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJTablayout\src\main\java\com\google\android\material\tabs\TabIndicatorInterpolator.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_TabIndicatorInterpolator")
#ifdef RESTRICT_TabIndicatorInterpolator
#define INCLUDE_ALL_TabIndicatorInterpolator 0
#else
#define INCLUDE_ALL_TabIndicatorInterpolator 1
#endif
#undef RESTRICT_TabIndicatorInterpolator

#if !defined (ADMTabIndicatorInterpolator_) && (INCLUDE_ALL_TabIndicatorInterpolator || defined(INCLUDE_ADMTabIndicatorInterpolator))
#define ADMTabIndicatorInterpolator_

@class ADDrawable;
@class ADMTabLayout;
@class ADMTabLayout_TabView;
@class ADRectF;
@class ADView;

@interface ADMTabIndicatorInterpolator : NSObject

#pragma mark Package-Private

- (instancetype)initPackagePrivate;

+ (ADRectF *)calculateIndicatorWidthForTabWithADMTabLayout:(ADMTabLayout *)tabLayout
                                                withADView:(ADView *)tab;

+ (ADRectF *)calculateTabViewContentBoundsWithADMTabLayout_TabView:(ADMTabLayout_TabView *)tabView
                                                           withInt:(jint)minWidth;

- (void)setIndicatorBoundsForTabWithADMTabLayout:(ADMTabLayout *)tabLayout
                                      withADView:(ADView *)tab
                                  withADDrawable:(ADDrawable *)indicator;

- (void)updateIndicatorForOffsetWithADMTabLayout:(ADMTabLayout *)tabLayout
                                      withADView:(ADView *)startTitle
                                      withADView:(ADView *)endTitle
                                       withFloat:(jfloat)offset
                                  withADDrawable:(ADDrawable *)indicator;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMTabIndicatorInterpolator)

FOUNDATION_EXPORT void ADMTabIndicatorInterpolator_initPackagePrivate(ADMTabIndicatorInterpolator *self);

FOUNDATION_EXPORT ADMTabIndicatorInterpolator *new_ADMTabIndicatorInterpolator_initPackagePrivate(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMTabIndicatorInterpolator *create_ADMTabIndicatorInterpolator_initPackagePrivate(void);

FOUNDATION_EXPORT ADRectF *ADMTabIndicatorInterpolator_calculateTabViewContentBoundsWithADMTabLayout_TabView_withInt_(ADMTabLayout_TabView *tabView, jint minWidth);

FOUNDATION_EXPORT ADRectF *ADMTabIndicatorInterpolator_calculateIndicatorWidthForTabWithADMTabLayout_withADView_(ADMTabLayout *tabLayout, ADView *tab);

J2OBJC_TYPE_LITERAL_HEADER(ADMTabIndicatorInterpolator)

@compatibility_alias ComGoogleAndroidMaterialTabsTabIndicatorInterpolator ADMTabIndicatorInterpolator;

#endif

#pragma pop_macro("INCLUDE_ALL_TabIndicatorInterpolator")
