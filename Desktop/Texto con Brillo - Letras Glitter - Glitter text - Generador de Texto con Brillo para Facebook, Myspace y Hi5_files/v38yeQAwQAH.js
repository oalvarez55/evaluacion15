/*1344958518,169775812*/

if (window.CavalryLogger) { CavalryLogger.start_js(["Z8\/nL"]); }

__d("FlipDirectionOnKeypress",["event-extensions","DOM","Input","Style"],function(a,b,c,d,e,f){b('event-extensions');var g=b('DOM'),h=b('Input'),i=b('Style');Event.listen(document.documentElement,'keyup',function(event){var j=event.getTarget();if(!g.isNodeOfType(j,['input','textarea']))return;if(g.isNodeOfType(j,'input')&&j.type=='password')return;if(j.getAttribute('data-prevent-auto-flip'))return;var k=h.getValue(j),l=(j.style&&j.style.direction);if(!l){var m=0,n=true;for(var o=0;o<k.length;o++){var p=k.charCodeAt(o);if(p>=48){if(n){n=false;m++;}if(p>=1470&&p<=1920){i.set(j,'direction','rtl');return;}if(m==5){i.set(j,'direction','ltr');return;}}else n=true;}}else if(k.length===0)i.set(j,'direction','');});});
__d("PluginLikeFlyout",["Arbiter","CSS","DOM","DOMEvent","DOMEventListener","Form","Plugin","copyProperties"],function(a,b,c,d,e,f){var g=b('Arbiter'),h=b('CSS'),i=b('DOM'),j=b('DOMEvent'),k=b('DOMEventListener'),l=b('Form'),m=b('Plugin'),n=b('copyProperties'),o=g.SUBSCRIBE_NEW,p=g.subscribe,q=g.inform,r=function(t,u){return k.add(t,'click',u);};function s(t,u,v,w){var x=this,y=p(m.CONNECT,function(event,z){g.unsubscribe(y);x.init(t,u,v,w);x.connect(event,z);},o);}n(s.prototype,{init:function(t,u,v,w){i.appendContent(t,JSON.parse(w));var x=i.find(t,'.pluginCommentFlyoutContent'),y=i.find(t,'.pluginCommentFlyoutPost'),z=i.find(t,'.pluginCommentFlyoutClose'),aa=(u==='tiny')?i.find(document.body,'.pluginLikeFlyoutPrompt'):null;this.form=t;this.post_button=y;this.prompt=aa;var ba=this.hide.bind(this),ca=this.show.bind(this);r(z,function(da){new j(da).kill();ba();});if(aa)r(aa,function(da){new j(da).kill();ca();});p(m.CONNECT,this.connect.bind(this),o);p(m.DISCONNECT,function(){ba();},o);p(s.SUCCESS,function(){ba();if(aa)h.hide(aa);},o);p(m.ERROR,function(event,da){if(da.action!=='comment')return;i.setContent(x,da.content);h.hide(y);},o);k.add(t,'submit',function(da){new j(da).kill();l.bootstrap(t);});},connect:function(event,t){if(t.crossFrame)return;if(this.prompt)return h.show(this.prompt);if(!t.story_fbid)this.show();},show:function(){h.show(this.form);h.show(this.post_button);q(s.SHOW);},hide:function(){h.hide(this.form);q(s.HIDE);}});n(s,{SUCCESS:'platform/plugins/like/flyout/success',SHOW:'platform/plugins/like/flyout/show',HIDE:'platform/plugins/like/flyout/hide',success:function(){q(this.SUCCESS);}});e.exports=s;});