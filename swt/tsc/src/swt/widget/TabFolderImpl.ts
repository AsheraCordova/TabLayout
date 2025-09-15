// start - imports

export const enum Font {
monospace = "monospace",
normal = "normal",
sans = "sans",
serif = "serif",
}
export const enum TextStyle {
bold = "bold",
italic = "italic",
normal = "normal",
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

















export class TextStyleTransformer implements ITranform {
    transform(value: any, obj: any, type: number) : any{
        if (type == 1) {
            return value.toString().replace(",", "|");
        } else {
            let strArray:Array<string> = value.toString().split("|");
            
            let valueArr:Array<TextStyle> = new Array<TextStyle>();
            for (let i =0; i < strArray.length; i++) {
                switch(strArray[i]) {
					case "bold":
						valueArr.push(TextStyle.bold);
                       	break;	
					case "italic":
						valueArr.push(TextStyle.italic);
                       	break;	
					case "normal":
						valueArr.push(TextStyle.normal);
                       	break;	
                }
                
            }
            return valueArr;
        }
    }
}



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
export abstract class TabFolderImpl<T> extends ViewGroupImpl<T>{
	//start - body
	static initialize() {
		TransformerFactory.getInstance().register("textStyle", new TextStyleTransformer());
    }	
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
	@decorate(Expose({ name: "updateTabTexts" }))
	updateTabTexts_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "setupWithViewPager" }))
	setupWithViewPager_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeNumbers" }))
	badgeNumbers!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "badgeIsVisibles" }))
	badgeIsVisibles!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "padSpaceCount" }))
	padSpaceCount!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "typeface" }))
	typeface!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textStyle" }))
	textStyle!:CommandAttr<TextStyle[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "fontFamily" }))
	fontFamily!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textSize" }))
	textSize!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "menuItemIds" }))
	menuItemIds!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.removeTab_ = undefined;
		this.removeTabAt_ = undefined;
		this.removeAllTabs_ = undefined;
		this.onTabSelected = undefined;
		this.onTabUnselected = undefined;
		this.onTabReselected = undefined;
		this.addTab_ = undefined;
		this.tabIconTint = undefined;
		this.selectTab_ = undefined;
		this.updateTabTexts_ = undefined;
		this.setupWithViewPager_ = undefined;
		this.badgeNumbers = undefined;
		this.badgeIsVisibles = undefined;
		this.padSpaceCount = undefined;
		this.typeface = undefined;
		this.textStyle = undefined;
		this.fontFamily = undefined;
		this.textSize = undefined;
		this.menuItemIds = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
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
		

	public setPadSpaceCount(value : number) : T {
		this.resetIfRequired();
		if (this.padSpaceCount == null || this.padSpaceCount == undefined) {
			this.padSpaceCount = new CommandAttr<number>();
		}
		
		this.padSpaceCount.setSetter(true);
		this.padSpaceCount.setValue(value);
		this.orderSet++;
		this.padSpaceCount.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTypeface(value : string) : T {
		this.resetIfRequired();
		if (this.typeface == null || this.typeface == undefined) {
			this.typeface = new CommandAttr<string>();
		}
		
		this.typeface.setSetter(true);
		this.typeface.setValue(value);
		this.orderSet++;
		this.typeface.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextStyle(...value : TextStyle[]) : T {
		this.resetIfRequired();
		if (this.textStyle == null || this.textStyle == undefined) {
			this.textStyle = new CommandAttr<TextStyle[]>();
		}
		
		this.textStyle.setSetter(true);
		this.textStyle.setValue(value);
		this.orderSet++;
		this.textStyle.setOrderSet(this.orderSet);
this.textStyle.setTransformer('textStyle');		return this.thisPointer;
	}
		

	public setFontFamily(value : string) : T {
		this.resetIfRequired();
		if (this.fontFamily == null || this.fontFamily == undefined) {
			this.fontFamily = new CommandAttr<string>();
		}
		
		this.fontFamily.setSetter(true);
		this.fontFamily.setValue(value);
		this.orderSet++;
		this.fontFamily.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextSize() : T {
		this.resetIfRequired();
		if (this.textSize == null || this.textSize == undefined) {
			this.textSize = new CommandAttr<string>()
		}
		
		this.textSize.setGetter(true);
		this.orderGet++;
		this.textSize.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextSize() : string {
		if (this.textSize == null || this.textSize == undefined) {
			this.textSize = new CommandAttr<string>();
		}
		return this.textSize.getCommandReturnValue();
	}
	public setTextSize(value : string) : T {
		this.resetIfRequired();
		if (this.textSize == null || this.textSize == undefined) {
			this.textSize = new CommandAttr<string>();
		}
		
		this.textSize.setSetter(true);
		this.textSize.setValue(value);
		this.orderSet++;
		this.textSize.setOrderSet(this.orderSet);
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
		
	//end - body

}
	
//start - staticinit

export class TabFolder extends TabFolderImpl<TabFolder> implements IWidget{
    getThisPointer(): TabFolder {
        return this;
    }
    
   	public getClass() {
		return TabFolder;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

TabFolderImpl.initialize();
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
