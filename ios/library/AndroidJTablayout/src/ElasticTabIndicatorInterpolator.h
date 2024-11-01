//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJTablayout\src\main\java\com\google\android\material\tabs\ElasticTabIndicatorInterpolator.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ElasticTabIndicatorInterpolator")
#ifdef RESTRICT_ElasticTabIndicatorInterpolator
#define INCLUDE_ALL_ElasticTabIndicatorInterpolator 0
#else
#define INCLUDE_ALL_ElasticTabIndicatorInterpolator 1
#endif
#undef RESTRICT_ElasticTabIndicatorInterpolator

#if !defined (ADMElasticTabIndicatorInterpolator_) && (INCLUDE_ALL_ElasticTabIndicatorInterpolator || defined(INCLUDE_ADMElasticTabIndicatorInterpolator))
#define ADMElasticTabIndicatorInterpolator_

#define RESTRICT_TabIndicatorInterpolator 1
#define INCLUDE_ADMTabIndicatorInterpolator 1
#include "TabIndicatorInterpolator.h"

@class ADDrawable;
@class ADMTabLayout;
@class ADView;

@interface ADMElasticTabIndicatorInterpolator : ADMTabIndicatorInterpolator

#pragma mark Package-Private

- (instancetype)initPackagePrivate;

- (void)updateIndicatorForOffsetWithADMTabLayout:(ADMTabLayout *)tabLayout
                                      withADView:(ADView *)startTitle
                                      withADView:(ADView *)endTitle
                                       withFloat:(jfloat)offset
                                  withADDrawable:(ADDrawable *)indicator;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMElasticTabIndicatorInterpolator)

FOUNDATION_EXPORT void ADMElasticTabIndicatorInterpolator_initPackagePrivate(ADMElasticTabIndicatorInterpolator *self);

FOUNDATION_EXPORT ADMElasticTabIndicatorInterpolator *new_ADMElasticTabIndicatorInterpolator_initPackagePrivate(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMElasticTabIndicatorInterpolator *create_ADMElasticTabIndicatorInterpolator_initPackagePrivate(void);

J2OBJC_TYPE_LITERAL_HEADER(ADMElasticTabIndicatorInterpolator)

@compatibility_alias ComGoogleAndroidMaterialTabsElasticTabIndicatorInterpolator ADMElasticTabIndicatorInterpolator;

#endif

#pragma pop_macro("INCLUDE_ALL_ElasticTabIndicatorInterpolator")
