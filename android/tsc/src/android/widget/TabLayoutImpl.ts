// start - imports

export const enum TabGravity {
fill = "fill",
center = "center",
start = "start",
}
export const enum TabIndicatorAnimationMode {
elastic = "elastic",
linear = "linear",
fade = "fade",
}
export const enum TabIndicatorGravity {
bottom = "bottom",
center = "center",
top = "top",
stretch = "stretch",
}
export const enum TabMode {
fixed = "fixed",
scrollable = "scrollable",
auto = "auto",
}	
import CommandAttr from '../../widget/CommandAttr';
import IWidget from '../../widget/IWidget';
import ILayoutParam from '../../widget/ILayoutParam';
import {plainToClass, Type, Exclude, Expose, Transform} from "class-transformer";
import {Gravity} from '../../widget/TypeConstants';
import {ITranform, TransformerFactory} from '../../widget/TransformerFactory';
import {Event} from '../../app/Event';
import {MotionEvent} from '../../app/MotionEvent';
import {DragEvent} from '../../app/DragEvent';
import {KeyEvent} from '../../app/KeyEvent';
import { ScopedObject } from '../../app/ScopedObject';
import { Mixin, decorate } from 'ts-mixer';












































import {ViewGroupImpl_LayoutParams} from './ViewGroupImpl';

