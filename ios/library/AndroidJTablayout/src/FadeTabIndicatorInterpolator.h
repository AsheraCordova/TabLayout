//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJTablayout\src\main\java\com\google\android\material\tabs\FadeTabIndicatorInterpolator.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_FadeTabIndicatorInterpolator")
#ifdef RESTRICT_FadeTabIndicatorInterpolator
#define INCLUDE_ALL_FadeTabIndicatorInterpolator 0
#else
#define INCLUDE_ALL_FadeTabIndicatorInterpolator 1
#endif
#undef RESTRICT_FadeTabIndicatorInterpolator

#if !defined (ADMFadeTabIndicatorInterpolator_) && (INCLUDE_ALL_FadeTabIndicatorInterpolator || defined(INCLUDE_ADMFadeTabIndicatorInterpolator))
#define ADMFadeTabIndicatorInterpolator_

#define RESTRICT_TabIndicatorInterpolator 1
#define INCLUDE_ADMTabIndicatorInterpolator 1
#include "TabIndicatorInterpolator.h"

@class ADDrawable;
@class ADMTabLayout;
@class ADView;

@interface ADMFadeTabIndicatorInterpolator : ADMTabIndicatorInterpolator

#pragma mark Package-Private

- (instancetype)initPackagePrivate;

- (void)updateIndicatorForOffsetWithADMTabLayout:(ADMTabLayout *)tabLayout
                                      withADView:(ADView *)startTitle
                                      withADView:(ADView *)endTitle
                                       withFloat:(jfloat)offset
                                  withADDrawable:(ADDrawable *)indicator;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMFadeTabIndicatorInterpolator)

FOUNDATION_EXPORT void ADMFadeTabIndicatorInterpolator_initPackagePrivate(ADMFadeTabIndicatorInterpolator *self);

FOUNDATION_EXPORT ADMFadeTabIndicatorInterpolator *new_ADMFadeTabIndicatorInterpolator_initPackagePrivate(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMFadeTabIndicatorInterpolator *create_ADMFadeTabIndicatorInterpolator_initPackagePrivate(void);

J2OBJC_TYPE_LITERAL_HEADER(ADMFadeTabIndicatorInterpolator)

@compatibility_alias ComGoogleAndroidMaterialTabsFadeTabIndicatorInterpolator ADMFadeTabIndicatorInterpolator;

#endif

#pragma pop_macro("INCLUDE_ALL_FadeTabIndicatorInterpolator")