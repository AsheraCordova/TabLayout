// start - imports

	
import CommandAttr from '../../widget/CommandAttr';
import IWidget from '../../widget/IWidget';
import ILayoutParam from '../../widget/ILayoutParam';
import {plainToClass, Type, Exclude, Expose, Transform} from "class-transformer";
import 'babel-polyfill';
import {Gravity} from '../../widget/TypeConstants';
import {ITranform, TransformerFactory} from '../../widget/TransformerFactory';
import {Event} from '../../app/Event';
import {MotionEvent} from '../../app/MotionEvent';
import {DragEvent} from '../../app/DragEvent';
import {KeyEvent} from '../../app/KeyEvent';
import { ScopedObject } from '../../app/ScopedObject';
import { Mixin, decorate } from 'ts-mixer';









// end - imports
import {ViewImpl} from './ViewImpl';
export abstract class TabItemImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "icon" }))
	icon!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "layout" }))
	layout!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "text" }))
	text!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "customTabTitleId" }))
	customTabTitleId!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "customTabiconId" }))
	customTabiconId!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.icon = undefined;
		this.layout = undefined;
		this.text = undefined;
		this.customTabTitleId = undefined;
		this.customTabiconId = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public tryGetIcon() : T {
		this.resetIfRequired();
		if (this.icon == null || this.icon == undefined) {
			this.icon = new CommandAttr<string>()
		}
		
		this.icon.setGetter(true);
		this.orderGet++;
		this.icon.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getIcon() : string {
		if (this.icon == null || this.icon == undefined) {
			this.icon = new CommandAttr<string>();
		}
		return this.icon.getCommandReturnValue();
	}
	public setIcon(value : string) : T {
		this.resetIfRequired();
		if (this.icon == null || this.icon == undefined) {
			this.icon = new CommandAttr<string>();
		}
		
		this.icon.setSetter(true);
		this.icon.setValue(value);
		this.orderSet++;
		this.icon.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLayout() : T {
		this.resetIfRequired();
		if (this.layout == null || this.layout == undefined) {
			this.layout = new CommandAttr<string>()
		}
		
		this.layout.setGetter(true);
		this.orderGet++;
		this.layout.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLayout() : string {
		if (this.layout == null || this.layout == undefined) {
			this.layout = new CommandAttr<string>();
		}
		return this.layout.getCommandReturnValue();
	}
	public setLayout(value : string) : T {
		this.resetIfRequired();
		if (this.layout == null || this.layout == undefined) {
			this.layout = new CommandAttr<string>();
		}
		
		this.layout.setSetter(true);
		this.layout.setValue(value);
		this.orderSet++;
		this.layout.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetText() : T {
		this.resetIfRequired();
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>()
		}
		
		this.text.setGetter(true);
		this.orderGet++;
		this.text.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getText() : string {
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>();
		}
		return this.text.getCommandReturnValue();
	}
	public setText(value : string) : T {
		this.resetIfRequired();
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>();
		}
		
		this.text.setSetter(true);
		this.text.setValue(value);
		this.orderSet++;
		this.text.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCustomTabTitleId() : T {
		this.resetIfRequired();
		if (this.customTabTitleId == null || this.customTabTitleId == undefined) {
			this.customTabTitleId = new CommandAttr<string>()
		}
		
		this.customTabTitleId.setGetter(true);
		this.orderGet++;
		this.customTabTitleId.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCustomTabTitleId() : string {
		if (this.customTabTitleId == null || this.customTabTitleId == undefined) {
			this.customTabTitleId = new CommandAttr<string>();
		}
		return this.customTabTitleId.getCommandReturnValue();
	}
	public setCustomTabTitleId(value : string) : T {
		this.resetIfRequired();
		if (this.customTabTitleId == null || this.customTabTitleId == undefined) {
			this.customTabTitleId = new CommandAttr<string>();
		}
		
		this.customTabTitleId.setSetter(true);
		this.customTabTitleId.setValue(value);
		this.orderSet++;
		this.customTabTitleId.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCustomTabiconId() : T {
		this.resetIfRequired();
		if (this.customTabiconId == null || this.customTabiconId == undefined) {
			this.customTabiconId = new CommandAttr<string>()
		}
		
		this.customTabiconId.setGetter(true);
		this.orderGet++;
		this.customTabiconId.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCustomTabiconId() : string {
		if (this.customTabiconId == null || this.customTabiconId == undefined) {
			this.customTabiconId = new CommandAttr<string>();
		}
		return this.customTabiconId.getCommandReturnValue();
	}
	public setCustomTabiconId(value : string) : T {
		this.resetIfRequired();
		if (this.customTabiconId == null || this.customTabiconId == undefined) {
			this.customTabiconId = new CommandAttr<string>();
		}
		
		this.customTabiconId.setSetter(true);
		this.customTabiconId.setValue(value);
		this.orderSet++;
		this.customTabiconId.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class TabItem extends TabItemImpl<TabItem> implements IWidget{
    getThisPointer(): TabItem {
        return this;
    }
    
   	public getClass() {
		return TabItem;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

TabItemImpl.initialize();

//end - staticinit