// end - imports
export class MyTabItem {
	text!: string | undefined;
	id!: string | undefined | null;
	icon!: string | undefined | null;
	layout!: string | undefined | null;
	customTabTitleId!: string | undefined | null;
	customTabiconId!: string | undefined | null;
	where!: string | undefined| null;
}
import {ViewGroupImpl} from './ViewGroupImpl';
export abstract class TabLayoutImpl<T> extends ViewGroupImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeNumbers" }))
	badgeNumbers!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeBackgroundColors" }))
	badgeBackgroundColors!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeTextColors" }))
	badgeTextColors!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeAlphas" }))
	badgeAlphas!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeMaxCharacterCounts" }))
	badgeMaxCharacterCounts!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeGravities" }))
	badgeGravities!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeHorizontalOffsets" }))
	badgeHorizontalOffsets!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeVerticalOffsets" }))
	badgeVerticalOffsets!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeIsVisibles" }))
	badgeIsVisibles!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeTextAppearanceResources" }))
	badgeTextAppearanceResources!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabBackground" }))
	tabBackground!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabContentStart" }))
	tabContentStart!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabGravity" }))
	tabGravity!:CommandAttr<TabGravity>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabIndicatorAnimationMode" }))
	tabIndicatorAnimationMode!:CommandAttr<TabIndicatorAnimationMode>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabIndicatorColor" }))
	tabIndicatorColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabIndicatorFullWidth" }))
	tabIndicatorFullWidth!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabIndicatorGravity" }))
	tabIndicatorGravity!:CommandAttr<TabIndicatorGravity>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabIndicatorHeight" }))
	tabIndicatorHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabInlineLabel" }))
	tabInlineLabel!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabMaxWidth" }))
	tabMaxWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabMinWidth" }))
	tabMinWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabMode" }))
	tabMode!:CommandAttr<TabMode>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabPadding" }))
	tabPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabPaddingBottom" }))
	tabPaddingBottom!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabPaddingEnd" }))
	tabPaddingEnd!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabPaddingStart" }))
	tabPaddingStart!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabPaddingTop" }))
	tabPaddingTop!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabRippleColor" }))
	tabRippleColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabSelectedTextColor" }))
	tabSelectedTextColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabTextAppearance" }))
	tabTextAppearance!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabTextColor" }))
	tabTextColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "removeTab" }))
	removeTab_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "removeTabAt" }))
	removeTabAt_!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "removeAllTabs" }))
	removeAllTabs_!:CommandAttr<void>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onTabSelected" }))
	onTabSelected!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onTabUnselected" }))
	onTabUnselected!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onTabReselected" }))
	onTabReselected!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "addTab" }))
	addTab_!:CommandAttr<MyTabItem|MyTabItem[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tabIconTint" }))
	tabIconTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "selectTab" }))
	selectTab_!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "menuItemIds" }))
	menuItemIds!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "updateTabTexts" }))
	updateTabTexts_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "setupWithViewPager" }))
	setupWithViewPager_!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.badgeNumbers = undefined;
		this.badgeBackgroundColors = undefined;
		this.badgeTextColors = undefined;
		this.badgeAlphas = undefined;
		this.badgeMaxCharacterCounts = undefined;
		this.badgeGravities = undefined;
		this.badgeHorizontalOffsets = undefined;
		this.badgeVerticalOffsets = undefined;
		this.badgeIsVisibles = undefined;
		this.badgeTextAppearanceResources = undefined;
		this.tabBackground = undefined;
		this.tabContentStart = undefined;
		this.tabGravity = undefined;
		this.tabIndicatorAnimationMode = undefined;
		this.tabIndicatorColor = undefined;
		this.tabIndicatorFullWidth = undefined;
		this.tabIndicatorGravity = undefined;
		this.tabIndicatorHeight = undefined;
		this.tabInlineLabel = undefined;
		this.tabMaxWidth = undefined;
		this.tabMinWidth = undefined;
		this.tabMode = undefined;
		this.tabPadding = undefined;
		this.tabPaddingBottom = undefined;
		this.tabPaddingEnd = undefined;
		this.tabPaddingStart = undefined;
		this.tabPaddingTop = undefined;
		this.tabRippleColor = undefined;
		this.tabSelectedTextColor = undefined;
		this.tabTextAppearance = undefined;
		this.tabTextColor = undefined;
		this.removeTab_ = undefined;
		this.removeTabAt_ = undefined;
		this.removeAllTabs_ = undefined;
		this.onTabSelected = undefined;
		this.onTabUnselected = undefined;
		this.onTabReselected = undefined;
		this.addTab_ = undefined;
		this.tabIconTint = undefined;
		this.selectTab_ = undefined;
		this.menuItemIds = undefined;
		this.updateTabTexts_ = undefined;
		this.setupWithViewPager_ = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public setBadgeNumbers(value : string) : T {
		this.resetIfRequired();
		if (this.badgeNumbers == null || this.badgeNumbers == undefined) {
			this.badgeNumbers = new CommandAttr<string>();
		}
		
		this.badgeNumbers.setSetter(true);
		this.badgeNumbers.setValue(value);
		this.orderSet++;
		this.badgeNumbers.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBadgeBackgroundColors(value : string) : T {
		this.resetIfRequired();
		if (this.badgeBackgroundColors == null || this.badgeBackgroundColors == undefined) {
			this.badgeBackgroundColors = new CommandAttr<string>();
		}
		
		this.badgeBackgroundColors.setSetter(true);
		this.badgeBackgroundColors.setValue(value);
		this.orderSet++;
		this.badgeBackgroundColors.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBadgeTextColors(value : string) : T {
		this.resetIfRequired();
		if (this.badgeTextColors == null || this.badgeTextColors == undefined) {
			this.badgeTextColors = new CommandAttr<string>();
		}
		
		this.badgeTextColors.setSetter(true);
		this.badgeTextColors.setValue(value);
		this.orderSet++;
		this.badgeTextColors.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBadgeAlphas(value : string) : T {
		this.resetIfRequired();
		if (this.badgeAlphas == null || this.badgeAlphas == undefined) {
			this.badgeAlphas = new CommandAttr<string>();
		}
		
		this.badgeAlphas.setSetter(true);
		this.badgeAlphas.setValue(value);
		this.orderSet++;
		this.badgeAlphas.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBadgeMaxCharacterCounts(value : string) : T {
		this.resetIfRequired();
		if (this.badgeMaxCharacterCounts == null || this.badgeMaxCharacterCounts == undefined) {
			this.badgeMaxCharacterCounts = new CommandAttr<string>();
		}
		
		this.badgeMaxCharacterCounts.setSetter(true);
		this.badgeMaxCharacterCounts.setValue(value);
		this.orderSet++;
		this.badgeMaxCharacterCounts.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBadgeGravities(value : string) : T {
		this.resetIfRequired();
		if (this.badgeGravities == null || this.badgeGravities == undefined) {
			this.badgeGravities = new CommandAttr<string>();
		}
		
		this.badgeGravities.setSetter(true);
		this.badgeGravities.setValue(value);
		this.orderSet++;
		this.badgeGravities.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBadgeHorizontalOffsets(value : string) : T {
		this.resetIfRequired();
		if (this.badgeHorizontalOffsets == null || this.badgeHorizontalOffsets == undefined) {
			this.badgeHorizontalOffsets = new CommandAttr<string>();
		}
		
		this.badgeHorizontalOffsets.setSetter(true);
		this.badgeHorizontalOffsets.setValue(value);
		this.orderSet++;
		this.badgeHorizontalOffsets.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBadgeVerticalOffsets(value : string) : T {
		this.resetIfRequired();
		if (this.badgeVerticalOffsets == null || this.badgeVerticalOffsets == undefined) {
			this.badgeVerticalOffsets = new CommandAttr<string>();
		}
		
		this.badgeVerticalOffsets.setSetter(true);
		this.badgeVerticalOffsets.setValue(value);
		this.orderSet++;
		this.badgeVerticalOffsets.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBadgeIsVisibles(value : string) : T {
		this.resetIfRequired();
		if (this.badgeIsVisibles == null || this.badgeIsVisibles == undefined) {
			this.badgeIsVisibles = new CommandAttr<string>();
		}
		
		this.badgeIsVisibles.setSetter(true);
		this.badgeIsVisibles.setValue(value);
		this.orderSet++;
		this.badgeIsVisibles.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBadgeTextAppearanceResources(value : string) : T {
		this.resetIfRequired();
		if (this.badgeTextAppearanceResources == null || this.badgeTextAppearanceResources == undefined) {
			this.badgeTextAppearanceResources = new CommandAttr<string>();
		}
		
		this.badgeTextAppearanceResources.setSetter(true);
		this.badgeTextAppearanceResources.setValue(value);
		this.orderSet++;
		this.badgeTextAppearanceResources.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabBackground(value : string) : T {
		this.resetIfRequired();
		if (this.tabBackground == null || this.tabBackground == undefined) {
			this.tabBackground = new CommandAttr<string>();
		}
		
		this.tabBackground.setSetter(true);
		this.tabBackground.setValue(value);
		this.orderSet++;
		this.tabBackground.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabContentStart(value : string) : T {
		this.resetIfRequired();
		if (this.tabContentStart == null || this.tabContentStart == undefined) {
			this.tabContentStart = new CommandAttr<string>();
		}
		
		this.tabContentStart.setSetter(true);
		this.tabContentStart.setValue(value);
		this.orderSet++;
		this.tabContentStart.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabGravity(value : TabGravity) : T {
		this.resetIfRequired();
		if (this.tabGravity == null || this.tabGravity == undefined) {
			this.tabGravity = new CommandAttr<TabGravity>();
		}
		
		this.tabGravity.setSetter(true);
		this.tabGravity.setValue(value);
		this.orderSet++;
		this.tabGravity.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTabIndicatorAnimationMode() : T {
		this.resetIfRequired();
		if (this.tabIndicatorAnimationMode == null || this.tabIndicatorAnimationMode == undefined) {
			this.tabIndicatorAnimationMode = new CommandAttr<TabIndicatorAnimationMode>()
		}
		
		this.tabIndicatorAnimationMode.setGetter(true);
		this.orderGet++;
		this.tabIndicatorAnimationMode.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTabIndicatorAnimationMode() : TabIndicatorAnimationMode {
		if (this.tabIndicatorAnimationMode == null || this.tabIndicatorAnimationMode == undefined) {
			this.tabIndicatorAnimationMode = new CommandAttr<TabIndicatorAnimationMode>();
		}
		return this.tabIndicatorAnimationMode.getCommandReturnValue();
	}
	public setTabIndicatorAnimationMode(value : TabIndicatorAnimationMode) : T {
		this.resetIfRequired();
		if (this.tabIndicatorAnimationMode == null || this.tabIndicatorAnimationMode == undefined) {
			this.tabIndicatorAnimationMode = new CommandAttr<TabIndicatorAnimationMode>();
		}
		
		this.tabIndicatorAnimationMode.setSetter(true);
		this.tabIndicatorAnimationMode.setValue(value);
		this.orderSet++;
		this.tabIndicatorAnimationMode.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabIndicatorColor(value : string) : T {
		this.resetIfRequired();
		if (this.tabIndicatorColor == null || this.tabIndicatorColor == undefined) {
			this.tabIndicatorColor = new CommandAttr<string>();
		}
		
		this.tabIndicatorColor.setSetter(true);
		this.tabIndicatorColor.setValue(value);
		this.orderSet++;
		this.tabIndicatorColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabIndicatorFullWidth(value : boolean) : T {
		this.resetIfRequired();
		if (this.tabIndicatorFullWidth == null || this.tabIndicatorFullWidth == undefined) {
			this.tabIndicatorFullWidth = new CommandAttr<boolean>();
		}
		
		this.tabIndicatorFullWidth.setSetter(true);
		this.tabIndicatorFullWidth.setValue(value);
		this.orderSet++;
		this.tabIndicatorFullWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabIndicatorGravity(value : TabIndicatorGravity) : T {
		this.resetIfRequired();
		if (this.tabIndicatorGravity == null || this.tabIndicatorGravity == undefined) {
			this.tabIndicatorGravity = new CommandAttr<TabIndicatorGravity>();
		}
		
		this.tabIndicatorGravity.setSetter(true);
		this.tabIndicatorGravity.setValue(value);
		this.orderSet++;
		this.tabIndicatorGravity.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabIndicatorHeight(value : string) : T {
		this.resetIfRequired();
		if (this.tabIndicatorHeight == null || this.tabIndicatorHeight == undefined) {
			this.tabIndicatorHeight = new CommandAttr<string>();
		}
		
		this.tabIndicatorHeight.setSetter(true);
		this.tabIndicatorHeight.setValue(value);
		this.orderSet++;
		this.tabIndicatorHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabInlineLabel(value : boolean) : T {
		this.resetIfRequired();
		if (this.tabInlineLabel == null || this.tabInlineLabel == undefined) {
			this.tabInlineLabel = new CommandAttr<boolean>();
		}
		
		this.tabInlineLabel.setSetter(true);
		this.tabInlineLabel.setValue(value);
		this.orderSet++;
		this.tabInlineLabel.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabMaxWidth(value : string) : T {
		this.resetIfRequired();
		if (this.tabMaxWidth == null || this.tabMaxWidth == undefined) {
			this.tabMaxWidth = new CommandAttr<string>();
		}
		
		this.tabMaxWidth.setSetter(true);
		this.tabMaxWidth.setValue(value);
		this.orderSet++;
		this.tabMaxWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabMinWidth(value : string) : T {
		this.resetIfRequired();
		if (this.tabMinWidth == null || this.tabMinWidth == undefined) {
			this.tabMinWidth = new CommandAttr<string>();
		}
		
		this.tabMinWidth.setSetter(true);
		this.tabMinWidth.setValue(value);
		this.orderSet++;
		this.tabMinWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabMode(value : TabMode) : T {
		this.resetIfRequired();
		if (this.tabMode == null || this.tabMode == undefined) {
			this.tabMode = new CommandAttr<TabMode>();
		}
		
		this.tabMode.setSetter(true);
		this.tabMode.setValue(value);
		this.orderSet++;
		this.tabMode.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabPadding(value : string) : T {
		this.resetIfRequired();
		if (this.tabPadding == null || this.tabPadding == undefined) {
			this.tabPadding = new CommandAttr<string>();
		}
		
		this.tabPadding.setSetter(true);
		this.tabPadding.setValue(value);
		this.orderSet++;
		this.tabPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabPaddingBottom(value : string) : T {
		this.resetIfRequired();
		if (this.tabPaddingBottom == null || this.tabPaddingBottom == undefined) {
			this.tabPaddingBottom = new CommandAttr<string>();
		}
		
		this.tabPaddingBottom.setSetter(true);
		this.tabPaddingBottom.setValue(value);
		this.orderSet++;
		this.tabPaddingBottom.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabPaddingEnd(value : string) : T {
		this.resetIfRequired();
		if (this.tabPaddingEnd == null || this.tabPaddingEnd == undefined) {
			this.tabPaddingEnd = new CommandAttr<string>();
		}
		
		this.tabPaddingEnd.setSetter(true);
		this.tabPaddingEnd.setValue(value);
		this.orderSet++;
		this.tabPaddingEnd.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabPaddingStart(value : string) : T {
		this.resetIfRequired();
		if (this.tabPaddingStart == null || this.tabPaddingStart == undefined) {
			this.tabPaddingStart = new CommandAttr<string>();
		}
		
		this.tabPaddingStart.setSetter(true);
		this.tabPaddingStart.setValue(value);
		this.orderSet++;
		this.tabPaddingStart.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabPaddingTop(value : string) : T {
		this.resetIfRequired();
		if (this.tabPaddingTop == null || this.tabPaddingTop == undefined) {
			this.tabPaddingTop = new CommandAttr<string>();
		}
		
		this.tabPaddingTop.setSetter(true);
		this.tabPaddingTop.setValue(value);
		this.orderSet++;
		this.tabPaddingTop.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabRippleColor(value : string) : T {
		this.resetIfRequired();
		if (this.tabRippleColor == null || this.tabRippleColor == undefined) {
			this.tabRippleColor = new CommandAttr<string>();
		}
		
		this.tabRippleColor.setSetter(true);
		this.tabRippleColor.setValue(value);
		this.orderSet++;
		this.tabRippleColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabSelectedTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.tabSelectedTextColor == null || this.tabSelectedTextColor == undefined) {
			this.tabSelectedTextColor = new CommandAttr<string>();
		}
		
		this.tabSelectedTextColor.setSetter(true);
		this.tabSelectedTextColor.setValue(value);
		this.orderSet++;
		this.tabSelectedTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.tabTextAppearance == null || this.tabTextAppearance == undefined) {
			this.tabTextAppearance = new CommandAttr<string>();
		}
		
		this.tabTextAppearance.setSetter(true);
		this.tabTextAppearance.setValue(value);
		this.orderSet++;
		this.tabTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTabTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.tabTextColor == null || this.tabTextColor == undefined) {
			this.tabTextColor = new CommandAttr<string>();
		}
		
		this.tabTextColor.setSetter(true);
		this.tabTextColor.setValue(value);
		this.orderSet++;
		this.tabTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public removeTab(value : string) : T {
		this.resetIfRequired();
		if (this.removeTab_ == null || this.removeTab_ == undefined) {
			this.removeTab_ = new CommandAttr<string>();
		}
		
		this.removeTab_.setSetter(true);
		this.removeTab_.setValue(value);
		this.orderSet++;
		this.removeTab_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public removeTabAt(value : number) : T {
		this.resetIfRequired();
		if (this.removeTabAt_ == null || this.removeTabAt_ == undefined) {
			this.removeTabAt_ = new CommandAttr<number>();
		}
		
		this.removeTabAt_.setSetter(true);
		this.removeTabAt_.setValue(value);
		this.orderSet++;
		this.removeTabAt_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public removeAllTabs() : T {
		this.resetIfRequired();
		if (this.removeAllTabs_ == null || this.removeAllTabs_ == undefined) {
			this.removeAllTabs_ = new CommandAttr<void>();
		}
		
		this.removeAllTabs_.setSetter(true);
		
		this.orderSet++;
		this.removeAllTabs_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnTabSelected(value : string) : T {
		this.resetIfRequired();
		if (this.onTabSelected == null || this.onTabSelected == undefined) {
			this.onTabSelected = new CommandAttr<string>();
		}
		
		this.onTabSelected.setSetter(true);
		this.onTabSelected.setValue(value);
		this.orderSet++;
		this.onTabSelected.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnTabUnselected(value : string) : T {
		this.resetIfRequired();
		if (this.onTabUnselected == null || this.onTabUnselected == undefined) {
			this.onTabUnselected = new CommandAttr<string>();
		}
		
		this.onTabUnselected.setSetter(true);
		this.onTabUnselected.setValue(value);
		this.orderSet++;
		this.onTabUnselected.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnTabReselected(value : string) : T {
		this.resetIfRequired();
		if (this.onTabReselected == null || this.onTabReselected == undefined) {
			this.onTabReselected = new CommandAttr<string>();
		}
		
		this.onTabReselected.setSetter(true);
		this.onTabReselected.setValue(value);
		this.orderSet++;
		this.onTabReselected.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public addTab(text : string,
icon : string|null,
id : string|null,
layout : string|null,
customTabTitleId : string|null,
customTabiconId : string|null,
where : string|null) : T {
		this.resetIfRequired();
		if (this.addTab_ == null || this.addTab_ == undefined) {
			this.addTab_ = new CommandAttr<MyTabItem>();
		}
		
		let wrapper:MyTabItem = new MyTabItem();
		wrapper.text = text;
		wrapper.icon = icon;
		wrapper.id = id;
		wrapper.layout = layout;
		wrapper.customTabTitleId = customTabTitleId;
		wrapper.customTabiconId = customTabiconId;
		wrapper.where = where;
		this.addTab_.setSetter(true);
		this.addTab_.setValue(wrapper);	
		this.orderSet++;
		this.addTab_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	public addTabWithMyTabItem(...arr: MyTabItem[]) : T {
		this.resetIfRequired();
		if (this.addTab_ == null || this.addTab_ == undefined) {
			this.addTab_ = new CommandAttr<MyTabItem[]>();
		}
		
		this.addTab_.setSetter(true);
		this.addTab_.setValue(arr);	
		this.orderSet++;
		this.addTab_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}

	public setTabIconTint(value : string) : T {
		this.resetIfRequired();
		if (this.tabIconTint == null || this.tabIconTint == undefined) {
			this.tabIconTint = new CommandAttr<string>();
		}
		
		this.tabIconTint.setSetter(true);
		this.tabIconTint.setValue(value);
		this.orderSet++;
		this.tabIconTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public selectTab(value : number) : T {
		this.resetIfRequired();
		if (this.selectTab_ == null || this.selectTab_ == undefined) {
			this.selectTab_ = new CommandAttr<number>();
		}
		
		this.selectTab_.setSetter(true);
		this.selectTab_.setValue(value);
		this.orderSet++;
		this.selectTab_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setMenuItemIds(value : string) : T {
		this.resetIfRequired();
		if (this.menuItemIds == null || this.menuItemIds == undefined) {
			this.menuItemIds = new CommandAttr<string>();
		}
		
		this.menuItemIds.setSetter(true);
		this.menuItemIds.setValue(value);
		this.orderSet++;
		this.menuItemIds.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public updateTabTexts(value : string) : T {
		this.resetIfRequired();
		if (this.updateTabTexts_ == null || this.updateTabTexts_ == undefined) {
			this.updateTabTexts_ = new CommandAttr<string>();
		}
		
		this.updateTabTexts_.setSetter(true);
		this.updateTabTexts_.setValue(value);
		this.orderSet++;
		this.updateTabTexts_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setupWithViewPager(value : string) : T {
		this.resetIfRequired();
		if (this.setupWithViewPager_ == null || this.setupWithViewPager_ == undefined) {
			this.setupWithViewPager_ = new CommandAttr<string>();
		}
		
		this.setupWithViewPager_.setSetter(true);
		this.setupWithViewPager_.setValue(value);
		this.orderSet++;
		this.setupWithViewPager_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class TabLayout extends TabLayoutImpl<TabLayout> implements IWidget{
    getThisPointer(): TabLayout {
        return this;
    }
    
   	public getClass() {
		return TabLayout;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

TabLayoutImpl.initialize();
export interface OnTabSelectedEvent extends Event{
        //tab:Tab;


}
export interface OnTabUnselectedEvent extends Event{
        //tab:Tab;


}
export interface OnTabReselectedEvent extends Event{
        //tab:Tab;


}
export interface OnTabSelectedEvent extends Event{
        //tab:Tab;


}
export interface OnTabUnselectedEvent extends Event{
        //tab:Tab;


}
export interface OnTabReselectedEvent extends Event{
        //tab:Tab;


}
export interface OnTabSelectedEvent extends Event{
        //tab:Tab;


}
export interface OnTabUnselectedEvent extends Event{
        //tab:Tab;


}
export interface OnTabReselectedEvent extends Event{
        //tab:Tab;


}

//end - staticinit
