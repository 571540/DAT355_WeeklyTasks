package stateMachine.xtext.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import stateMachine.xtext.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state-machine'", "'starts-at'", "'{'", "'}'", "'state'", "'in'", "'out'", "'transition'", "'sec'", "':'", "'>'", "'.'", "'-'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStateMachine"
    // InternalMyDsl.g:54:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalMyDsl.g:55:1: ( ruleStateMachine EOF )
            // InternalMyDsl.g:56:1: ruleStateMachine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStateMachine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalMyDsl.g:63:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:67:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // InternalMyDsl.g:68:2: ( ( rule__StateMachine__Group__0 ) )
            {
            // InternalMyDsl.g:68:2: ( ( rule__StateMachine__Group__0 ) )
            // InternalMyDsl.g:69:3: ( rule__StateMachine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getGroup()); 
            }
            // InternalMyDsl.g:70:3: ( rule__StateMachine__Group__0 )
            // InternalMyDsl.g:70:4: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:79:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMyDsl.g:80:1: ( ruleState EOF )
            // InternalMyDsl.g:81:1: ruleState EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:88:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:92:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalMyDsl.g:93:2: ( ( rule__State__Group__0 ) )
            {
            // InternalMyDsl.g:93:2: ( ( rule__State__Group__0 ) )
            // InternalMyDsl.g:94:3: ( rule__State__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getGroup()); 
            }
            // InternalMyDsl.g:95:3: ( rule__State__Group__0 )
            // InternalMyDsl.g:95:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:104:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMyDsl.g:105:1: ( ruleTransition EOF )
            // InternalMyDsl.g:106:1: ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:113:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:117:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMyDsl.g:118:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMyDsl.g:118:2: ( ( rule__Transition__Group__0 ) )
            // InternalMyDsl.g:119:3: ( rule__Transition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup()); 
            }
            // InternalMyDsl.g:120:3: ( rule__Transition__Group__0 )
            // InternalMyDsl.g:120:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTimeEvent"
    // InternalMyDsl.g:129:1: entryRuleTimeEvent : ruleTimeEvent EOF ;
    public final void entryRuleTimeEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:130:1: ( ruleTimeEvent EOF )
            // InternalMyDsl.g:131:1: ruleTimeEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTimeEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeEvent"


    // $ANTLR start "ruleTimeEvent"
    // InternalMyDsl.g:138:1: ruleTimeEvent : ( ( rule__TimeEvent__TimeAssignment ) ) ;
    public final void ruleTimeEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:142:2: ( ( ( rule__TimeEvent__TimeAssignment ) ) )
            // InternalMyDsl.g:143:2: ( ( rule__TimeEvent__TimeAssignment ) )
            {
            // InternalMyDsl.g:143:2: ( ( rule__TimeEvent__TimeAssignment ) )
            // InternalMyDsl.g:144:3: ( rule__TimeEvent__TimeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeEventAccess().getTimeAssignment()); 
            }
            // InternalMyDsl.g:145:3: ( rule__TimeEvent__TimeAssignment )
            // InternalMyDsl.g:145:4: rule__TimeEvent__TimeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TimeEvent__TimeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeEventAccess().getTimeAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeEvent"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMyDsl.g:154:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMyDsl.g:155:1: ( ruleQualifiedName EOF )
            // InternalMyDsl.g:156:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMyDsl.g:163:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:167:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMyDsl.g:168:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMyDsl.g:168:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMyDsl.g:169:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalMyDsl.g:170:3: ( rule__QualifiedName__Group__0 )
            // InternalMyDsl.g:170:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:179:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:180:1: ( ruleEInt EOF )
            // InternalMyDsl.g:181:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:188:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:192:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:193:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:193:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:194:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalMyDsl.g:195:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:195:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__StateMachine__Group__0"
    // InternalMyDsl.g:203:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:207:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // InternalMyDsl.g:208:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // InternalMyDsl.g:215:1: rule__StateMachine__Group__0__Impl : ( 'state-machine' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:219:1: ( ( 'state-machine' ) )
            // InternalMyDsl.g:220:1: ( 'state-machine' )
            {
            // InternalMyDsl.g:220:1: ( 'state-machine' )
            // InternalMyDsl.g:221:2: 'state-machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // InternalMyDsl.g:230:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:234:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // InternalMyDsl.g:235:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // InternalMyDsl.g:242:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__NameAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:246:1: ( ( ( rule__StateMachine__NameAssignment_1 ) ) )
            // InternalMyDsl.g:247:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:247:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            // InternalMyDsl.g:248:2: ( rule__StateMachine__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:249:2: ( rule__StateMachine__NameAssignment_1 )
            // InternalMyDsl.g:249:3: rule__StateMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // InternalMyDsl.g:257:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:261:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // InternalMyDsl.g:262:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // InternalMyDsl.g:269:1: rule__StateMachine__Group__2__Impl : ( 'starts-at' ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:1: ( ( 'starts-at' ) )
            // InternalMyDsl.g:274:1: ( 'starts-at' )
            {
            // InternalMyDsl.g:274:1: ( 'starts-at' )
            // InternalMyDsl.g:275:2: 'starts-at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getStartsAtKeyword_2()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getStartsAtKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // InternalMyDsl.g:284:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:288:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // InternalMyDsl.g:289:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // InternalMyDsl.g:296:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__StartAssignment_3 ) ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:300:1: ( ( ( rule__StateMachine__StartAssignment_3 ) ) )
            // InternalMyDsl.g:301:1: ( ( rule__StateMachine__StartAssignment_3 ) )
            {
            // InternalMyDsl.g:301:1: ( ( rule__StateMachine__StartAssignment_3 ) )
            // InternalMyDsl.g:302:2: ( rule__StateMachine__StartAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getStartAssignment_3()); 
            }
            // InternalMyDsl.g:303:2: ( rule__StateMachine__StartAssignment_3 )
            // InternalMyDsl.g:303:3: rule__StateMachine__StartAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StartAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getStartAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // InternalMyDsl.g:311:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:315:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // InternalMyDsl.g:316:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // InternalMyDsl.g:323:1: rule__StateMachine__Group__4__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:327:1: ( ( '{' ) )
            // InternalMyDsl.g:328:1: ( '{' )
            {
            // InternalMyDsl.g:328:1: ( '{' )
            // InternalMyDsl.g:329:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // InternalMyDsl.g:338:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:342:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // InternalMyDsl.g:343:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // InternalMyDsl.g:350:1: rule__StateMachine__Group__5__Impl : ( ( rule__StateMachine__StatesAssignment_5 )* ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:354:1: ( ( ( rule__StateMachine__StatesAssignment_5 )* ) )
            // InternalMyDsl.g:355:1: ( ( rule__StateMachine__StatesAssignment_5 )* )
            {
            // InternalMyDsl.g:355:1: ( ( rule__StateMachine__StatesAssignment_5 )* )
            // InternalMyDsl.g:356:2: ( rule__StateMachine__StatesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getStatesAssignment_5()); 
            }
            // InternalMyDsl.g:357:2: ( rule__StateMachine__StatesAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:357:3: rule__StateMachine__StatesAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StateMachine__StatesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getStatesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // InternalMyDsl.g:365:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:369:1: ( rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 )
            // InternalMyDsl.g:370:2: rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // InternalMyDsl.g:377:1: rule__StateMachine__Group__6__Impl : ( ( rule__StateMachine__TransitionsAssignment_6 )* ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:381:1: ( ( ( rule__StateMachine__TransitionsAssignment_6 )* ) )
            // InternalMyDsl.g:382:1: ( ( rule__StateMachine__TransitionsAssignment_6 )* )
            {
            // InternalMyDsl.g:382:1: ( ( rule__StateMachine__TransitionsAssignment_6 )* )
            // InternalMyDsl.g:383:2: ( rule__StateMachine__TransitionsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_6()); 
            }
            // InternalMyDsl.g:384:2: ( rule__StateMachine__TransitionsAssignment_6 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:384:3: rule__StateMachine__TransitionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StateMachine__TransitionsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__StateMachine__Group__7"
    // InternalMyDsl.g:392:1: rule__StateMachine__Group__7 : rule__StateMachine__Group__7__Impl ;
    public final void rule__StateMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:396:1: ( rule__StateMachine__Group__7__Impl )
            // InternalMyDsl.g:397:2: rule__StateMachine__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7"


    // $ANTLR start "rule__StateMachine__Group__7__Impl"
    // InternalMyDsl.g:403:1: rule__StateMachine__Group__7__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( '}' ) )
            // InternalMyDsl.g:408:1: ( '}' )
            {
            // InternalMyDsl.g:408:1: ( '}' )
            // InternalMyDsl.g:409:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalMyDsl.g:419:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMyDsl.g:424:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalMyDsl.g:431:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:435:1: ( ( 'state' ) )
            // InternalMyDsl.g:436:1: ( 'state' )
            {
            // InternalMyDsl.g:436:1: ( 'state' )
            // InternalMyDsl.g:437:2: 'state'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalMyDsl.g:446:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:450:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalMyDsl.g:451:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalMyDsl.g:458:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:462:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalMyDsl.g:463:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:463:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalMyDsl.g:464:2: ( rule__State__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:465:2: ( rule__State__NameAssignment_1 )
            // InternalMyDsl.g:465:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalMyDsl.g:473:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:477:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalMyDsl.g:478:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalMyDsl.g:485:1: rule__State__Group__2__Impl : ( 'in' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:489:1: ( ( 'in' ) )
            // InternalMyDsl.g:490:1: ( 'in' )
            {
            // InternalMyDsl.g:490:1: ( 'in' )
            // InternalMyDsl.g:491:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getInKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getInKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalMyDsl.g:500:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:504:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalMyDsl.g:505:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__State__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalMyDsl.g:512:1: rule__State__Group__3__Impl : ( ( rule__State__IncommingAssignment_3 ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:1: ( ( ( rule__State__IncommingAssignment_3 ) ) )
            // InternalMyDsl.g:517:1: ( ( rule__State__IncommingAssignment_3 ) )
            {
            // InternalMyDsl.g:517:1: ( ( rule__State__IncommingAssignment_3 ) )
            // InternalMyDsl.g:518:2: ( rule__State__IncommingAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIncommingAssignment_3()); 
            }
            // InternalMyDsl.g:519:2: ( rule__State__IncommingAssignment_3 )
            // InternalMyDsl.g:519:3: rule__State__IncommingAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__State__IncommingAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIncommingAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalMyDsl.g:527:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalMyDsl.g:532:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalMyDsl.g:539:1: rule__State__Group__4__Impl : ( 'out' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:543:1: ( ( 'out' ) )
            // InternalMyDsl.g:544:1: ( 'out' )
            {
            // InternalMyDsl.g:544:1: ( 'out' )
            // InternalMyDsl.g:545:2: 'out'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getOutKeyword_4()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getOutKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalMyDsl.g:554:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:1: ( rule__State__Group__5__Impl )
            // InternalMyDsl.g:559:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalMyDsl.g:565:1: rule__State__Group__5__Impl : ( ( rule__State__OutgoingAssignment_5 ) ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( ( rule__State__OutgoingAssignment_5 ) ) )
            // InternalMyDsl.g:570:1: ( ( rule__State__OutgoingAssignment_5 ) )
            {
            // InternalMyDsl.g:570:1: ( ( rule__State__OutgoingAssignment_5 ) )
            // InternalMyDsl.g:571:2: ( rule__State__OutgoingAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getOutgoingAssignment_5()); 
            }
            // InternalMyDsl.g:572:2: ( rule__State__OutgoingAssignment_5 )
            // InternalMyDsl.g:572:3: rule__State__OutgoingAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__State__OutgoingAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getOutgoingAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalMyDsl.g:581:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:585:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMyDsl.g:586:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalMyDsl.g:593:1: rule__Transition__Group__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:597:1: ( ( 'transition' ) )
            // InternalMyDsl.g:598:1: ( 'transition' )
            {
            // InternalMyDsl.g:598:1: ( 'transition' )
            // InternalMyDsl.g:599:2: 'transition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalMyDsl.g:608:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMyDsl.g:613:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalMyDsl.g:620:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:624:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalMyDsl.g:625:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:625:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalMyDsl.g:626:2: ( rule__Transition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:627:2: ( rule__Transition__NameAssignment_1 )
            // InternalMyDsl.g:627:3: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalMyDsl.g:635:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:639:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMyDsl.g:640:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Transition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalMyDsl.g:647:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__TimerAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( ( rule__Transition__TimerAssignment_2 ) ) )
            // InternalMyDsl.g:652:1: ( ( rule__Transition__TimerAssignment_2 ) )
            {
            // InternalMyDsl.g:652:1: ( ( rule__Transition__TimerAssignment_2 ) )
            // InternalMyDsl.g:653:2: ( rule__Transition__TimerAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTimerAssignment_2()); 
            }
            // InternalMyDsl.g:654:2: ( rule__Transition__TimerAssignment_2 )
            // InternalMyDsl.g:654:3: rule__Transition__TimerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TimerAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTimerAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalMyDsl.g:662:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMyDsl.g:667:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalMyDsl.g:674:1: rule__Transition__Group__3__Impl : ( 'sec' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( ( 'sec' ) )
            // InternalMyDsl.g:679:1: ( 'sec' )
            {
            // InternalMyDsl.g:679:1: ( 'sec' )
            // InternalMyDsl.g:680:2: 'sec'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSecKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getSecKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalMyDsl.g:689:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:693:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalMyDsl.g:694:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalMyDsl.g:701:1: rule__Transition__Group__4__Impl : ( ':' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:705:1: ( ( ':' ) )
            // InternalMyDsl.g:706:1: ( ':' )
            {
            // InternalMyDsl.g:706:1: ( ':' )
            // InternalMyDsl.g:707:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getColonKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getColonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalMyDsl.g:716:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:720:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalMyDsl.g:721:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalMyDsl.g:728:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__SourceAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( ( ( rule__Transition__SourceAssignment_5 ) ) )
            // InternalMyDsl.g:733:1: ( ( rule__Transition__SourceAssignment_5 ) )
            {
            // InternalMyDsl.g:733:1: ( ( rule__Transition__SourceAssignment_5 ) )
            // InternalMyDsl.g:734:2: ( rule__Transition__SourceAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 
            }
            // InternalMyDsl.g:735:2: ( rule__Transition__SourceAssignment_5 )
            // InternalMyDsl.g:735:3: rule__Transition__SourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalMyDsl.g:743:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:747:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalMyDsl.g:748:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Transition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalMyDsl.g:755:1: rule__Transition__Group__6__Impl : ( '>' ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:759:1: ( ( '>' ) )
            // InternalMyDsl.g:760:1: ( '>' )
            {
            // InternalMyDsl.g:760:1: ( '>' )
            // InternalMyDsl.g:761:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_6()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // InternalMyDsl.g:770:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:774:1: ( rule__Transition__Group__7__Impl )
            // InternalMyDsl.g:775:2: rule__Transition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // InternalMyDsl.g:781:1: rule__Transition__Group__7__Impl : ( ( rule__Transition__TargetAssignment_7 ) ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( ( ( rule__Transition__TargetAssignment_7 ) ) )
            // InternalMyDsl.g:786:1: ( ( rule__Transition__TargetAssignment_7 ) )
            {
            // InternalMyDsl.g:786:1: ( ( rule__Transition__TargetAssignment_7 ) )
            // InternalMyDsl.g:787:2: ( rule__Transition__TargetAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTargetAssignment_7()); 
            }
            // InternalMyDsl.g:788:2: ( rule__Transition__TargetAssignment_7 )
            // InternalMyDsl.g:788:3: rule__Transition__TargetAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTargetAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMyDsl.g:797:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMyDsl.g:802:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMyDsl.g:809:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:814:1: ( RULE_ID )
            {
            // InternalMyDsl.g:814:1: ( RULE_ID )
            // InternalMyDsl.g:815:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMyDsl.g:824:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:828:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMyDsl.g:829:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMyDsl.g:835:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMyDsl.g:840:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMyDsl.g:840:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMyDsl.g:841:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:842:2: ( rule__QualifiedName__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:842:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMyDsl.g:851:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMyDsl.g:856:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMyDsl.g:863:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:1: ( ( ( '.' ) ) )
            // InternalMyDsl.g:868:1: ( ( '.' ) )
            {
            // InternalMyDsl.g:868:1: ( ( '.' ) )
            // InternalMyDsl.g:869:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalMyDsl.g:870:2: ( '.' )
            // InternalMyDsl.g:870:3: '.'
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMyDsl.g:878:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMyDsl.g:883:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMyDsl.g:889:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:894:1: ( RULE_ID )
            {
            // InternalMyDsl.g:894:1: ( RULE_ID )
            // InternalMyDsl.g:895:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:905:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:910:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:917:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:921:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:922:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:922:1: ( ( '-' )? )
            // InternalMyDsl.g:923:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalMyDsl.g:924:2: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:924:3: '-'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:932:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:937:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:943:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:948:1: ( RULE_INT )
            {
            // InternalMyDsl.g:948:1: ( RULE_INT )
            // InternalMyDsl.g:949:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__NameAssignment_1"
    // InternalMyDsl.g:959:1: rule__StateMachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:964:2: ( RULE_ID )
            {
            // InternalMyDsl.g:964:2: ( RULE_ID )
            // InternalMyDsl.g:965:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_1"


    // $ANTLR start "rule__StateMachine__StartAssignment_3"
    // InternalMyDsl.g:974:1: rule__StateMachine__StartAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__StateMachine__StartAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:978:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:979:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:979:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:980:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getStartStateCrossReference_3_0()); 
            }
            // InternalMyDsl.g:981:3: ( ruleQualifiedName )
            // InternalMyDsl.g:982:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getStartStateQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getStartStateQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getStartStateCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StartAssignment_3"


    // $ANTLR start "rule__StateMachine__StatesAssignment_5"
    // InternalMyDsl.g:993:1: rule__StateMachine__StatesAssignment_5 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( ( ruleState ) )
            // InternalMyDsl.g:998:2: ( ruleState )
            {
            // InternalMyDsl.g:998:2: ( ruleState )
            // InternalMyDsl.g:999:3: ruleState
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_5"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_6"
    // InternalMyDsl.g:1008:1: rule__StateMachine__TransitionsAssignment_6 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( ( ruleTransition ) )
            // InternalMyDsl.g:1013:2: ( ruleTransition )
            {
            // InternalMyDsl.g:1013:2: ( ruleTransition )
            // InternalMyDsl.g:1014:3: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_6"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalMyDsl.g:1023:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1027:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1028:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1028:2: ( RULE_ID )
            // InternalMyDsl.g:1029:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__IncommingAssignment_3"
    // InternalMyDsl.g:1038:1: rule__State__IncommingAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__State__IncommingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:1043:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:1043:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:1044:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIncommingTransitionCrossReference_3_0()); 
            }
            // InternalMyDsl.g:1045:3: ( ruleQualifiedName )
            // InternalMyDsl.g:1046:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIncommingTransitionQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIncommingTransitionQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIncommingTransitionCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__IncommingAssignment_3"


    // $ANTLR start "rule__State__OutgoingAssignment_5"
    // InternalMyDsl.g:1057:1: rule__State__OutgoingAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__State__OutgoingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:1062:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:1062:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:1063:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getOutgoingTransitionCrossReference_5_0()); 
            }
            // InternalMyDsl.g:1064:3: ( ruleQualifiedName )
            // InternalMyDsl.g:1065:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getOutgoingTransitionQualifiedNameParserRuleCall_5_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getOutgoingTransitionQualifiedNameParserRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getOutgoingTransitionCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutgoingAssignment_5"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalMyDsl.g:1076:1: rule__Transition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1081:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1081:2: ( RULE_ID )
            // InternalMyDsl.g:1082:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Transition__TimerAssignment_2"
    // InternalMyDsl.g:1091:1: rule__Transition__TimerAssignment_2 : ( ruleTimeEvent ) ;
    public final void rule__Transition__TimerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( ( ruleTimeEvent ) )
            // InternalMyDsl.g:1096:2: ( ruleTimeEvent )
            {
            // InternalMyDsl.g:1096:2: ( ruleTimeEvent )
            // InternalMyDsl.g:1097:3: ruleTimeEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTimerTimeEventParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTimeEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTimerTimeEventParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TimerAssignment_2"


    // $ANTLR start "rule__Transition__SourceAssignment_5"
    // InternalMyDsl.g:1106:1: rule__Transition__SourceAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Transition__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:1111:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:1111:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:1112:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0()); 
            }
            // InternalMyDsl.g:1113:3: ( ruleQualifiedName )
            // InternalMyDsl.g:1114:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSourceStateQualifiedNameParserRuleCall_5_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getSourceStateQualifiedNameParserRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_5"


    // $ANTLR start "rule__Transition__TargetAssignment_7"
    // InternalMyDsl.g:1125:1: rule__Transition__TargetAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Transition__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1129:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:1130:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:1130:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:1131:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0()); 
            }
            // InternalMyDsl.g:1132:3: ( ruleQualifiedName )
            // InternalMyDsl.g:1133:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTargetStateQualifiedNameParserRuleCall_7_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTargetStateQualifiedNameParserRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_7"


    // $ANTLR start "rule__TimeEvent__TimeAssignment"
    // InternalMyDsl.g:1144:1: rule__TimeEvent__TimeAssignment : ( ruleEInt ) ;
    public final void rule__TimeEvent__TimeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1148:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1149:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1149:2: ( ruleEInt )
            // InternalMyDsl.g:1150:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeEventAccess().getTimeEIntParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeEventAccess().getTimeEIntParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEvent__TimeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});

}