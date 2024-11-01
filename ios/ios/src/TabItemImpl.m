//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSTabLayoutPlugin\src\main\java\com\ashera\tablayout\TabItemImpl.java
//

#include "BaseWidget.h"
#include "HasWidgets.h"
#include "IFragment.h"
#include "ILifeCycleDecorator.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "TabItemImpl.h"
#include "View.h"
#include "ViewImpl.h"
#include "WidgetAttribute.h"
#include "WidgetFactory.h"
#include "java/util/HashMap.h"
#include "java/util/Map.h"

#include <UIKit/UIKit.h>
#include "ASUIView.h"

@protocol JavaUtilMap;


@interface ASTabItemImpl () {
 @public
  ADView *viewStub_;
  id text_;
  id layout_;
  id icon_;
  id tabItemid_;
  id customTabTitleId_;
  id customTabiconId_;
}

- (void)nativeCreateWithASIFragment:(id<ASIFragment>)fragment
                    withJavaUtilMap:(id<JavaUtilMap>)params;

@end

J2OBJC_FIELD_SETTER(ASTabItemImpl, viewStub_, ADView *)
J2OBJC_FIELD_SETTER(ASTabItemImpl, text_, id)
J2OBJC_FIELD_SETTER(ASTabItemImpl, layout_, id)
J2OBJC_FIELD_SETTER(ASTabItemImpl, icon_, id)
J2OBJC_FIELD_SETTER(ASTabItemImpl, tabItemid_, id)
J2OBJC_FIELD_SETTER(ASTabItemImpl, customTabTitleId_, id)
J2OBJC_FIELD_SETTER(ASTabItemImpl, customTabiconId_, id)

__attribute__((unused)) static void ASTabItemImpl_nativeCreateWithASIFragment_withJavaUtilMap_(ASTabItemImpl *self, id<ASIFragment> fragment, id<JavaUtilMap> params);

@interface ASTabItemImpl_ViewExt () {
 @public
  ASTabItemImpl *this$0_;
  id<JavaUtilMap> templates_;
}

@end

J2OBJC_FIELD_SETTER(ASTabItemImpl_ViewExt, templates_, id<JavaUtilMap>)

NSString *ASTabItemImpl_LOCAL_NAME = @"com.google.android.material.tabs.TabItem";
NSString *ASTabItemImpl_GROUP_NAME = @"com.google.android.material.tabs.TabItem";

@implementation ASTabItemImpl

@synthesize uiView = uiView_;

- (void)loadAttributesWithNSString:(NSString *)attributeName {
  ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_Builder_(localName_, [((ASWidgetAttribute_Builder *) nil_chk([((ASWidgetAttribute_Builder *) nil_chk([new_ASWidgetAttribute_Builder_init() withNameWithNSString:@"icon"])) withTypeWithNSString:@"drawable"])) withUiFlagWithInt:ASIWidget_UPDATE_UI_REQUEST_LAYOUT]);
  ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_Builder_(localName_, [((ASWidgetAttribute_Builder *) nil_chk([((ASWidgetAttribute_Builder *) nil_chk([new_ASWidgetAttribute_Builder_init() withNameWithNSString:@"layout"])) withTypeWithNSString:@"template"])) withUiFlagWithInt:ASIWidget_UPDATE_UI_REQUEST_LAYOUT]);
  ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_Builder_(localName_, [((ASWidgetAttribute_Builder *) nil_chk([((ASWidgetAttribute_Builder *) nil_chk([new_ASWidgetAttribute_Builder_init() withNameWithNSString:@"text"])) withTypeWithNSString:@"resourcestring"])) withUiFlagWithInt:ASIWidget_UPDATE_UI_REQUEST_LAYOUT]);
  ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_Builder_(localName_, [((ASWidgetAttribute_Builder *) nil_chk([((ASWidgetAttribute_Builder *) nil_chk([new_ASWidgetAttribute_Builder_init() withNameWithNSString:@"id"])) withTypeWithNSString:@"id"])) withUiFlagWithInt:ASIWidget_UPDATE_UI_REQUEST_LAYOUT]);
  ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_Builder_(localName_, [((ASWidgetAttribute_Builder *) nil_chk([((ASWidgetAttribute_Builder *) nil_chk([new_ASWidgetAttribute_Builder_init() withNameWithNSString:@"customTabTitleId"])) withTypeWithNSString:@"string"])) withUiFlagWithInt:ASIWidget_UPDATE_UI_REQUEST_LAYOUT]);
  ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_Builder_(localName_, [((ASWidgetAttribute_Builder *) nil_chk([((ASWidgetAttribute_Builder *) nil_chk([new_ASWidgetAttribute_Builder_init() withNameWithNSString:@"customTabiconId"])) withTypeWithNSString:@"string"])) withUiFlagWithInt:ASIWidget_UPDATE_UI_REQUEST_LAYOUT]);
}

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASTabItemImpl_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (id<ASIWidget>)newInstance {
  return new_ASTabItemImpl_init();
}

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params {
  [super createWithASIFragment:fragment withJavaUtilMap:params];
  viewStub_ = new_ASTabItemImpl_ViewExt_initWithASTabItemImpl_(self);
  [self createView];
  ASViewImpl_nativeMakeFrameWithId_withInt_withInt_withInt_withInt_(uiView_, 0, 0, 0, 0);
  ASTabItemImpl_nativeCreateWithASIFragment_withJavaUtilMap_(self, fragment, params);
}

- (void)createView {
  ASUIView* uiView = [ASUIView new];
  uiView.backgroundColor = [UIColor clearColor];
  uiView_ = uiView;
}

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator {
  id nativeWidget = [self asNativeWidget];
  switch (JreIndexOfStr([((ASWidgetAttribute *) nil_chk(key)) getAttributeName], (id[]){ @"icon", @"layout", @"text", @"id", @"customTabTitleId", @"customTabiconId" }, 6)) {
    case 0:
    {
      [self setIconWithId:objValue];
    }
    break;
    case 1:
    {
      [self setLayoutWithId:objValue];
    }
    break;
    case 2:
    {
      [self setTextWithId:objValue];
    }
    break;
    case 3:
    {
      [self setTabItemidWithId:objValue];
    }
    break;
    case 4:
    {
      [self setCustomTabTitleIdWithId:objValue];
    }
    break;
    case 5:
    {
      [self setCustomTabiconIdWithId:objValue];
    }
    break;
    default:
    break;
  }
}

- (id)asWidget {
  return viewStub_;
}

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator {
  id nativeWidget = [self asNativeWidget];
  switch (JreIndexOfStr([((ASWidgetAttribute *) nil_chk(key)) getAttributeName], (id[]){ @"icon", @"layout", @"text", @"id", @"customTabTitleId", @"customTabiconId" }, 6)) {
    case 0:
    {
      return [self getIcon];
    }
    case 1:
    {
      return [self getLayout];
    }
    case 2:
    {
      return [self getText];
    }
    case 3:
    {
      return [self getTabItemid];
    }
    case 4:
    {
      return [self getCustomTabTitleId];
    }
    case 5:
    {
      return [self getCustomTabiconId];
    }
  }
  return nil;
}

- (id)getCustomTabTitleId {
  return customTabTitleId_;
}

- (void)setCustomTabTitleIdWithId:(id)customTabTitleId {
  self->customTabTitleId_ = customTabTitleId;
}

- (id)getCustomTabiconId {
  return customTabiconId_;
}

- (void)setCustomTabiconIdWithId:(id)customTabiconId {
  self->customTabiconId_ = customTabiconId;
}

- (id)getTabItemid {
  return tabItemid_;
}

- (void)setTabItemidWithId:(id)tabItemid {
  self->tabItemid_ = tabItemid;
}

- (id)getText {
  return text_;
}

- (void)setTextWithId:(id)text {
  self->text_ = text;
}

- (id)getLayout {
  return layout_;
}

- (void)setLayoutWithId:(id)layout {
  self->layout_ = layout;
}

- (id)getIcon {
  return icon_;
}

- (void)setIconWithId:(id)icon {
  self->icon_ = icon;
}

- (id)asNativeWidget {
  return uiView_;
}

- (void)nativeCreateWithASIFragment:(id<ASIFragment>)fragment
                    withJavaUtilMap:(id<JavaUtilMap>)params {
  ASTabItemImpl_nativeCreateWithASIFragment_withJavaUtilMap_(self, fragment, params);
}

- (IOSClass *)getViewClass {
  return ADView_class_();
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIWidget;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 2, 3, -1, 4, -1, -1 },
    { NULL, "V", 0x101, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 7, 8, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 9, 10, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 11, 10, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 12, 10, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 13, 10, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 14, 10, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 15, 10, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x2, 16, 3, -1, 4, -1, -1 },
    { NULL, "LIOSClass;", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(loadAttributesWithNSString:);
  methods[1].selector = @selector(init);
  methods[2].selector = @selector(newInstance);
  methods[3].selector = @selector(createWithASIFragment:withJavaUtilMap:);
  methods[4].selector = @selector(createView);
  methods[5].selector = @selector(setAttributeWithASWidgetAttribute:withNSString:withId:withASILifeCycleDecorator:);
  methods[6].selector = @selector(asWidget);
  methods[7].selector = @selector(getAttributeWithASWidgetAttribute:withASILifeCycleDecorator:);
  methods[8].selector = @selector(getCustomTabTitleId);
  methods[9].selector = @selector(setCustomTabTitleIdWithId:);
  methods[10].selector = @selector(getCustomTabiconId);
  methods[11].selector = @selector(setCustomTabiconIdWithId:);
  methods[12].selector = @selector(getTabItemid);
  methods[13].selector = @selector(setTabItemidWithId:);
  methods[14].selector = @selector(getText);
  methods[15].selector = @selector(setTextWithId:);
  methods[16].selector = @selector(getLayout);
  methods[17].selector = @selector(setLayoutWithId:);
  methods[18].selector = @selector(getIcon);
  methods[19].selector = @selector(setIconWithId:);
  methods[20].selector = @selector(asNativeWidget);
  methods[21].selector = @selector(nativeCreateWithASIFragment:withJavaUtilMap:);
  methods[22].selector = @selector(getViewClass);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "viewStub_", "LADView;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "uiView_", "LNSObject;", .constantValue.asLong = 0, 0x4, -1, -1, -1, -1 },
    { "LOCAL_NAME", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 17, -1, -1 },
    { "GROUP_NAME", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 18, -1, -1 },
    { "text_", "LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "layout_", "LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "icon_", "LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "tabItemid_", "LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "customTabTitleId_", "LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "customTabiconId_", "LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "loadAttributes", "LNSString;", "create", "LASIFragment;LJavaUtilMap;", "(Lcom/ashera/core/IFragment;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", "setAttribute", "LASWidgetAttribute;LNSString;LNSObject;LASILifeCycleDecorator;", "getAttribute", "LASWidgetAttribute;LASILifeCycleDecorator;", "setCustomTabTitleId", "LNSObject;", "setCustomTabiconId", "setTabItemid", "setText", "setLayout", "setIcon", "nativeCreate", &ASTabItemImpl_LOCAL_NAME, &ASTabItemImpl_GROUP_NAME, "LASTabItemImpl_ViewExt;" };
  static const J2ObjcClassInfo _ASTabItemImpl = { "TabItemImpl", "com.ashera.tablayout", ptrTable, methods, fields, 7, 0x1, 23, 10, -1, 19, -1, -1, -1 };
  return &_ASTabItemImpl;
}

@end

void ASTabItemImpl_init(ASTabItemImpl *self) {
  ASBaseWidget_initWithNSString_withNSString_(self, ASTabItemImpl_LOCAL_NAME, ASTabItemImpl_LOCAL_NAME);
}

ASTabItemImpl *new_ASTabItemImpl_init() {
  J2OBJC_NEW_IMPL(ASTabItemImpl, init)
}

ASTabItemImpl *create_ASTabItemImpl_init() {
  J2OBJC_CREATE_IMPL(ASTabItemImpl, init)
}

void ASTabItemImpl_nativeCreateWithASIFragment_withJavaUtilMap_(ASTabItemImpl *self, id<ASIFragment> fragment, id<JavaUtilMap> params) {
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASTabItemImpl)

@implementation ASTabItemImpl_ViewExt

- (instancetype)initWithASTabItemImpl:(ASTabItemImpl *)outer$ {
  ASTabItemImpl_ViewExt_initWithASTabItemImpl_(self, outer$);
  return self;
}

- (void)remeasure {
  if ([this$0_ getFragment] != nil) {
    [((id<ASIFragment>) nil_chk([this$0_ getFragment])) remeasure];
  }
}

- (ADView *)inflateViewWithNSString:(NSString *)layout {
  if (templates_ == nil) {
    templates_ = new_JavaUtilHashMap_init();
  }
  id<ASIWidget> template_ = [templates_ getWithId:layout];
  if (template_ == nil) {
    template_ = (id<ASIWidget>) cast_check([this$0_ quickConvertWithId:layout withNSString:@"template"], ASIWidget_class_());
    (void) [((id<JavaUtilMap>) nil_chk(templates_)) putWithId:layout withId:template_];
  }
  id<ASIWidget> widget = [((id<ASIWidget>) nil_chk(template_)) loadLazyWidgetsWithASHasWidgets:[this$0_ getParent]];
  return (ADView *) cast_chk([((id<ASIWidget>) nil_chk(widget)) asWidget], [ADView class]);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADView;", 0x1, 1, 2, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithASTabItemImpl:);
  methods[1].selector = @selector(remeasure);
  methods[2].selector = @selector(inflateViewWithNSString:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "this$0_", "LASTabItemImpl;", .constantValue.asLong = 0, 0x1012, -1, -1, -1, -1 },
    { "templates_", "LJavaUtilMap;", .constantValue.asLong = 0, 0x2, -1, -1, 3, -1 },
  };
  static const void *ptrTable[] = { "LASTabItemImpl;", "inflateView", "LNSString;", "Ljava/util/Map<Ljava/lang/String;Lcom/ashera/widget/IWidget;>;" };
  static const J2ObjcClassInfo _ASTabItemImpl_ViewExt = { "ViewExt", "com.ashera.tablayout", ptrTable, methods, fields, 7, 0x1, 3, 2, 0, -1, -1, -1, -1 };
  return &_ASTabItemImpl_ViewExt;
}

@end

void ASTabItemImpl_ViewExt_initWithASTabItemImpl_(ASTabItemImpl_ViewExt *self, ASTabItemImpl *outer$) {
  self->this$0_ = outer$;
  ADView_init(self);
}

ASTabItemImpl_ViewExt *new_ASTabItemImpl_ViewExt_initWithASTabItemImpl_(ASTabItemImpl *outer$) {
  J2OBJC_NEW_IMPL(ASTabItemImpl_ViewExt, initWithASTabItemImpl_, outer$)
}

ASTabItemImpl_ViewExt *create_ASTabItemImpl_ViewExt_initWithASTabItemImpl_(ASTabItemImpl *outer$) {
  J2OBJC_CREATE_IMPL(ASTabItemImpl_ViewExt, initWithASTabItemImpl_, outer$)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASTabItemImpl_ViewExt)