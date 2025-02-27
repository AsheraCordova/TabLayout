//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJTablayout\src\main\java\com\google\android\material\tabs\FadeTabIndicatorInterpolator.java
//

#include "Drawable.h"
#include "FadeTabIndicatorInterpolator.h"
#include "J2ObjC_source.h"
#include "MaterialAnimationUtils.h"
#include "Rect.h"
#include "RectF.h"
#include "TabIndicatorInterpolator.h"
#include "TabLayout.h"
#include "View.h"


inline jfloat ADMFadeTabIndicatorInterpolator_get_FADE_THRESHOLD(void);
#define ADMFadeTabIndicatorInterpolator_FADE_THRESHOLD 0.5f
J2OBJC_STATIC_FIELD_CONSTANT(ADMFadeTabIndicatorInterpolator, FADE_THRESHOLD, jfloat)

@implementation ADMFadeTabIndicatorInterpolator

- (instancetype)initPackagePrivate {
  ADMFadeTabIndicatorInterpolator_initPackagePrivate(self);
  return self;
}

- (void)updateIndicatorForOffsetWithADMTabLayout:(ADMTabLayout *)tabLayout
                                      withADView:(ADView *)startTitle
                                      withADView:(ADView *)endTitle
                                       withFloat:(jfloat)offset
                                  withADDrawable:(ADDrawable *)indicator {
  ADView *tab = offset < ADMFadeTabIndicatorInterpolator_FADE_THRESHOLD ? startTitle : endTitle;
  ADRectF *bounds = ADMTabIndicatorInterpolator_calculateIndicatorWidthForTabWithADMTabLayout_withADView_(tabLayout, tab);
  jfloat alpha = offset < ADMFadeTabIndicatorInterpolator_FADE_THRESHOLD ? ADXMaterialAnimationUtils_lerpWithFloat_withFloat_withFloat_withFloat_withFloat_(1.0f, 0.0f, 0.0f, ADMFadeTabIndicatorInterpolator_FADE_THRESHOLD, offset) : ADXMaterialAnimationUtils_lerpWithFloat_withFloat_withFloat_withFloat_withFloat_(0.0f, 1.0f, ADMFadeTabIndicatorInterpolator_FADE_THRESHOLD, 1.0f, offset);
  [((ADDrawable *) nil_chk(indicator)) setBoundsWithInt:JreFpToInt(((ADRectF *) nil_chk(bounds))->left_) withInt:((ADRect *) nil_chk([indicator getBounds]))->top_ withInt:JreFpToInt(bounds->right_) withInt:((ADRect *) nil_chk([indicator getBounds]))->bottom_];
  [indicator setAlphaWithInt:JreFpToInt((alpha * 255.0f))];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initPackagePrivate);
  methods[1].selector = @selector(updateIndicatorForOffsetWithADMTabLayout:withADView:withADView:withFloat:withADDrawable:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "FADE_THRESHOLD", "F", .constantValue.asFloat = ADMFadeTabIndicatorInterpolator_FADE_THRESHOLD, 0x1a, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "updateIndicatorForOffset", "LADMTabLayout;LADView;LADView;FLADDrawable;" };
  static const J2ObjcClassInfo _ADMFadeTabIndicatorInterpolator = { "FadeTabIndicatorInterpolator", "com.google.android.material.tabs", ptrTable, methods, fields, 7, 0x0, 2, 1, -1, -1, -1, -1, -1 };
  return &_ADMFadeTabIndicatorInterpolator;
}

@end

void ADMFadeTabIndicatorInterpolator_initPackagePrivate(ADMFadeTabIndicatorInterpolator *self) {
  ADMTabIndicatorInterpolator_initPackagePrivate(self);
}

ADMFadeTabIndicatorInterpolator *new_ADMFadeTabIndicatorInterpolator_initPackagePrivate() {
  J2OBJC_NEW_IMPL(ADMFadeTabIndicatorInterpolator, initPackagePrivate)
}

ADMFadeTabIndicatorInterpolator *create_ADMFadeTabIndicatorInterpolator_initPackagePrivate() {
  J2OBJC_CREATE_IMPL(ADMFadeTabIndicatorInterpolator, initPackagePrivate)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADMFadeTabIndicatorInterpolator)
