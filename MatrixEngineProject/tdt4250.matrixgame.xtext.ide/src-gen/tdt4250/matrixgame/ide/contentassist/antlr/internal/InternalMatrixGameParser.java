package tdt4250.matrixgame.ide.contentassist.antlr.internal;

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
import tdt4250.matrixgame.services.MatrixGameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMatrixGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BASIC'", "'REWARD'", "'OBSTACLE'", "'INTERACTIVE'", "'CRASH'", "'NONE'", "'REVEAL'", "'MOVE'", "'TOGGLE'", "'ATTACK'", "'GameLogic'", "'{'", "'player'", "'map'", "'}'", "'gameName'", "'actions_played'", "','", "'has_state'", "'Player'", "'score'", "'takes_action'", "'('", "')'", "'Map'", "'mapSizeX'", "'mapSizeY'", "'tile'", "'amountOfTiles'", "'mapName'", "'Action'", "'actionType'", "'State'", "'turnsTaken'", "'-'", "'Tile'", "'tilePlace'", "'tileType'", "'xCoordinate'", "'yCoordinate'", "'Color'", "'flagsPlaced'", "'isOver'", "'isAccessible'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMatrixGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMatrixGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMatrixGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMatrixGame.g"; }


    	private MatrixGameGrammarAccess grammarAccess;

    	public void setGrammarAccess(MatrixGameGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGameLogic"
    // InternalMatrixGame.g:53:1: entryRuleGameLogic : ruleGameLogic EOF ;
    public final void entryRuleGameLogic() throws RecognitionException {
        try {
            // InternalMatrixGame.g:54:1: ( ruleGameLogic EOF )
            // InternalMatrixGame.g:55:1: ruleGameLogic EOF
            {
             before(grammarAccess.getGameLogicRule()); 
            pushFollow(FOLLOW_1);
            ruleGameLogic();

            state._fsp--;

             after(grammarAccess.getGameLogicRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGameLogic"


    // $ANTLR start "ruleGameLogic"
    // InternalMatrixGame.g:62:1: ruleGameLogic : ( ( rule__GameLogic__Group__0 ) ) ;
    public final void ruleGameLogic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:66:2: ( ( ( rule__GameLogic__Group__0 ) ) )
            // InternalMatrixGame.g:67:2: ( ( rule__GameLogic__Group__0 ) )
            {
            // InternalMatrixGame.g:67:2: ( ( rule__GameLogic__Group__0 ) )
            // InternalMatrixGame.g:68:3: ( rule__GameLogic__Group__0 )
            {
             before(grammarAccess.getGameLogicAccess().getGroup()); 
            // InternalMatrixGame.g:69:3: ( rule__GameLogic__Group__0 )
            // InternalMatrixGame.g:69:4: rule__GameLogic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameLogicAccess().getGroup()); 

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
    // $ANTLR end "ruleGameLogic"


    // $ANTLR start "entryRulePlayer"
    // InternalMatrixGame.g:78:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // InternalMatrixGame.g:79:1: ( rulePlayer EOF )
            // InternalMatrixGame.g:80:1: rulePlayer EOF
            {
             before(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getPlayerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalMatrixGame.g:87:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:91:2: ( ( ( rule__Player__Group__0 ) ) )
            // InternalMatrixGame.g:92:2: ( ( rule__Player__Group__0 ) )
            {
            // InternalMatrixGame.g:92:2: ( ( rule__Player__Group__0 ) )
            // InternalMatrixGame.g:93:3: ( rule__Player__Group__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup()); 
            // InternalMatrixGame.g:94:3: ( rule__Player__Group__0 )
            // InternalMatrixGame.g:94:4: rule__Player__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getGroup()); 

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
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleMap"
    // InternalMatrixGame.g:103:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalMatrixGame.g:104:1: ( ruleMap EOF )
            // InternalMatrixGame.g:105:1: ruleMap EOF
            {
             before(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getMapRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalMatrixGame.g:112:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:116:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalMatrixGame.g:117:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalMatrixGame.g:117:2: ( ( rule__Map__Group__0 ) )
            // InternalMatrixGame.g:118:3: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // InternalMatrixGame.g:119:3: ( rule__Map__Group__0 )
            // InternalMatrixGame.g:119:4: rule__Map__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getGroup()); 

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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleAction"
    // InternalMatrixGame.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMatrixGame.g:129:1: ( ruleAction EOF )
            // InternalMatrixGame.g:130:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMatrixGame.g:137:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:141:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalMatrixGame.g:142:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalMatrixGame.g:142:2: ( ( rule__Action__Group__0 ) )
            // InternalMatrixGame.g:143:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalMatrixGame.g:144:3: ( rule__Action__Group__0 )
            // InternalMatrixGame.g:144:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleState"
    // InternalMatrixGame.g:153:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMatrixGame.g:154:1: ( ruleState EOF )
            // InternalMatrixGame.g:155:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMatrixGame.g:162:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:166:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalMatrixGame.g:167:2: ( ( rule__State__Group__0 ) )
            {
            // InternalMatrixGame.g:167:2: ( ( rule__State__Group__0 ) )
            // InternalMatrixGame.g:168:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalMatrixGame.g:169:3: ( rule__State__Group__0 )
            // InternalMatrixGame.g:169:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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


    // $ANTLR start "entryRuleEString"
    // InternalMatrixGame.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMatrixGame.g:179:1: ( ruleEString EOF )
            // InternalMatrixGame.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMatrixGame.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMatrixGame.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMatrixGame.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalMatrixGame.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMatrixGame.g:194:3: ( rule__EString__Alternatives )
            // InternalMatrixGame.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMatrixGame.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMatrixGame.g:204:1: ( ruleEInt EOF )
            // InternalMatrixGame.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMatrixGame.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMatrixGame.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMatrixGame.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalMatrixGame.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMatrixGame.g:219:3: ( rule__EInt__Group__0 )
            // InternalMatrixGame.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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


    // $ANTLR start "entryRuleTile"
    // InternalMatrixGame.g:228:1: entryRuleTile : ruleTile EOF ;
    public final void entryRuleTile() throws RecognitionException {
        try {
            // InternalMatrixGame.g:229:1: ( ruleTile EOF )
            // InternalMatrixGame.g:230:1: ruleTile EOF
            {
             before(grammarAccess.getTileRule()); 
            pushFollow(FOLLOW_1);
            ruleTile();

            state._fsp--;

             after(grammarAccess.getTileRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTile"


    // $ANTLR start "ruleTile"
    // InternalMatrixGame.g:237:1: ruleTile : ( ( rule__Tile__Group__0 ) ) ;
    public final void ruleTile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:241:2: ( ( ( rule__Tile__Group__0 ) ) )
            // InternalMatrixGame.g:242:2: ( ( rule__Tile__Group__0 ) )
            {
            // InternalMatrixGame.g:242:2: ( ( rule__Tile__Group__0 ) )
            // InternalMatrixGame.g:243:3: ( rule__Tile__Group__0 )
            {
             before(grammarAccess.getTileAccess().getGroup()); 
            // InternalMatrixGame.g:244:3: ( rule__Tile__Group__0 )
            // InternalMatrixGame.g:244:4: rule__Tile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getGroup()); 

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
    // $ANTLR end "ruleTile"


    // $ANTLR start "ruleTileType"
    // InternalMatrixGame.g:253:1: ruleTileType : ( ( rule__TileType__Alternatives ) ) ;
    public final void ruleTileType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:257:1: ( ( ( rule__TileType__Alternatives ) ) )
            // InternalMatrixGame.g:258:2: ( ( rule__TileType__Alternatives ) )
            {
            // InternalMatrixGame.g:258:2: ( ( rule__TileType__Alternatives ) )
            // InternalMatrixGame.g:259:3: ( rule__TileType__Alternatives )
            {
             before(grammarAccess.getTileTypeAccess().getAlternatives()); 
            // InternalMatrixGame.g:260:3: ( rule__TileType__Alternatives )
            // InternalMatrixGame.g:260:4: rule__TileType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TileType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTileTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTileType"


    // $ANTLR start "ruleActionType"
    // InternalMatrixGame.g:269:1: ruleActionType : ( ( rule__ActionType__Alternatives ) ) ;
    public final void ruleActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:273:1: ( ( ( rule__ActionType__Alternatives ) ) )
            // InternalMatrixGame.g:274:2: ( ( rule__ActionType__Alternatives ) )
            {
            // InternalMatrixGame.g:274:2: ( ( rule__ActionType__Alternatives ) )
            // InternalMatrixGame.g:275:3: ( rule__ActionType__Alternatives )
            {
             before(grammarAccess.getActionTypeAccess().getAlternatives()); 
            // InternalMatrixGame.g:276:3: ( rule__ActionType__Alternatives )
            // InternalMatrixGame.g:276:4: rule__ActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActionType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMatrixGame.g:284:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:288:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMatrixGame.g:289:2: ( RULE_STRING )
                    {
                    // InternalMatrixGame.g:289:2: ( RULE_STRING )
                    // InternalMatrixGame.g:290:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMatrixGame.g:295:2: ( RULE_ID )
                    {
                    // InternalMatrixGame.g:295:2: ( RULE_ID )
                    // InternalMatrixGame.g:296:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TileType__Alternatives"
    // InternalMatrixGame.g:305:1: rule__TileType__Alternatives : ( ( ( 'BASIC' ) ) | ( ( 'REWARD' ) ) | ( ( 'OBSTACLE' ) ) | ( ( 'INTERACTIVE' ) ) | ( ( 'CRASH' ) ) );
    public final void rule__TileType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:309:1: ( ( ( 'BASIC' ) ) | ( ( 'REWARD' ) ) | ( ( 'OBSTACLE' ) ) | ( ( 'INTERACTIVE' ) ) | ( ( 'CRASH' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMatrixGame.g:310:2: ( ( 'BASIC' ) )
                    {
                    // InternalMatrixGame.g:310:2: ( ( 'BASIC' ) )
                    // InternalMatrixGame.g:311:3: ( 'BASIC' )
                    {
                     before(grammarAccess.getTileTypeAccess().getBASICEnumLiteralDeclaration_0()); 
                    // InternalMatrixGame.g:312:3: ( 'BASIC' )
                    // InternalMatrixGame.g:312:4: 'BASIC'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTileTypeAccess().getBASICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMatrixGame.g:316:2: ( ( 'REWARD' ) )
                    {
                    // InternalMatrixGame.g:316:2: ( ( 'REWARD' ) )
                    // InternalMatrixGame.g:317:3: ( 'REWARD' )
                    {
                     before(grammarAccess.getTileTypeAccess().getREWARDEnumLiteralDeclaration_1()); 
                    // InternalMatrixGame.g:318:3: ( 'REWARD' )
                    // InternalMatrixGame.g:318:4: 'REWARD'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTileTypeAccess().getREWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMatrixGame.g:322:2: ( ( 'OBSTACLE' ) )
                    {
                    // InternalMatrixGame.g:322:2: ( ( 'OBSTACLE' ) )
                    // InternalMatrixGame.g:323:3: ( 'OBSTACLE' )
                    {
                     before(grammarAccess.getTileTypeAccess().getOBSTACLEEnumLiteralDeclaration_2()); 
                    // InternalMatrixGame.g:324:3: ( 'OBSTACLE' )
                    // InternalMatrixGame.g:324:4: 'OBSTACLE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTileTypeAccess().getOBSTACLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMatrixGame.g:328:2: ( ( 'INTERACTIVE' ) )
                    {
                    // InternalMatrixGame.g:328:2: ( ( 'INTERACTIVE' ) )
                    // InternalMatrixGame.g:329:3: ( 'INTERACTIVE' )
                    {
                     before(grammarAccess.getTileTypeAccess().getINTERACTIVEEnumLiteralDeclaration_3()); 
                    // InternalMatrixGame.g:330:3: ( 'INTERACTIVE' )
                    // InternalMatrixGame.g:330:4: 'INTERACTIVE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTileTypeAccess().getINTERACTIVEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMatrixGame.g:334:2: ( ( 'CRASH' ) )
                    {
                    // InternalMatrixGame.g:334:2: ( ( 'CRASH' ) )
                    // InternalMatrixGame.g:335:3: ( 'CRASH' )
                    {
                     before(grammarAccess.getTileTypeAccess().getCRASHEnumLiteralDeclaration_4()); 
                    // InternalMatrixGame.g:336:3: ( 'CRASH' )
                    // InternalMatrixGame.g:336:4: 'CRASH'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTileTypeAccess().getCRASHEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__TileType__Alternatives"


    // $ANTLR start "rule__ActionType__Alternatives"
    // InternalMatrixGame.g:344:1: rule__ActionType__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'REVEAL' ) ) | ( ( 'MOVE' ) ) | ( ( 'TOGGLE' ) ) | ( ( 'ATTACK' ) ) );
    public final void rule__ActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:348:1: ( ( ( 'NONE' ) ) | ( ( 'REVEAL' ) ) | ( ( 'MOVE' ) ) | ( ( 'TOGGLE' ) ) | ( ( 'ATTACK' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMatrixGame.g:349:2: ( ( 'NONE' ) )
                    {
                    // InternalMatrixGame.g:349:2: ( ( 'NONE' ) )
                    // InternalMatrixGame.g:350:3: ( 'NONE' )
                    {
                     before(grammarAccess.getActionTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalMatrixGame.g:351:3: ( 'NONE' )
                    // InternalMatrixGame.g:351:4: 'NONE'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionTypeAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMatrixGame.g:355:2: ( ( 'REVEAL' ) )
                    {
                    // InternalMatrixGame.g:355:2: ( ( 'REVEAL' ) )
                    // InternalMatrixGame.g:356:3: ( 'REVEAL' )
                    {
                     before(grammarAccess.getActionTypeAccess().getREVEALEnumLiteralDeclaration_1()); 
                    // InternalMatrixGame.g:357:3: ( 'REVEAL' )
                    // InternalMatrixGame.g:357:4: 'REVEAL'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionTypeAccess().getREVEALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMatrixGame.g:361:2: ( ( 'MOVE' ) )
                    {
                    // InternalMatrixGame.g:361:2: ( ( 'MOVE' ) )
                    // InternalMatrixGame.g:362:3: ( 'MOVE' )
                    {
                     before(grammarAccess.getActionTypeAccess().getMOVEEnumLiteralDeclaration_2()); 
                    // InternalMatrixGame.g:363:3: ( 'MOVE' )
                    // InternalMatrixGame.g:363:4: 'MOVE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionTypeAccess().getMOVEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMatrixGame.g:367:2: ( ( 'TOGGLE' ) )
                    {
                    // InternalMatrixGame.g:367:2: ( ( 'TOGGLE' ) )
                    // InternalMatrixGame.g:368:3: ( 'TOGGLE' )
                    {
                     before(grammarAccess.getActionTypeAccess().getTOGGLEEnumLiteralDeclaration_3()); 
                    // InternalMatrixGame.g:369:3: ( 'TOGGLE' )
                    // InternalMatrixGame.g:369:4: 'TOGGLE'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionTypeAccess().getTOGGLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMatrixGame.g:373:2: ( ( 'ATTACK' ) )
                    {
                    // InternalMatrixGame.g:373:2: ( ( 'ATTACK' ) )
                    // InternalMatrixGame.g:374:3: ( 'ATTACK' )
                    {
                     before(grammarAccess.getActionTypeAccess().getATTACKEnumLiteralDeclaration_4()); 
                    // InternalMatrixGame.g:375:3: ( 'ATTACK' )
                    // InternalMatrixGame.g:375:4: 'ATTACK'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionTypeAccess().getATTACKEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ActionType__Alternatives"


    // $ANTLR start "rule__GameLogic__Group__0"
    // InternalMatrixGame.g:383:1: rule__GameLogic__Group__0 : rule__GameLogic__Group__0__Impl rule__GameLogic__Group__1 ;
    public final void rule__GameLogic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:387:1: ( rule__GameLogic__Group__0__Impl rule__GameLogic__Group__1 )
            // InternalMatrixGame.g:388:2: rule__GameLogic__Group__0__Impl rule__GameLogic__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GameLogic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__0"


    // $ANTLR start "rule__GameLogic__Group__0__Impl"
    // InternalMatrixGame.g:395:1: rule__GameLogic__Group__0__Impl : ( 'GameLogic' ) ;
    public final void rule__GameLogic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:399:1: ( ( 'GameLogic' ) )
            // InternalMatrixGame.g:400:1: ( 'GameLogic' )
            {
            // InternalMatrixGame.g:400:1: ( 'GameLogic' )
            // InternalMatrixGame.g:401:2: 'GameLogic'
            {
             before(grammarAccess.getGameLogicAccess().getGameLogicKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getGameLogicKeyword_0()); 

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
    // $ANTLR end "rule__GameLogic__Group__0__Impl"


    // $ANTLR start "rule__GameLogic__Group__1"
    // InternalMatrixGame.g:410:1: rule__GameLogic__Group__1 : rule__GameLogic__Group__1__Impl rule__GameLogic__Group__2 ;
    public final void rule__GameLogic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:414:1: ( rule__GameLogic__Group__1__Impl rule__GameLogic__Group__2 )
            // InternalMatrixGame.g:415:2: rule__GameLogic__Group__1__Impl rule__GameLogic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GameLogic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__1"


    // $ANTLR start "rule__GameLogic__Group__1__Impl"
    // InternalMatrixGame.g:422:1: rule__GameLogic__Group__1__Impl : ( '{' ) ;
    public final void rule__GameLogic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:426:1: ( ( '{' ) )
            // InternalMatrixGame.g:427:1: ( '{' )
            {
            // InternalMatrixGame.g:427:1: ( '{' )
            // InternalMatrixGame.g:428:2: '{'
            {
             before(grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__GameLogic__Group__1__Impl"


    // $ANTLR start "rule__GameLogic__Group__2"
    // InternalMatrixGame.g:437:1: rule__GameLogic__Group__2 : rule__GameLogic__Group__2__Impl rule__GameLogic__Group__3 ;
    public final void rule__GameLogic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:441:1: ( rule__GameLogic__Group__2__Impl rule__GameLogic__Group__3 )
            // InternalMatrixGame.g:442:2: rule__GameLogic__Group__2__Impl rule__GameLogic__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__GameLogic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__2"


    // $ANTLR start "rule__GameLogic__Group__2__Impl"
    // InternalMatrixGame.g:449:1: rule__GameLogic__Group__2__Impl : ( ( rule__GameLogic__Group_2__0 )? ) ;
    public final void rule__GameLogic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:453:1: ( ( ( rule__GameLogic__Group_2__0 )? ) )
            // InternalMatrixGame.g:454:1: ( ( rule__GameLogic__Group_2__0 )? )
            {
            // InternalMatrixGame.g:454:1: ( ( rule__GameLogic__Group_2__0 )? )
            // InternalMatrixGame.g:455:2: ( rule__GameLogic__Group_2__0 )?
            {
             before(grammarAccess.getGameLogicAccess().getGroup_2()); 
            // InternalMatrixGame.g:456:2: ( rule__GameLogic__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMatrixGame.g:456:3: rule__GameLogic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameLogic__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameLogicAccess().getGroup_2()); 

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
    // $ANTLR end "rule__GameLogic__Group__2__Impl"


    // $ANTLR start "rule__GameLogic__Group__3"
    // InternalMatrixGame.g:464:1: rule__GameLogic__Group__3 : rule__GameLogic__Group__3__Impl rule__GameLogic__Group__4 ;
    public final void rule__GameLogic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:468:1: ( rule__GameLogic__Group__3__Impl rule__GameLogic__Group__4 )
            // InternalMatrixGame.g:469:2: rule__GameLogic__Group__3__Impl rule__GameLogic__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__GameLogic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__3"


    // $ANTLR start "rule__GameLogic__Group__3__Impl"
    // InternalMatrixGame.g:476:1: rule__GameLogic__Group__3__Impl : ( 'player' ) ;
    public final void rule__GameLogic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:480:1: ( ( 'player' ) )
            // InternalMatrixGame.g:481:1: ( 'player' )
            {
            // InternalMatrixGame.g:481:1: ( 'player' )
            // InternalMatrixGame.g:482:2: 'player'
            {
             before(grammarAccess.getGameLogicAccess().getPlayerKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getPlayerKeyword_3()); 

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
    // $ANTLR end "rule__GameLogic__Group__3__Impl"


    // $ANTLR start "rule__GameLogic__Group__4"
    // InternalMatrixGame.g:491:1: rule__GameLogic__Group__4 : rule__GameLogic__Group__4__Impl rule__GameLogic__Group__5 ;
    public final void rule__GameLogic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:495:1: ( rule__GameLogic__Group__4__Impl rule__GameLogic__Group__5 )
            // InternalMatrixGame.g:496:2: rule__GameLogic__Group__4__Impl rule__GameLogic__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__GameLogic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__4"


    // $ANTLR start "rule__GameLogic__Group__4__Impl"
    // InternalMatrixGame.g:503:1: rule__GameLogic__Group__4__Impl : ( ( rule__GameLogic__PlayerAssignment_4 ) ) ;
    public final void rule__GameLogic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:507:1: ( ( ( rule__GameLogic__PlayerAssignment_4 ) ) )
            // InternalMatrixGame.g:508:1: ( ( rule__GameLogic__PlayerAssignment_4 ) )
            {
            // InternalMatrixGame.g:508:1: ( ( rule__GameLogic__PlayerAssignment_4 ) )
            // InternalMatrixGame.g:509:2: ( rule__GameLogic__PlayerAssignment_4 )
            {
             before(grammarAccess.getGameLogicAccess().getPlayerAssignment_4()); 
            // InternalMatrixGame.g:510:2: ( rule__GameLogic__PlayerAssignment_4 )
            // InternalMatrixGame.g:510:3: rule__GameLogic__PlayerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__PlayerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGameLogicAccess().getPlayerAssignment_4()); 

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
    // $ANTLR end "rule__GameLogic__Group__4__Impl"


    // $ANTLR start "rule__GameLogic__Group__5"
    // InternalMatrixGame.g:518:1: rule__GameLogic__Group__5 : rule__GameLogic__Group__5__Impl rule__GameLogic__Group__6 ;
    public final void rule__GameLogic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:522:1: ( rule__GameLogic__Group__5__Impl rule__GameLogic__Group__6 )
            // InternalMatrixGame.g:523:2: rule__GameLogic__Group__5__Impl rule__GameLogic__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__GameLogic__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__5"


    // $ANTLR start "rule__GameLogic__Group__5__Impl"
    // InternalMatrixGame.g:530:1: rule__GameLogic__Group__5__Impl : ( 'map' ) ;
    public final void rule__GameLogic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:534:1: ( ( 'map' ) )
            // InternalMatrixGame.g:535:1: ( 'map' )
            {
            // InternalMatrixGame.g:535:1: ( 'map' )
            // InternalMatrixGame.g:536:2: 'map'
            {
             before(grammarAccess.getGameLogicAccess().getMapKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getMapKeyword_5()); 

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
    // $ANTLR end "rule__GameLogic__Group__5__Impl"


    // $ANTLR start "rule__GameLogic__Group__6"
    // InternalMatrixGame.g:545:1: rule__GameLogic__Group__6 : rule__GameLogic__Group__6__Impl rule__GameLogic__Group__7 ;
    public final void rule__GameLogic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:549:1: ( rule__GameLogic__Group__6__Impl rule__GameLogic__Group__7 )
            // InternalMatrixGame.g:550:2: rule__GameLogic__Group__6__Impl rule__GameLogic__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__GameLogic__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__6"


    // $ANTLR start "rule__GameLogic__Group__6__Impl"
    // InternalMatrixGame.g:557:1: rule__GameLogic__Group__6__Impl : ( ( rule__GameLogic__MapAssignment_6 ) ) ;
    public final void rule__GameLogic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:561:1: ( ( ( rule__GameLogic__MapAssignment_6 ) ) )
            // InternalMatrixGame.g:562:1: ( ( rule__GameLogic__MapAssignment_6 ) )
            {
            // InternalMatrixGame.g:562:1: ( ( rule__GameLogic__MapAssignment_6 ) )
            // InternalMatrixGame.g:563:2: ( rule__GameLogic__MapAssignment_6 )
            {
             before(grammarAccess.getGameLogicAccess().getMapAssignment_6()); 
            // InternalMatrixGame.g:564:2: ( rule__GameLogic__MapAssignment_6 )
            // InternalMatrixGame.g:564:3: rule__GameLogic__MapAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__MapAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGameLogicAccess().getMapAssignment_6()); 

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
    // $ANTLR end "rule__GameLogic__Group__6__Impl"


    // $ANTLR start "rule__GameLogic__Group__7"
    // InternalMatrixGame.g:572:1: rule__GameLogic__Group__7 : rule__GameLogic__Group__7__Impl rule__GameLogic__Group__8 ;
    public final void rule__GameLogic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:576:1: ( rule__GameLogic__Group__7__Impl rule__GameLogic__Group__8 )
            // InternalMatrixGame.g:577:2: rule__GameLogic__Group__7__Impl rule__GameLogic__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__GameLogic__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__7"


    // $ANTLR start "rule__GameLogic__Group__7__Impl"
    // InternalMatrixGame.g:584:1: rule__GameLogic__Group__7__Impl : ( ( rule__GameLogic__Group_7__0 )? ) ;
    public final void rule__GameLogic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:588:1: ( ( ( rule__GameLogic__Group_7__0 )? ) )
            // InternalMatrixGame.g:589:1: ( ( rule__GameLogic__Group_7__0 )? )
            {
            // InternalMatrixGame.g:589:1: ( ( rule__GameLogic__Group_7__0 )? )
            // InternalMatrixGame.g:590:2: ( rule__GameLogic__Group_7__0 )?
            {
             before(grammarAccess.getGameLogicAccess().getGroup_7()); 
            // InternalMatrixGame.g:591:2: ( rule__GameLogic__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMatrixGame.g:591:3: rule__GameLogic__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameLogic__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameLogicAccess().getGroup_7()); 

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
    // $ANTLR end "rule__GameLogic__Group__7__Impl"


    // $ANTLR start "rule__GameLogic__Group__8"
    // InternalMatrixGame.g:599:1: rule__GameLogic__Group__8 : rule__GameLogic__Group__8__Impl rule__GameLogic__Group__9 ;
    public final void rule__GameLogic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:603:1: ( rule__GameLogic__Group__8__Impl rule__GameLogic__Group__9 )
            // InternalMatrixGame.g:604:2: rule__GameLogic__Group__8__Impl rule__GameLogic__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__GameLogic__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__8"


    // $ANTLR start "rule__GameLogic__Group__8__Impl"
    // InternalMatrixGame.g:611:1: rule__GameLogic__Group__8__Impl : ( ( rule__GameLogic__Group_8__0 )? ) ;
    public final void rule__GameLogic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:615:1: ( ( ( rule__GameLogic__Group_8__0 )? ) )
            // InternalMatrixGame.g:616:1: ( ( rule__GameLogic__Group_8__0 )? )
            {
            // InternalMatrixGame.g:616:1: ( ( rule__GameLogic__Group_8__0 )? )
            // InternalMatrixGame.g:617:2: ( rule__GameLogic__Group_8__0 )?
            {
             before(grammarAccess.getGameLogicAccess().getGroup_8()); 
            // InternalMatrixGame.g:618:2: ( rule__GameLogic__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMatrixGame.g:618:3: rule__GameLogic__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameLogic__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameLogicAccess().getGroup_8()); 

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
    // $ANTLR end "rule__GameLogic__Group__8__Impl"


    // $ANTLR start "rule__GameLogic__Group__9"
    // InternalMatrixGame.g:626:1: rule__GameLogic__Group__9 : rule__GameLogic__Group__9__Impl ;
    public final void rule__GameLogic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:630:1: ( rule__GameLogic__Group__9__Impl )
            // InternalMatrixGame.g:631:2: rule__GameLogic__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Group__9__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group__9"


    // $ANTLR start "rule__GameLogic__Group__9__Impl"
    // InternalMatrixGame.g:637:1: rule__GameLogic__Group__9__Impl : ( '}' ) ;
    public final void rule__GameLogic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:641:1: ( ( '}' ) )
            // InternalMatrixGame.g:642:1: ( '}' )
            {
            // InternalMatrixGame.g:642:1: ( '}' )
            // InternalMatrixGame.g:643:2: '}'
            {
             before(grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__GameLogic__Group__9__Impl"


    // $ANTLR start "rule__GameLogic__Group_2__0"
    // InternalMatrixGame.g:653:1: rule__GameLogic__Group_2__0 : rule__GameLogic__Group_2__0__Impl rule__GameLogic__Group_2__1 ;
    public final void rule__GameLogic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:657:1: ( rule__GameLogic__Group_2__0__Impl rule__GameLogic__Group_2__1 )
            // InternalMatrixGame.g:658:2: rule__GameLogic__Group_2__0__Impl rule__GameLogic__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__GameLogic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_2__0"


    // $ANTLR start "rule__GameLogic__Group_2__0__Impl"
    // InternalMatrixGame.g:665:1: rule__GameLogic__Group_2__0__Impl : ( 'gameName' ) ;
    public final void rule__GameLogic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:669:1: ( ( 'gameName' ) )
            // InternalMatrixGame.g:670:1: ( 'gameName' )
            {
            // InternalMatrixGame.g:670:1: ( 'gameName' )
            // InternalMatrixGame.g:671:2: 'gameName'
            {
             before(grammarAccess.getGameLogicAccess().getGameNameKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getGameNameKeyword_2_0()); 

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
    // $ANTLR end "rule__GameLogic__Group_2__0__Impl"


    // $ANTLR start "rule__GameLogic__Group_2__1"
    // InternalMatrixGame.g:680:1: rule__GameLogic__Group_2__1 : rule__GameLogic__Group_2__1__Impl ;
    public final void rule__GameLogic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:684:1: ( rule__GameLogic__Group_2__1__Impl )
            // InternalMatrixGame.g:685:2: rule__GameLogic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_2__1"


    // $ANTLR start "rule__GameLogic__Group_2__1__Impl"
    // InternalMatrixGame.g:691:1: rule__GameLogic__Group_2__1__Impl : ( ( rule__GameLogic__GameNameAssignment_2_1 ) ) ;
    public final void rule__GameLogic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:695:1: ( ( ( rule__GameLogic__GameNameAssignment_2_1 ) ) )
            // InternalMatrixGame.g:696:1: ( ( rule__GameLogic__GameNameAssignment_2_1 ) )
            {
            // InternalMatrixGame.g:696:1: ( ( rule__GameLogic__GameNameAssignment_2_1 ) )
            // InternalMatrixGame.g:697:2: ( rule__GameLogic__GameNameAssignment_2_1 )
            {
             before(grammarAccess.getGameLogicAccess().getGameNameAssignment_2_1()); 
            // InternalMatrixGame.g:698:2: ( rule__GameLogic__GameNameAssignment_2_1 )
            // InternalMatrixGame.g:698:3: rule__GameLogic__GameNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__GameNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGameLogicAccess().getGameNameAssignment_2_1()); 

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
    // $ANTLR end "rule__GameLogic__Group_2__1__Impl"


    // $ANTLR start "rule__GameLogic__Group_7__0"
    // InternalMatrixGame.g:707:1: rule__GameLogic__Group_7__0 : rule__GameLogic__Group_7__0__Impl rule__GameLogic__Group_7__1 ;
    public final void rule__GameLogic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:711:1: ( rule__GameLogic__Group_7__0__Impl rule__GameLogic__Group_7__1 )
            // InternalMatrixGame.g:712:2: rule__GameLogic__Group_7__0__Impl rule__GameLogic__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__GameLogic__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_7__1();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_7__0"


    // $ANTLR start "rule__GameLogic__Group_7__0__Impl"
    // InternalMatrixGame.g:719:1: rule__GameLogic__Group_7__0__Impl : ( 'actions_played' ) ;
    public final void rule__GameLogic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:723:1: ( ( 'actions_played' ) )
            // InternalMatrixGame.g:724:1: ( 'actions_played' )
            {
            // InternalMatrixGame.g:724:1: ( 'actions_played' )
            // InternalMatrixGame.g:725:2: 'actions_played'
            {
             before(grammarAccess.getGameLogicAccess().getActions_playedKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getActions_playedKeyword_7_0()); 

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
    // $ANTLR end "rule__GameLogic__Group_7__0__Impl"


    // $ANTLR start "rule__GameLogic__Group_7__1"
    // InternalMatrixGame.g:734:1: rule__GameLogic__Group_7__1 : rule__GameLogic__Group_7__1__Impl rule__GameLogic__Group_7__2 ;
    public final void rule__GameLogic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:738:1: ( rule__GameLogic__Group_7__1__Impl rule__GameLogic__Group_7__2 )
            // InternalMatrixGame.g:739:2: rule__GameLogic__Group_7__1__Impl rule__GameLogic__Group_7__2
            {
            pushFollow(FOLLOW_10);
            rule__GameLogic__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_7__2();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_7__1"


    // $ANTLR start "rule__GameLogic__Group_7__1__Impl"
    // InternalMatrixGame.g:746:1: rule__GameLogic__Group_7__1__Impl : ( '{' ) ;
    public final void rule__GameLogic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:750:1: ( ( '{' ) )
            // InternalMatrixGame.g:751:1: ( '{' )
            {
            // InternalMatrixGame.g:751:1: ( '{' )
            // InternalMatrixGame.g:752:2: '{'
            {
             before(grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__GameLogic__Group_7__1__Impl"


    // $ANTLR start "rule__GameLogic__Group_7__2"
    // InternalMatrixGame.g:761:1: rule__GameLogic__Group_7__2 : rule__GameLogic__Group_7__2__Impl rule__GameLogic__Group_7__3 ;
    public final void rule__GameLogic__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:765:1: ( rule__GameLogic__Group_7__2__Impl rule__GameLogic__Group_7__3 )
            // InternalMatrixGame.g:766:2: rule__GameLogic__Group_7__2__Impl rule__GameLogic__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__GameLogic__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_7__3();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_7__2"


    // $ANTLR start "rule__GameLogic__Group_7__2__Impl"
    // InternalMatrixGame.g:773:1: rule__GameLogic__Group_7__2__Impl : ( ( rule__GameLogic__Actions_playedAssignment_7_2 ) ) ;
    public final void rule__GameLogic__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:777:1: ( ( ( rule__GameLogic__Actions_playedAssignment_7_2 ) ) )
            // InternalMatrixGame.g:778:1: ( ( rule__GameLogic__Actions_playedAssignment_7_2 ) )
            {
            // InternalMatrixGame.g:778:1: ( ( rule__GameLogic__Actions_playedAssignment_7_2 ) )
            // InternalMatrixGame.g:779:2: ( rule__GameLogic__Actions_playedAssignment_7_2 )
            {
             before(grammarAccess.getGameLogicAccess().getActions_playedAssignment_7_2()); 
            // InternalMatrixGame.g:780:2: ( rule__GameLogic__Actions_playedAssignment_7_2 )
            // InternalMatrixGame.g:780:3: rule__GameLogic__Actions_playedAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Actions_playedAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getGameLogicAccess().getActions_playedAssignment_7_2()); 

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
    // $ANTLR end "rule__GameLogic__Group_7__2__Impl"


    // $ANTLR start "rule__GameLogic__Group_7__3"
    // InternalMatrixGame.g:788:1: rule__GameLogic__Group_7__3 : rule__GameLogic__Group_7__3__Impl rule__GameLogic__Group_7__4 ;
    public final void rule__GameLogic__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:792:1: ( rule__GameLogic__Group_7__3__Impl rule__GameLogic__Group_7__4 )
            // InternalMatrixGame.g:793:2: rule__GameLogic__Group_7__3__Impl rule__GameLogic__Group_7__4
            {
            pushFollow(FOLLOW_11);
            rule__GameLogic__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_7__4();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_7__3"


    // $ANTLR start "rule__GameLogic__Group_7__3__Impl"
    // InternalMatrixGame.g:800:1: rule__GameLogic__Group_7__3__Impl : ( ( rule__GameLogic__Group_7_3__0 )* ) ;
    public final void rule__GameLogic__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:804:1: ( ( ( rule__GameLogic__Group_7_3__0 )* ) )
            // InternalMatrixGame.g:805:1: ( ( rule__GameLogic__Group_7_3__0 )* )
            {
            // InternalMatrixGame.g:805:1: ( ( rule__GameLogic__Group_7_3__0 )* )
            // InternalMatrixGame.g:806:2: ( rule__GameLogic__Group_7_3__0 )*
            {
             before(grammarAccess.getGameLogicAccess().getGroup_7_3()); 
            // InternalMatrixGame.g:807:2: ( rule__GameLogic__Group_7_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMatrixGame.g:807:3: rule__GameLogic__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__GameLogic__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGameLogicAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__GameLogic__Group_7__3__Impl"


    // $ANTLR start "rule__GameLogic__Group_7__4"
    // InternalMatrixGame.g:815:1: rule__GameLogic__Group_7__4 : rule__GameLogic__Group_7__4__Impl ;
    public final void rule__GameLogic__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:819:1: ( rule__GameLogic__Group_7__4__Impl )
            // InternalMatrixGame.g:820:2: rule__GameLogic__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_7__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_7__4"


    // $ANTLR start "rule__GameLogic__Group_7__4__Impl"
    // InternalMatrixGame.g:826:1: rule__GameLogic__Group_7__4__Impl : ( '}' ) ;
    public final void rule__GameLogic__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:830:1: ( ( '}' ) )
            // InternalMatrixGame.g:831:1: ( '}' )
            {
            // InternalMatrixGame.g:831:1: ( '}' )
            // InternalMatrixGame.g:832:2: '}'
            {
             before(grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__GameLogic__Group_7__4__Impl"


    // $ANTLR start "rule__GameLogic__Group_7_3__0"
    // InternalMatrixGame.g:842:1: rule__GameLogic__Group_7_3__0 : rule__GameLogic__Group_7_3__0__Impl rule__GameLogic__Group_7_3__1 ;
    public final void rule__GameLogic__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:846:1: ( rule__GameLogic__Group_7_3__0__Impl rule__GameLogic__Group_7_3__1 )
            // InternalMatrixGame.g:847:2: rule__GameLogic__Group_7_3__0__Impl rule__GameLogic__Group_7_3__1
            {
            pushFollow(FOLLOW_10);
            rule__GameLogic__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_7_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_7_3__0"


    // $ANTLR start "rule__GameLogic__Group_7_3__0__Impl"
    // InternalMatrixGame.g:854:1: rule__GameLogic__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__GameLogic__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:858:1: ( ( ',' ) )
            // InternalMatrixGame.g:859:1: ( ',' )
            {
            // InternalMatrixGame.g:859:1: ( ',' )
            // InternalMatrixGame.g:860:2: ','
            {
             before(grammarAccess.getGameLogicAccess().getCommaKeyword_7_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__GameLogic__Group_7_3__0__Impl"


    // $ANTLR start "rule__GameLogic__Group_7_3__1"
    // InternalMatrixGame.g:869:1: rule__GameLogic__Group_7_3__1 : rule__GameLogic__Group_7_3__1__Impl ;
    public final void rule__GameLogic__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:873:1: ( rule__GameLogic__Group_7_3__1__Impl )
            // InternalMatrixGame.g:874:2: rule__GameLogic__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_7_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_7_3__1"


    // $ANTLR start "rule__GameLogic__Group_7_3__1__Impl"
    // InternalMatrixGame.g:880:1: rule__GameLogic__Group_7_3__1__Impl : ( ( rule__GameLogic__Actions_playedAssignment_7_3_1 ) ) ;
    public final void rule__GameLogic__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:884:1: ( ( ( rule__GameLogic__Actions_playedAssignment_7_3_1 ) ) )
            // InternalMatrixGame.g:885:1: ( ( rule__GameLogic__Actions_playedAssignment_7_3_1 ) )
            {
            // InternalMatrixGame.g:885:1: ( ( rule__GameLogic__Actions_playedAssignment_7_3_1 ) )
            // InternalMatrixGame.g:886:2: ( rule__GameLogic__Actions_playedAssignment_7_3_1 )
            {
             before(grammarAccess.getGameLogicAccess().getActions_playedAssignment_7_3_1()); 
            // InternalMatrixGame.g:887:2: ( rule__GameLogic__Actions_playedAssignment_7_3_1 )
            // InternalMatrixGame.g:887:3: rule__GameLogic__Actions_playedAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Actions_playedAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameLogicAccess().getActions_playedAssignment_7_3_1()); 

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
    // $ANTLR end "rule__GameLogic__Group_7_3__1__Impl"


    // $ANTLR start "rule__GameLogic__Group_8__0"
    // InternalMatrixGame.g:896:1: rule__GameLogic__Group_8__0 : rule__GameLogic__Group_8__0__Impl rule__GameLogic__Group_8__1 ;
    public final void rule__GameLogic__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:900:1: ( rule__GameLogic__Group_8__0__Impl rule__GameLogic__Group_8__1 )
            // InternalMatrixGame.g:901:2: rule__GameLogic__Group_8__0__Impl rule__GameLogic__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__GameLogic__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_8__1();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_8__0"


    // $ANTLR start "rule__GameLogic__Group_8__0__Impl"
    // InternalMatrixGame.g:908:1: rule__GameLogic__Group_8__0__Impl : ( 'has_state' ) ;
    public final void rule__GameLogic__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:912:1: ( ( 'has_state' ) )
            // InternalMatrixGame.g:913:1: ( 'has_state' )
            {
            // InternalMatrixGame.g:913:1: ( 'has_state' )
            // InternalMatrixGame.g:914:2: 'has_state'
            {
             before(grammarAccess.getGameLogicAccess().getHas_stateKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getHas_stateKeyword_8_0()); 

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
    // $ANTLR end "rule__GameLogic__Group_8__0__Impl"


    // $ANTLR start "rule__GameLogic__Group_8__1"
    // InternalMatrixGame.g:923:1: rule__GameLogic__Group_8__1 : rule__GameLogic__Group_8__1__Impl rule__GameLogic__Group_8__2 ;
    public final void rule__GameLogic__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:927:1: ( rule__GameLogic__Group_8__1__Impl rule__GameLogic__Group_8__2 )
            // InternalMatrixGame.g:928:2: rule__GameLogic__Group_8__1__Impl rule__GameLogic__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__GameLogic__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_8__2();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_8__1"


    // $ANTLR start "rule__GameLogic__Group_8__1__Impl"
    // InternalMatrixGame.g:935:1: rule__GameLogic__Group_8__1__Impl : ( '{' ) ;
    public final void rule__GameLogic__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:939:1: ( ( '{' ) )
            // InternalMatrixGame.g:940:1: ( '{' )
            {
            // InternalMatrixGame.g:940:1: ( '{' )
            // InternalMatrixGame.g:941:2: '{'
            {
             before(grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__GameLogic__Group_8__1__Impl"


    // $ANTLR start "rule__GameLogic__Group_8__2"
    // InternalMatrixGame.g:950:1: rule__GameLogic__Group_8__2 : rule__GameLogic__Group_8__2__Impl rule__GameLogic__Group_8__3 ;
    public final void rule__GameLogic__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:954:1: ( rule__GameLogic__Group_8__2__Impl rule__GameLogic__Group_8__3 )
            // InternalMatrixGame.g:955:2: rule__GameLogic__Group_8__2__Impl rule__GameLogic__Group_8__3
            {
            pushFollow(FOLLOW_11);
            rule__GameLogic__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_8__3();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_8__2"


    // $ANTLR start "rule__GameLogic__Group_8__2__Impl"
    // InternalMatrixGame.g:962:1: rule__GameLogic__Group_8__2__Impl : ( ( rule__GameLogic__Has_stateAssignment_8_2 ) ) ;
    public final void rule__GameLogic__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:966:1: ( ( ( rule__GameLogic__Has_stateAssignment_8_2 ) ) )
            // InternalMatrixGame.g:967:1: ( ( rule__GameLogic__Has_stateAssignment_8_2 ) )
            {
            // InternalMatrixGame.g:967:1: ( ( rule__GameLogic__Has_stateAssignment_8_2 ) )
            // InternalMatrixGame.g:968:2: ( rule__GameLogic__Has_stateAssignment_8_2 )
            {
             before(grammarAccess.getGameLogicAccess().getHas_stateAssignment_8_2()); 
            // InternalMatrixGame.g:969:2: ( rule__GameLogic__Has_stateAssignment_8_2 )
            // InternalMatrixGame.g:969:3: rule__GameLogic__Has_stateAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Has_stateAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getGameLogicAccess().getHas_stateAssignment_8_2()); 

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
    // $ANTLR end "rule__GameLogic__Group_8__2__Impl"


    // $ANTLR start "rule__GameLogic__Group_8__3"
    // InternalMatrixGame.g:977:1: rule__GameLogic__Group_8__3 : rule__GameLogic__Group_8__3__Impl rule__GameLogic__Group_8__4 ;
    public final void rule__GameLogic__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:981:1: ( rule__GameLogic__Group_8__3__Impl rule__GameLogic__Group_8__4 )
            // InternalMatrixGame.g:982:2: rule__GameLogic__Group_8__3__Impl rule__GameLogic__Group_8__4
            {
            pushFollow(FOLLOW_11);
            rule__GameLogic__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_8__4();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_8__3"


    // $ANTLR start "rule__GameLogic__Group_8__3__Impl"
    // InternalMatrixGame.g:989:1: rule__GameLogic__Group_8__3__Impl : ( ( rule__GameLogic__Group_8_3__0 )* ) ;
    public final void rule__GameLogic__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:993:1: ( ( ( rule__GameLogic__Group_8_3__0 )* ) )
            // InternalMatrixGame.g:994:1: ( ( rule__GameLogic__Group_8_3__0 )* )
            {
            // InternalMatrixGame.g:994:1: ( ( rule__GameLogic__Group_8_3__0 )* )
            // InternalMatrixGame.g:995:2: ( rule__GameLogic__Group_8_3__0 )*
            {
             before(grammarAccess.getGameLogicAccess().getGroup_8_3()); 
            // InternalMatrixGame.g:996:2: ( rule__GameLogic__Group_8_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMatrixGame.g:996:3: rule__GameLogic__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__GameLogic__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getGameLogicAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__GameLogic__Group_8__3__Impl"


    // $ANTLR start "rule__GameLogic__Group_8__4"
    // InternalMatrixGame.g:1004:1: rule__GameLogic__Group_8__4 : rule__GameLogic__Group_8__4__Impl ;
    public final void rule__GameLogic__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1008:1: ( rule__GameLogic__Group_8__4__Impl )
            // InternalMatrixGame.g:1009:2: rule__GameLogic__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_8__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_8__4"


    // $ANTLR start "rule__GameLogic__Group_8__4__Impl"
    // InternalMatrixGame.g:1015:1: rule__GameLogic__Group_8__4__Impl : ( '}' ) ;
    public final void rule__GameLogic__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1019:1: ( ( '}' ) )
            // InternalMatrixGame.g:1020:1: ( '}' )
            {
            // InternalMatrixGame.g:1020:1: ( '}' )
            // InternalMatrixGame.g:1021:2: '}'
            {
             before(grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__GameLogic__Group_8__4__Impl"


    // $ANTLR start "rule__GameLogic__Group_8_3__0"
    // InternalMatrixGame.g:1031:1: rule__GameLogic__Group_8_3__0 : rule__GameLogic__Group_8_3__0__Impl rule__GameLogic__Group_8_3__1 ;
    public final void rule__GameLogic__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1035:1: ( rule__GameLogic__Group_8_3__0__Impl rule__GameLogic__Group_8_3__1 )
            // InternalMatrixGame.g:1036:2: rule__GameLogic__Group_8_3__0__Impl rule__GameLogic__Group_8_3__1
            {
            pushFollow(FOLLOW_13);
            rule__GameLogic__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_8_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_8_3__0"


    // $ANTLR start "rule__GameLogic__Group_8_3__0__Impl"
    // InternalMatrixGame.g:1043:1: rule__GameLogic__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__GameLogic__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1047:1: ( ( ',' ) )
            // InternalMatrixGame.g:1048:1: ( ',' )
            {
            // InternalMatrixGame.g:1048:1: ( ',' )
            // InternalMatrixGame.g:1049:2: ','
            {
             before(grammarAccess.getGameLogicAccess().getCommaKeyword_8_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGameLogicAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__GameLogic__Group_8_3__0__Impl"


    // $ANTLR start "rule__GameLogic__Group_8_3__1"
    // InternalMatrixGame.g:1058:1: rule__GameLogic__Group_8_3__1 : rule__GameLogic__Group_8_3__1__Impl ;
    public final void rule__GameLogic__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1062:1: ( rule__GameLogic__Group_8_3__1__Impl )
            // InternalMatrixGame.g:1063:2: rule__GameLogic__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Group_8_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__GameLogic__Group_8_3__1"


    // $ANTLR start "rule__GameLogic__Group_8_3__1__Impl"
    // InternalMatrixGame.g:1069:1: rule__GameLogic__Group_8_3__1__Impl : ( ( rule__GameLogic__Has_stateAssignment_8_3_1 ) ) ;
    public final void rule__GameLogic__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1073:1: ( ( ( rule__GameLogic__Has_stateAssignment_8_3_1 ) ) )
            // InternalMatrixGame.g:1074:1: ( ( rule__GameLogic__Has_stateAssignment_8_3_1 ) )
            {
            // InternalMatrixGame.g:1074:1: ( ( rule__GameLogic__Has_stateAssignment_8_3_1 ) )
            // InternalMatrixGame.g:1075:2: ( rule__GameLogic__Has_stateAssignment_8_3_1 )
            {
             before(grammarAccess.getGameLogicAccess().getHas_stateAssignment_8_3_1()); 
            // InternalMatrixGame.g:1076:2: ( rule__GameLogic__Has_stateAssignment_8_3_1 )
            // InternalMatrixGame.g:1076:3: rule__GameLogic__Has_stateAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GameLogic__Has_stateAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameLogicAccess().getHas_stateAssignment_8_3_1()); 

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
    // $ANTLR end "rule__GameLogic__Group_8_3__1__Impl"


    // $ANTLR start "rule__Player__Group__0"
    // InternalMatrixGame.g:1085:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1089:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalMatrixGame.g:1090:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Player__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group__0"


    // $ANTLR start "rule__Player__Group__0__Impl"
    // InternalMatrixGame.g:1097:1: rule__Player__Group__0__Impl : ( () ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1101:1: ( ( () ) )
            // InternalMatrixGame.g:1102:1: ( () )
            {
            // InternalMatrixGame.g:1102:1: ( () )
            // InternalMatrixGame.g:1103:2: ()
            {
             before(grammarAccess.getPlayerAccess().getPlayerAction_0()); 
            // InternalMatrixGame.g:1104:2: ()
            // InternalMatrixGame.g:1104:3: 
            {
            }

             after(grammarAccess.getPlayerAccess().getPlayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0__Impl"


    // $ANTLR start "rule__Player__Group__1"
    // InternalMatrixGame.g:1112:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1116:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalMatrixGame.g:1117:2: rule__Player__Group__1__Impl rule__Player__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Player__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group__1"


    // $ANTLR start "rule__Player__Group__1__Impl"
    // InternalMatrixGame.g:1124:1: rule__Player__Group__1__Impl : ( 'Player' ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1128:1: ( ( 'Player' ) )
            // InternalMatrixGame.g:1129:1: ( 'Player' )
            {
            // InternalMatrixGame.g:1129:1: ( 'Player' )
            // InternalMatrixGame.g:1130:2: 'Player'
            {
             before(grammarAccess.getPlayerAccess().getPlayerKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getPlayerKeyword_1()); 

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
    // $ANTLR end "rule__Player__Group__1__Impl"


    // $ANTLR start "rule__Player__Group__2"
    // InternalMatrixGame.g:1139:1: rule__Player__Group__2 : rule__Player__Group__2__Impl rule__Player__Group__3 ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1143:1: ( rule__Player__Group__2__Impl rule__Player__Group__3 )
            // InternalMatrixGame.g:1144:2: rule__Player__Group__2__Impl rule__Player__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Player__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group__2"


    // $ANTLR start "rule__Player__Group__2__Impl"
    // InternalMatrixGame.g:1151:1: rule__Player__Group__2__Impl : ( ( rule__Player__NameAssignment_2 ) ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1155:1: ( ( ( rule__Player__NameAssignment_2 ) ) )
            // InternalMatrixGame.g:1156:1: ( ( rule__Player__NameAssignment_2 ) )
            {
            // InternalMatrixGame.g:1156:1: ( ( rule__Player__NameAssignment_2 ) )
            // InternalMatrixGame.g:1157:2: ( rule__Player__NameAssignment_2 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_2()); 
            // InternalMatrixGame.g:1158:2: ( rule__Player__NameAssignment_2 )
            // InternalMatrixGame.g:1158:3: rule__Player__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Player__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Player__Group__2__Impl"


    // $ANTLR start "rule__Player__Group__3"
    // InternalMatrixGame.g:1166:1: rule__Player__Group__3 : rule__Player__Group__3__Impl rule__Player__Group__4 ;
    public final void rule__Player__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1170:1: ( rule__Player__Group__3__Impl rule__Player__Group__4 )
            // InternalMatrixGame.g:1171:2: rule__Player__Group__3__Impl rule__Player__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Player__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group__3"


    // $ANTLR start "rule__Player__Group__3__Impl"
    // InternalMatrixGame.g:1178:1: rule__Player__Group__3__Impl : ( '{' ) ;
    public final void rule__Player__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1182:1: ( ( '{' ) )
            // InternalMatrixGame.g:1183:1: ( '{' )
            {
            // InternalMatrixGame.g:1183:1: ( '{' )
            // InternalMatrixGame.g:1184:2: '{'
            {
             before(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Player__Group__3__Impl"


    // $ANTLR start "rule__Player__Group__4"
    // InternalMatrixGame.g:1193:1: rule__Player__Group__4 : rule__Player__Group__4__Impl rule__Player__Group__5 ;
    public final void rule__Player__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1197:1: ( rule__Player__Group__4__Impl rule__Player__Group__5 )
            // InternalMatrixGame.g:1198:2: rule__Player__Group__4__Impl rule__Player__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Player__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group__4"


    // $ANTLR start "rule__Player__Group__4__Impl"
    // InternalMatrixGame.g:1205:1: rule__Player__Group__4__Impl : ( ( rule__Player__Group_4__0 )? ) ;
    public final void rule__Player__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1209:1: ( ( ( rule__Player__Group_4__0 )? ) )
            // InternalMatrixGame.g:1210:1: ( ( rule__Player__Group_4__0 )? )
            {
            // InternalMatrixGame.g:1210:1: ( ( rule__Player__Group_4__0 )? )
            // InternalMatrixGame.g:1211:2: ( rule__Player__Group_4__0 )?
            {
             before(grammarAccess.getPlayerAccess().getGroup_4()); 
            // InternalMatrixGame.g:1212:2: ( rule__Player__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMatrixGame.g:1212:3: rule__Player__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Player__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlayerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Player__Group__4__Impl"


    // $ANTLR start "rule__Player__Group__5"
    // InternalMatrixGame.g:1220:1: rule__Player__Group__5 : rule__Player__Group__5__Impl rule__Player__Group__6 ;
    public final void rule__Player__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1224:1: ( rule__Player__Group__5__Impl rule__Player__Group__6 )
            // InternalMatrixGame.g:1225:2: rule__Player__Group__5__Impl rule__Player__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Player__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group__5"


    // $ANTLR start "rule__Player__Group__5__Impl"
    // InternalMatrixGame.g:1232:1: rule__Player__Group__5__Impl : ( ( rule__Player__Group_5__0 )? ) ;
    public final void rule__Player__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1236:1: ( ( ( rule__Player__Group_5__0 )? ) )
            // InternalMatrixGame.g:1237:1: ( ( rule__Player__Group_5__0 )? )
            {
            // InternalMatrixGame.g:1237:1: ( ( rule__Player__Group_5__0 )? )
            // InternalMatrixGame.g:1238:2: ( rule__Player__Group_5__0 )?
            {
             before(grammarAccess.getPlayerAccess().getGroup_5()); 
            // InternalMatrixGame.g:1239:2: ( rule__Player__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMatrixGame.g:1239:3: rule__Player__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Player__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlayerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Player__Group__5__Impl"


    // $ANTLR start "rule__Player__Group__6"
    // InternalMatrixGame.g:1247:1: rule__Player__Group__6 : rule__Player__Group__6__Impl ;
    public final void rule__Player__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1251:1: ( rule__Player__Group__6__Impl )
            // InternalMatrixGame.g:1252:2: rule__Player__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__6__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group__6"


    // $ANTLR start "rule__Player__Group__6__Impl"
    // InternalMatrixGame.g:1258:1: rule__Player__Group__6__Impl : ( '}' ) ;
    public final void rule__Player__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1262:1: ( ( '}' ) )
            // InternalMatrixGame.g:1263:1: ( '}' )
            {
            // InternalMatrixGame.g:1263:1: ( '}' )
            // InternalMatrixGame.g:1264:2: '}'
            {
             before(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Player__Group__6__Impl"


    // $ANTLR start "rule__Player__Group_4__0"
    // InternalMatrixGame.g:1274:1: rule__Player__Group_4__0 : rule__Player__Group_4__0__Impl rule__Player__Group_4__1 ;
    public final void rule__Player__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1278:1: ( rule__Player__Group_4__0__Impl rule__Player__Group_4__1 )
            // InternalMatrixGame.g:1279:2: rule__Player__Group_4__0__Impl rule__Player__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Player__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group_4__0"


    // $ANTLR start "rule__Player__Group_4__0__Impl"
    // InternalMatrixGame.g:1286:1: rule__Player__Group_4__0__Impl : ( 'score' ) ;
    public final void rule__Player__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1290:1: ( ( 'score' ) )
            // InternalMatrixGame.g:1291:1: ( 'score' )
            {
            // InternalMatrixGame.g:1291:1: ( 'score' )
            // InternalMatrixGame.g:1292:2: 'score'
            {
             before(grammarAccess.getPlayerAccess().getScoreKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getScoreKeyword_4_0()); 

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
    // $ANTLR end "rule__Player__Group_4__0__Impl"


    // $ANTLR start "rule__Player__Group_4__1"
    // InternalMatrixGame.g:1301:1: rule__Player__Group_4__1 : rule__Player__Group_4__1__Impl ;
    public final void rule__Player__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1305:1: ( rule__Player__Group_4__1__Impl )
            // InternalMatrixGame.g:1306:2: rule__Player__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group_4__1"


    // $ANTLR start "rule__Player__Group_4__1__Impl"
    // InternalMatrixGame.g:1312:1: rule__Player__Group_4__1__Impl : ( ( rule__Player__ScoreAssignment_4_1 ) ) ;
    public final void rule__Player__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1316:1: ( ( ( rule__Player__ScoreAssignment_4_1 ) ) )
            // InternalMatrixGame.g:1317:1: ( ( rule__Player__ScoreAssignment_4_1 ) )
            {
            // InternalMatrixGame.g:1317:1: ( ( rule__Player__ScoreAssignment_4_1 ) )
            // InternalMatrixGame.g:1318:2: ( rule__Player__ScoreAssignment_4_1 )
            {
             before(grammarAccess.getPlayerAccess().getScoreAssignment_4_1()); 
            // InternalMatrixGame.g:1319:2: ( rule__Player__ScoreAssignment_4_1 )
            // InternalMatrixGame.g:1319:3: rule__Player__ScoreAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__ScoreAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getScoreAssignment_4_1()); 

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
    // $ANTLR end "rule__Player__Group_4__1__Impl"


    // $ANTLR start "rule__Player__Group_5__0"
    // InternalMatrixGame.g:1328:1: rule__Player__Group_5__0 : rule__Player__Group_5__0__Impl rule__Player__Group_5__1 ;
    public final void rule__Player__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1332:1: ( rule__Player__Group_5__0__Impl rule__Player__Group_5__1 )
            // InternalMatrixGame.g:1333:2: rule__Player__Group_5__0__Impl rule__Player__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Player__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group_5__0"


    // $ANTLR start "rule__Player__Group_5__0__Impl"
    // InternalMatrixGame.g:1340:1: rule__Player__Group_5__0__Impl : ( 'takes_action' ) ;
    public final void rule__Player__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1344:1: ( ( 'takes_action' ) )
            // InternalMatrixGame.g:1345:1: ( 'takes_action' )
            {
            // InternalMatrixGame.g:1345:1: ( 'takes_action' )
            // InternalMatrixGame.g:1346:2: 'takes_action'
            {
             before(grammarAccess.getPlayerAccess().getTakes_actionKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getTakes_actionKeyword_5_0()); 

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
    // $ANTLR end "rule__Player__Group_5__0__Impl"


    // $ANTLR start "rule__Player__Group_5__1"
    // InternalMatrixGame.g:1355:1: rule__Player__Group_5__1 : rule__Player__Group_5__1__Impl rule__Player__Group_5__2 ;
    public final void rule__Player__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1359:1: ( rule__Player__Group_5__1__Impl rule__Player__Group_5__2 )
            // InternalMatrixGame.g:1360:2: rule__Player__Group_5__1__Impl rule__Player__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Player__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_5__2();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group_5__1"


    // $ANTLR start "rule__Player__Group_5__1__Impl"
    // InternalMatrixGame.g:1367:1: rule__Player__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Player__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1371:1: ( ( '(' ) )
            // InternalMatrixGame.g:1372:1: ( '(' )
            {
            // InternalMatrixGame.g:1372:1: ( '(' )
            // InternalMatrixGame.g:1373:2: '('
            {
             before(grammarAccess.getPlayerAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__Player__Group_5__1__Impl"


    // $ANTLR start "rule__Player__Group_5__2"
    // InternalMatrixGame.g:1382:1: rule__Player__Group_5__2 : rule__Player__Group_5__2__Impl rule__Player__Group_5__3 ;
    public final void rule__Player__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1386:1: ( rule__Player__Group_5__2__Impl rule__Player__Group_5__3 )
            // InternalMatrixGame.g:1387:2: rule__Player__Group_5__2__Impl rule__Player__Group_5__3
            {
            pushFollow(FOLLOW_17);
            rule__Player__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_5__3();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group_5__2"


    // $ANTLR start "rule__Player__Group_5__2__Impl"
    // InternalMatrixGame.g:1394:1: rule__Player__Group_5__2__Impl : ( ( rule__Player__Takes_actionAssignment_5_2 ) ) ;
    public final void rule__Player__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1398:1: ( ( ( rule__Player__Takes_actionAssignment_5_2 ) ) )
            // InternalMatrixGame.g:1399:1: ( ( rule__Player__Takes_actionAssignment_5_2 ) )
            {
            // InternalMatrixGame.g:1399:1: ( ( rule__Player__Takes_actionAssignment_5_2 ) )
            // InternalMatrixGame.g:1400:2: ( rule__Player__Takes_actionAssignment_5_2 )
            {
             before(grammarAccess.getPlayerAccess().getTakes_actionAssignment_5_2()); 
            // InternalMatrixGame.g:1401:2: ( rule__Player__Takes_actionAssignment_5_2 )
            // InternalMatrixGame.g:1401:3: rule__Player__Takes_actionAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Player__Takes_actionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getTakes_actionAssignment_5_2()); 

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
    // $ANTLR end "rule__Player__Group_5__2__Impl"


    // $ANTLR start "rule__Player__Group_5__3"
    // InternalMatrixGame.g:1409:1: rule__Player__Group_5__3 : rule__Player__Group_5__3__Impl rule__Player__Group_5__4 ;
    public final void rule__Player__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1413:1: ( rule__Player__Group_5__3__Impl rule__Player__Group_5__4 )
            // InternalMatrixGame.g:1414:2: rule__Player__Group_5__3__Impl rule__Player__Group_5__4
            {
            pushFollow(FOLLOW_17);
            rule__Player__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_5__4();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group_5__3"


    // $ANTLR start "rule__Player__Group_5__3__Impl"
    // InternalMatrixGame.g:1421:1: rule__Player__Group_5__3__Impl : ( ( rule__Player__Group_5_3__0 )* ) ;
    public final void rule__Player__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1425:1: ( ( ( rule__Player__Group_5_3__0 )* ) )
            // InternalMatrixGame.g:1426:1: ( ( rule__Player__Group_5_3__0 )* )
            {
            // InternalMatrixGame.g:1426:1: ( ( rule__Player__Group_5_3__0 )* )
            // InternalMatrixGame.g:1427:2: ( rule__Player__Group_5_3__0 )*
            {
             before(grammarAccess.getPlayerAccess().getGroup_5_3()); 
            // InternalMatrixGame.g:1428:2: ( rule__Player__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMatrixGame.g:1428:3: rule__Player__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Player__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPlayerAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Player__Group_5__3__Impl"


    // $ANTLR start "rule__Player__Group_5__4"
    // InternalMatrixGame.g:1436:1: rule__Player__Group_5__4 : rule__Player__Group_5__4__Impl ;
    public final void rule__Player__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1440:1: ( rule__Player__Group_5__4__Impl )
            // InternalMatrixGame.g:1441:2: rule__Player__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_5__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group_5__4"


    // $ANTLR start "rule__Player__Group_5__4__Impl"
    // InternalMatrixGame.g:1447:1: rule__Player__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Player__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1451:1: ( ( ')' ) )
            // InternalMatrixGame.g:1452:1: ( ')' )
            {
            // InternalMatrixGame.g:1452:1: ( ')' )
            // InternalMatrixGame.g:1453:2: ')'
            {
             before(grammarAccess.getPlayerAccess().getRightParenthesisKeyword_5_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Player__Group_5__4__Impl"


    // $ANTLR start "rule__Player__Group_5_3__0"
    // InternalMatrixGame.g:1463:1: rule__Player__Group_5_3__0 : rule__Player__Group_5_3__0__Impl rule__Player__Group_5_3__1 ;
    public final void rule__Player__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1467:1: ( rule__Player__Group_5_3__0__Impl rule__Player__Group_5_3__1 )
            // InternalMatrixGame.g:1468:2: rule__Player__Group_5_3__0__Impl rule__Player__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Player__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_5_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group_5_3__0"


    // $ANTLR start "rule__Player__Group_5_3__0__Impl"
    // InternalMatrixGame.g:1475:1: rule__Player__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Player__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1479:1: ( ( ',' ) )
            // InternalMatrixGame.g:1480:1: ( ',' )
            {
            // InternalMatrixGame.g:1480:1: ( ',' )
            // InternalMatrixGame.g:1481:2: ','
            {
             before(grammarAccess.getPlayerAccess().getCommaKeyword_5_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Player__Group_5_3__0__Impl"


    // $ANTLR start "rule__Player__Group_5_3__1"
    // InternalMatrixGame.g:1490:1: rule__Player__Group_5_3__1 : rule__Player__Group_5_3__1__Impl ;
    public final void rule__Player__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1494:1: ( rule__Player__Group_5_3__1__Impl )
            // InternalMatrixGame.g:1495:2: rule__Player__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_5_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Player__Group_5_3__1"


    // $ANTLR start "rule__Player__Group_5_3__1__Impl"
    // InternalMatrixGame.g:1501:1: rule__Player__Group_5_3__1__Impl : ( ( rule__Player__Takes_actionAssignment_5_3_1 ) ) ;
    public final void rule__Player__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1505:1: ( ( ( rule__Player__Takes_actionAssignment_5_3_1 ) ) )
            // InternalMatrixGame.g:1506:1: ( ( rule__Player__Takes_actionAssignment_5_3_1 ) )
            {
            // InternalMatrixGame.g:1506:1: ( ( rule__Player__Takes_actionAssignment_5_3_1 ) )
            // InternalMatrixGame.g:1507:2: ( rule__Player__Takes_actionAssignment_5_3_1 )
            {
             before(grammarAccess.getPlayerAccess().getTakes_actionAssignment_5_3_1()); 
            // InternalMatrixGame.g:1508:2: ( rule__Player__Takes_actionAssignment_5_3_1 )
            // InternalMatrixGame.g:1508:3: rule__Player__Takes_actionAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__Takes_actionAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getTakes_actionAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Player__Group_5_3__1__Impl"


    // $ANTLR start "rule__Map__Group__0"
    // InternalMatrixGame.g:1517:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1521:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalMatrixGame.g:1522:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Map__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__0"


    // $ANTLR start "rule__Map__Group__0__Impl"
    // InternalMatrixGame.g:1529:1: rule__Map__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1533:1: ( ( 'Map' ) )
            // InternalMatrixGame.g:1534:1: ( 'Map' )
            {
            // InternalMatrixGame.g:1534:1: ( 'Map' )
            // InternalMatrixGame.g:1535:2: 'Map'
            {
             before(grammarAccess.getMapAccess().getMapKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getMapKeyword_0()); 

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
    // $ANTLR end "rule__Map__Group__0__Impl"


    // $ANTLR start "rule__Map__Group__1"
    // InternalMatrixGame.g:1544:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1548:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // InternalMatrixGame.g:1549:2: rule__Map__Group__1__Impl rule__Map__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Map__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__1"


    // $ANTLR start "rule__Map__Group__1__Impl"
    // InternalMatrixGame.g:1556:1: rule__Map__Group__1__Impl : ( '{' ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1560:1: ( ( '{' ) )
            // InternalMatrixGame.g:1561:1: ( '{' )
            {
            // InternalMatrixGame.g:1561:1: ( '{' )
            // InternalMatrixGame.g:1562:2: '{'
            {
             before(grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Map__Group__1__Impl"


    // $ANTLR start "rule__Map__Group__2"
    // InternalMatrixGame.g:1571:1: rule__Map__Group__2 : rule__Map__Group__2__Impl rule__Map__Group__3 ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1575:1: ( rule__Map__Group__2__Impl rule__Map__Group__3 )
            // InternalMatrixGame.g:1576:2: rule__Map__Group__2__Impl rule__Map__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Map__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__2"


    // $ANTLR start "rule__Map__Group__2__Impl"
    // InternalMatrixGame.g:1583:1: rule__Map__Group__2__Impl : ( ( rule__Map__Group_2__0 )? ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1587:1: ( ( ( rule__Map__Group_2__0 )? ) )
            // InternalMatrixGame.g:1588:1: ( ( rule__Map__Group_2__0 )? )
            {
            // InternalMatrixGame.g:1588:1: ( ( rule__Map__Group_2__0 )? )
            // InternalMatrixGame.g:1589:2: ( rule__Map__Group_2__0 )?
            {
             before(grammarAccess.getMapAccess().getGroup_2()); 
            // InternalMatrixGame.g:1590:2: ( rule__Map__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMatrixGame.g:1590:3: rule__Map__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Map__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMapAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Map__Group__2__Impl"


    // $ANTLR start "rule__Map__Group__3"
    // InternalMatrixGame.g:1598:1: rule__Map__Group__3 : rule__Map__Group__3__Impl rule__Map__Group__4 ;
    public final void rule__Map__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1602:1: ( rule__Map__Group__3__Impl rule__Map__Group__4 )
            // InternalMatrixGame.g:1603:2: rule__Map__Group__3__Impl rule__Map__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Map__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__3"


    // $ANTLR start "rule__Map__Group__3__Impl"
    // InternalMatrixGame.g:1610:1: rule__Map__Group__3__Impl : ( 'mapSizeX' ) ;
    public final void rule__Map__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1614:1: ( ( 'mapSizeX' ) )
            // InternalMatrixGame.g:1615:1: ( 'mapSizeX' )
            {
            // InternalMatrixGame.g:1615:1: ( 'mapSizeX' )
            // InternalMatrixGame.g:1616:2: 'mapSizeX'
            {
             before(grammarAccess.getMapAccess().getMapSizeXKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getMapSizeXKeyword_3()); 

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
    // $ANTLR end "rule__Map__Group__3__Impl"


    // $ANTLR start "rule__Map__Group__4"
    // InternalMatrixGame.g:1625:1: rule__Map__Group__4 : rule__Map__Group__4__Impl rule__Map__Group__5 ;
    public final void rule__Map__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1629:1: ( rule__Map__Group__4__Impl rule__Map__Group__5 )
            // InternalMatrixGame.g:1630:2: rule__Map__Group__4__Impl rule__Map__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Map__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__4"


    // $ANTLR start "rule__Map__Group__4__Impl"
    // InternalMatrixGame.g:1637:1: rule__Map__Group__4__Impl : ( ( rule__Map__MapSizeXAssignment_4 ) ) ;
    public final void rule__Map__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1641:1: ( ( ( rule__Map__MapSizeXAssignment_4 ) ) )
            // InternalMatrixGame.g:1642:1: ( ( rule__Map__MapSizeXAssignment_4 ) )
            {
            // InternalMatrixGame.g:1642:1: ( ( rule__Map__MapSizeXAssignment_4 ) )
            // InternalMatrixGame.g:1643:2: ( rule__Map__MapSizeXAssignment_4 )
            {
             before(grammarAccess.getMapAccess().getMapSizeXAssignment_4()); 
            // InternalMatrixGame.g:1644:2: ( rule__Map__MapSizeXAssignment_4 )
            // InternalMatrixGame.g:1644:3: rule__Map__MapSizeXAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Map__MapSizeXAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getMapSizeXAssignment_4()); 

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
    // $ANTLR end "rule__Map__Group__4__Impl"


    // $ANTLR start "rule__Map__Group__5"
    // InternalMatrixGame.g:1652:1: rule__Map__Group__5 : rule__Map__Group__5__Impl rule__Map__Group__6 ;
    public final void rule__Map__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1656:1: ( rule__Map__Group__5__Impl rule__Map__Group__6 )
            // InternalMatrixGame.g:1657:2: rule__Map__Group__5__Impl rule__Map__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Map__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__5"


    // $ANTLR start "rule__Map__Group__5__Impl"
    // InternalMatrixGame.g:1664:1: rule__Map__Group__5__Impl : ( 'mapSizeY' ) ;
    public final void rule__Map__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1668:1: ( ( 'mapSizeY' ) )
            // InternalMatrixGame.g:1669:1: ( 'mapSizeY' )
            {
            // InternalMatrixGame.g:1669:1: ( 'mapSizeY' )
            // InternalMatrixGame.g:1670:2: 'mapSizeY'
            {
             before(grammarAccess.getMapAccess().getMapSizeYKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getMapSizeYKeyword_5()); 

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
    // $ANTLR end "rule__Map__Group__5__Impl"


    // $ANTLR start "rule__Map__Group__6"
    // InternalMatrixGame.g:1679:1: rule__Map__Group__6 : rule__Map__Group__6__Impl rule__Map__Group__7 ;
    public final void rule__Map__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1683:1: ( rule__Map__Group__6__Impl rule__Map__Group__7 )
            // InternalMatrixGame.g:1684:2: rule__Map__Group__6__Impl rule__Map__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Map__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__6"


    // $ANTLR start "rule__Map__Group__6__Impl"
    // InternalMatrixGame.g:1691:1: rule__Map__Group__6__Impl : ( ( rule__Map__MapSizeYAssignment_6 ) ) ;
    public final void rule__Map__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1695:1: ( ( ( rule__Map__MapSizeYAssignment_6 ) ) )
            // InternalMatrixGame.g:1696:1: ( ( rule__Map__MapSizeYAssignment_6 ) )
            {
            // InternalMatrixGame.g:1696:1: ( ( rule__Map__MapSizeYAssignment_6 ) )
            // InternalMatrixGame.g:1697:2: ( rule__Map__MapSizeYAssignment_6 )
            {
             before(grammarAccess.getMapAccess().getMapSizeYAssignment_6()); 
            // InternalMatrixGame.g:1698:2: ( rule__Map__MapSizeYAssignment_6 )
            // InternalMatrixGame.g:1698:3: rule__Map__MapSizeYAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Map__MapSizeYAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getMapSizeYAssignment_6()); 

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
    // $ANTLR end "rule__Map__Group__6__Impl"


    // $ANTLR start "rule__Map__Group__7"
    // InternalMatrixGame.g:1706:1: rule__Map__Group__7 : rule__Map__Group__7__Impl rule__Map__Group__8 ;
    public final void rule__Map__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1710:1: ( rule__Map__Group__7__Impl rule__Map__Group__8 )
            // InternalMatrixGame.g:1711:2: rule__Map__Group__7__Impl rule__Map__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Map__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__7"


    // $ANTLR start "rule__Map__Group__7__Impl"
    // InternalMatrixGame.g:1718:1: rule__Map__Group__7__Impl : ( ( rule__Map__Group_7__0 )? ) ;
    public final void rule__Map__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1722:1: ( ( ( rule__Map__Group_7__0 )? ) )
            // InternalMatrixGame.g:1723:1: ( ( rule__Map__Group_7__0 )? )
            {
            // InternalMatrixGame.g:1723:1: ( ( rule__Map__Group_7__0 )? )
            // InternalMatrixGame.g:1724:2: ( rule__Map__Group_7__0 )?
            {
             before(grammarAccess.getMapAccess().getGroup_7()); 
            // InternalMatrixGame.g:1725:2: ( rule__Map__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMatrixGame.g:1725:3: rule__Map__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Map__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMapAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Map__Group__7__Impl"


    // $ANTLR start "rule__Map__Group__8"
    // InternalMatrixGame.g:1733:1: rule__Map__Group__8 : rule__Map__Group__8__Impl rule__Map__Group__9 ;
    public final void rule__Map__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1737:1: ( rule__Map__Group__8__Impl rule__Map__Group__9 )
            // InternalMatrixGame.g:1738:2: rule__Map__Group__8__Impl rule__Map__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Map__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__8"


    // $ANTLR start "rule__Map__Group__8__Impl"
    // InternalMatrixGame.g:1745:1: rule__Map__Group__8__Impl : ( 'tile' ) ;
    public final void rule__Map__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1749:1: ( ( 'tile' ) )
            // InternalMatrixGame.g:1750:1: ( 'tile' )
            {
            // InternalMatrixGame.g:1750:1: ( 'tile' )
            // InternalMatrixGame.g:1751:2: 'tile'
            {
             before(grammarAccess.getMapAccess().getTileKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getTileKeyword_8()); 

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
    // $ANTLR end "rule__Map__Group__8__Impl"


    // $ANTLR start "rule__Map__Group__9"
    // InternalMatrixGame.g:1760:1: rule__Map__Group__9 : rule__Map__Group__9__Impl rule__Map__Group__10 ;
    public final void rule__Map__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1764:1: ( rule__Map__Group__9__Impl rule__Map__Group__10 )
            // InternalMatrixGame.g:1765:2: rule__Map__Group__9__Impl rule__Map__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Map__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__9"


    // $ANTLR start "rule__Map__Group__9__Impl"
    // InternalMatrixGame.g:1772:1: rule__Map__Group__9__Impl : ( '{' ) ;
    public final void rule__Map__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1776:1: ( ( '{' ) )
            // InternalMatrixGame.g:1777:1: ( '{' )
            {
            // InternalMatrixGame.g:1777:1: ( '{' )
            // InternalMatrixGame.g:1778:2: '{'
            {
             before(grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Map__Group__9__Impl"


    // $ANTLR start "rule__Map__Group__10"
    // InternalMatrixGame.g:1787:1: rule__Map__Group__10 : rule__Map__Group__10__Impl rule__Map__Group__11 ;
    public final void rule__Map__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1791:1: ( rule__Map__Group__10__Impl rule__Map__Group__11 )
            // InternalMatrixGame.g:1792:2: rule__Map__Group__10__Impl rule__Map__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Map__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__11();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__10"


    // $ANTLR start "rule__Map__Group__10__Impl"
    // InternalMatrixGame.g:1799:1: rule__Map__Group__10__Impl : ( ( rule__Map__TileAssignment_10 ) ) ;
    public final void rule__Map__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1803:1: ( ( ( rule__Map__TileAssignment_10 ) ) )
            // InternalMatrixGame.g:1804:1: ( ( rule__Map__TileAssignment_10 ) )
            {
            // InternalMatrixGame.g:1804:1: ( ( rule__Map__TileAssignment_10 ) )
            // InternalMatrixGame.g:1805:2: ( rule__Map__TileAssignment_10 )
            {
             before(grammarAccess.getMapAccess().getTileAssignment_10()); 
            // InternalMatrixGame.g:1806:2: ( rule__Map__TileAssignment_10 )
            // InternalMatrixGame.g:1806:3: rule__Map__TileAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Map__TileAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getTileAssignment_10()); 

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
    // $ANTLR end "rule__Map__Group__10__Impl"


    // $ANTLR start "rule__Map__Group__11"
    // InternalMatrixGame.g:1814:1: rule__Map__Group__11 : rule__Map__Group__11__Impl rule__Map__Group__12 ;
    public final void rule__Map__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1818:1: ( rule__Map__Group__11__Impl rule__Map__Group__12 )
            // InternalMatrixGame.g:1819:2: rule__Map__Group__11__Impl rule__Map__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Map__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__12();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__11"


    // $ANTLR start "rule__Map__Group__11__Impl"
    // InternalMatrixGame.g:1826:1: rule__Map__Group__11__Impl : ( ( rule__Map__Group_11__0 )* ) ;
    public final void rule__Map__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1830:1: ( ( ( rule__Map__Group_11__0 )* ) )
            // InternalMatrixGame.g:1831:1: ( ( rule__Map__Group_11__0 )* )
            {
            // InternalMatrixGame.g:1831:1: ( ( rule__Map__Group_11__0 )* )
            // InternalMatrixGame.g:1832:2: ( rule__Map__Group_11__0 )*
            {
             before(grammarAccess.getMapAccess().getGroup_11()); 
            // InternalMatrixGame.g:1833:2: ( rule__Map__Group_11__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMatrixGame.g:1833:3: rule__Map__Group_11__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Map__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMapAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Map__Group__11__Impl"


    // $ANTLR start "rule__Map__Group__12"
    // InternalMatrixGame.g:1841:1: rule__Map__Group__12 : rule__Map__Group__12__Impl rule__Map__Group__13 ;
    public final void rule__Map__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1845:1: ( rule__Map__Group__12__Impl rule__Map__Group__13 )
            // InternalMatrixGame.g:1846:2: rule__Map__Group__12__Impl rule__Map__Group__13
            {
            pushFollow(FOLLOW_22);
            rule__Map__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__13();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__12"


    // $ANTLR start "rule__Map__Group__12__Impl"
    // InternalMatrixGame.g:1853:1: rule__Map__Group__12__Impl : ( '}' ) ;
    public final void rule__Map__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1857:1: ( ( '}' ) )
            // InternalMatrixGame.g:1858:1: ( '}' )
            {
            // InternalMatrixGame.g:1858:1: ( '}' )
            // InternalMatrixGame.g:1859:2: '}'
            {
             before(grammarAccess.getMapAccess().getRightCurlyBracketKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Map__Group__12__Impl"


    // $ANTLR start "rule__Map__Group__13"
    // InternalMatrixGame.g:1868:1: rule__Map__Group__13 : rule__Map__Group__13__Impl ;
    public final void rule__Map__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1872:1: ( rule__Map__Group__13__Impl )
            // InternalMatrixGame.g:1873:2: rule__Map__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__13__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group__13"


    // $ANTLR start "rule__Map__Group__13__Impl"
    // InternalMatrixGame.g:1879:1: rule__Map__Group__13__Impl : ( '}' ) ;
    public final void rule__Map__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1883:1: ( ( '}' ) )
            // InternalMatrixGame.g:1884:1: ( '}' )
            {
            // InternalMatrixGame.g:1884:1: ( '}' )
            // InternalMatrixGame.g:1885:2: '}'
            {
             before(grammarAccess.getMapAccess().getRightCurlyBracketKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Map__Group__13__Impl"


    // $ANTLR start "rule__Map__Group_2__0"
    // InternalMatrixGame.g:1895:1: rule__Map__Group_2__0 : rule__Map__Group_2__0__Impl rule__Map__Group_2__1 ;
    public final void rule__Map__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1899:1: ( rule__Map__Group_2__0__Impl rule__Map__Group_2__1 )
            // InternalMatrixGame.g:1900:2: rule__Map__Group_2__0__Impl rule__Map__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Map__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group_2__0"


    // $ANTLR start "rule__Map__Group_2__0__Impl"
    // InternalMatrixGame.g:1907:1: rule__Map__Group_2__0__Impl : ( 'amountOfTiles' ) ;
    public final void rule__Map__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1911:1: ( ( 'amountOfTiles' ) )
            // InternalMatrixGame.g:1912:1: ( 'amountOfTiles' )
            {
            // InternalMatrixGame.g:1912:1: ( 'amountOfTiles' )
            // InternalMatrixGame.g:1913:2: 'amountOfTiles'
            {
             before(grammarAccess.getMapAccess().getAmountOfTilesKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getAmountOfTilesKeyword_2_0()); 

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
    // $ANTLR end "rule__Map__Group_2__0__Impl"


    // $ANTLR start "rule__Map__Group_2__1"
    // InternalMatrixGame.g:1922:1: rule__Map__Group_2__1 : rule__Map__Group_2__1__Impl ;
    public final void rule__Map__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1926:1: ( rule__Map__Group_2__1__Impl )
            // InternalMatrixGame.g:1927:2: rule__Map__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group_2__1"


    // $ANTLR start "rule__Map__Group_2__1__Impl"
    // InternalMatrixGame.g:1933:1: rule__Map__Group_2__1__Impl : ( ( rule__Map__AmountOfTilesAssignment_2_1 ) ) ;
    public final void rule__Map__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1937:1: ( ( ( rule__Map__AmountOfTilesAssignment_2_1 ) ) )
            // InternalMatrixGame.g:1938:1: ( ( rule__Map__AmountOfTilesAssignment_2_1 ) )
            {
            // InternalMatrixGame.g:1938:1: ( ( rule__Map__AmountOfTilesAssignment_2_1 ) )
            // InternalMatrixGame.g:1939:2: ( rule__Map__AmountOfTilesAssignment_2_1 )
            {
             before(grammarAccess.getMapAccess().getAmountOfTilesAssignment_2_1()); 
            // InternalMatrixGame.g:1940:2: ( rule__Map__AmountOfTilesAssignment_2_1 )
            // InternalMatrixGame.g:1940:3: rule__Map__AmountOfTilesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Map__AmountOfTilesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getAmountOfTilesAssignment_2_1()); 

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
    // $ANTLR end "rule__Map__Group_2__1__Impl"


    // $ANTLR start "rule__Map__Group_7__0"
    // InternalMatrixGame.g:1949:1: rule__Map__Group_7__0 : rule__Map__Group_7__0__Impl rule__Map__Group_7__1 ;
    public final void rule__Map__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1953:1: ( rule__Map__Group_7__0__Impl rule__Map__Group_7__1 )
            // InternalMatrixGame.g:1954:2: rule__Map__Group_7__0__Impl rule__Map__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Map__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group_7__1();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group_7__0"


    // $ANTLR start "rule__Map__Group_7__0__Impl"
    // InternalMatrixGame.g:1961:1: rule__Map__Group_7__0__Impl : ( 'mapName' ) ;
    public final void rule__Map__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1965:1: ( ( 'mapName' ) )
            // InternalMatrixGame.g:1966:1: ( 'mapName' )
            {
            // InternalMatrixGame.g:1966:1: ( 'mapName' )
            // InternalMatrixGame.g:1967:2: 'mapName'
            {
             before(grammarAccess.getMapAccess().getMapNameKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getMapNameKeyword_7_0()); 

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
    // $ANTLR end "rule__Map__Group_7__0__Impl"


    // $ANTLR start "rule__Map__Group_7__1"
    // InternalMatrixGame.g:1976:1: rule__Map__Group_7__1 : rule__Map__Group_7__1__Impl ;
    public final void rule__Map__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1980:1: ( rule__Map__Group_7__1__Impl )
            // InternalMatrixGame.g:1981:2: rule__Map__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group_7__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group_7__1"


    // $ANTLR start "rule__Map__Group_7__1__Impl"
    // InternalMatrixGame.g:1987:1: rule__Map__Group_7__1__Impl : ( ( rule__Map__MapNameAssignment_7_1 ) ) ;
    public final void rule__Map__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:1991:1: ( ( ( rule__Map__MapNameAssignment_7_1 ) ) )
            // InternalMatrixGame.g:1992:1: ( ( rule__Map__MapNameAssignment_7_1 ) )
            {
            // InternalMatrixGame.g:1992:1: ( ( rule__Map__MapNameAssignment_7_1 ) )
            // InternalMatrixGame.g:1993:2: ( rule__Map__MapNameAssignment_7_1 )
            {
             before(grammarAccess.getMapAccess().getMapNameAssignment_7_1()); 
            // InternalMatrixGame.g:1994:2: ( rule__Map__MapNameAssignment_7_1 )
            // InternalMatrixGame.g:1994:3: rule__Map__MapNameAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Map__MapNameAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getMapNameAssignment_7_1()); 

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
    // $ANTLR end "rule__Map__Group_7__1__Impl"


    // $ANTLR start "rule__Map__Group_11__0"
    // InternalMatrixGame.g:2003:1: rule__Map__Group_11__0 : rule__Map__Group_11__0__Impl rule__Map__Group_11__1 ;
    public final void rule__Map__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2007:1: ( rule__Map__Group_11__0__Impl rule__Map__Group_11__1 )
            // InternalMatrixGame.g:2008:2: rule__Map__Group_11__0__Impl rule__Map__Group_11__1
            {
            pushFollow(FOLLOW_21);
            rule__Map__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group_11__1();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group_11__0"


    // $ANTLR start "rule__Map__Group_11__0__Impl"
    // InternalMatrixGame.g:2015:1: rule__Map__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Map__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2019:1: ( ( ',' ) )
            // InternalMatrixGame.g:2020:1: ( ',' )
            {
            // InternalMatrixGame.g:2020:1: ( ',' )
            // InternalMatrixGame.g:2021:2: ','
            {
             before(grammarAccess.getMapAccess().getCommaKeyword_11_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getCommaKeyword_11_0()); 

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
    // $ANTLR end "rule__Map__Group_11__0__Impl"


    // $ANTLR start "rule__Map__Group_11__1"
    // InternalMatrixGame.g:2030:1: rule__Map__Group_11__1 : rule__Map__Group_11__1__Impl ;
    public final void rule__Map__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2034:1: ( rule__Map__Group_11__1__Impl )
            // InternalMatrixGame.g:2035:2: rule__Map__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group_11__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Map__Group_11__1"


    // $ANTLR start "rule__Map__Group_11__1__Impl"
    // InternalMatrixGame.g:2041:1: rule__Map__Group_11__1__Impl : ( ( rule__Map__TileAssignment_11_1 ) ) ;
    public final void rule__Map__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2045:1: ( ( ( rule__Map__TileAssignment_11_1 ) ) )
            // InternalMatrixGame.g:2046:1: ( ( rule__Map__TileAssignment_11_1 ) )
            {
            // InternalMatrixGame.g:2046:1: ( ( rule__Map__TileAssignment_11_1 ) )
            // InternalMatrixGame.g:2047:2: ( rule__Map__TileAssignment_11_1 )
            {
             before(grammarAccess.getMapAccess().getTileAssignment_11_1()); 
            // InternalMatrixGame.g:2048:2: ( rule__Map__TileAssignment_11_1 )
            // InternalMatrixGame.g:2048:3: rule__Map__TileAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Map__TileAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getTileAssignment_11_1()); 

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
    // $ANTLR end "rule__Map__Group_11__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalMatrixGame.g:2057:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2061:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMatrixGame.g:2062:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalMatrixGame.g:2069:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2073:1: ( ( () ) )
            // InternalMatrixGame.g:2074:1: ( () )
            {
            // InternalMatrixGame.g:2074:1: ( () )
            // InternalMatrixGame.g:2075:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // InternalMatrixGame.g:2076:2: ()
            // InternalMatrixGame.g:2076:3: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalMatrixGame.g:2084:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2088:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalMatrixGame.g:2089:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalMatrixGame.g:2096:1: rule__Action__Group__1__Impl : ( 'Action' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2100:1: ( ( 'Action' ) )
            // InternalMatrixGame.g:2101:1: ( 'Action' )
            {
            // InternalMatrixGame.g:2101:1: ( 'Action' )
            // InternalMatrixGame.g:2102:2: 'Action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalMatrixGame.g:2111:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2115:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalMatrixGame.g:2116:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalMatrixGame.g:2123:1: rule__Action__Group__2__Impl : ( ( rule__Action__NameAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2127:1: ( ( ( rule__Action__NameAssignment_2 ) ) )
            // InternalMatrixGame.g:2128:1: ( ( rule__Action__NameAssignment_2 ) )
            {
            // InternalMatrixGame.g:2128:1: ( ( rule__Action__NameAssignment_2 ) )
            // InternalMatrixGame.g:2129:2: ( rule__Action__NameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_2()); 
            // InternalMatrixGame.g:2130:2: ( rule__Action__NameAssignment_2 )
            // InternalMatrixGame.g:2130:3: rule__Action__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalMatrixGame.g:2138:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2142:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalMatrixGame.g:2143:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalMatrixGame.g:2150:1: rule__Action__Group__3__Impl : ( '{' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2154:1: ( ( '{' ) )
            // InternalMatrixGame.g:2155:1: ( '{' )
            {
            // InternalMatrixGame.g:2155:1: ( '{' )
            // InternalMatrixGame.g:2156:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalMatrixGame.g:2165:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2169:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalMatrixGame.g:2170:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalMatrixGame.g:2177:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2181:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // InternalMatrixGame.g:2182:1: ( ( rule__Action__Group_4__0 )? )
            {
            // InternalMatrixGame.g:2182:1: ( ( rule__Action__Group_4__0 )? )
            // InternalMatrixGame.g:2183:2: ( rule__Action__Group_4__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_4()); 
            // InternalMatrixGame.g:2184:2: ( rule__Action__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMatrixGame.g:2184:3: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalMatrixGame.g:2192:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2196:1: ( rule__Action__Group__5__Impl )
            // InternalMatrixGame.g:2197:2: rule__Action__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalMatrixGame.g:2203:1: rule__Action__Group__5__Impl : ( '}' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2207:1: ( ( '}' ) )
            // InternalMatrixGame.g:2208:1: ( '}' )
            {
            // InternalMatrixGame.g:2208:1: ( '}' )
            // InternalMatrixGame.g:2209:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group_4__0"
    // InternalMatrixGame.g:2219:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2223:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // InternalMatrixGame.g:2224:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Action__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__Action__Group_4__0"


    // $ANTLR start "rule__Action__Group_4__0__Impl"
    // InternalMatrixGame.g:2231:1: rule__Action__Group_4__0__Impl : ( 'actionType' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2235:1: ( ( 'actionType' ) )
            // InternalMatrixGame.g:2236:1: ( 'actionType' )
            {
            // InternalMatrixGame.g:2236:1: ( 'actionType' )
            // InternalMatrixGame.g:2237:2: 'actionType'
            {
             before(grammarAccess.getActionAccess().getActionTypeKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__Action__Group_4__0__Impl"


    // $ANTLR start "rule__Action__Group_4__1"
    // InternalMatrixGame.g:2246:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2250:1: ( rule__Action__Group_4__1__Impl )
            // InternalMatrixGame.g:2251:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Action__Group_4__1"


    // $ANTLR start "rule__Action__Group_4__1__Impl"
    // InternalMatrixGame.g:2257:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__ActionTypeAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2261:1: ( ( ( rule__Action__ActionTypeAssignment_4_1 ) ) )
            // InternalMatrixGame.g:2262:1: ( ( rule__Action__ActionTypeAssignment_4_1 ) )
            {
            // InternalMatrixGame.g:2262:1: ( ( rule__Action__ActionTypeAssignment_4_1 ) )
            // InternalMatrixGame.g:2263:2: ( rule__Action__ActionTypeAssignment_4_1 )
            {
             before(grammarAccess.getActionAccess().getActionTypeAssignment_4_1()); 
            // InternalMatrixGame.g:2264:2: ( rule__Action__ActionTypeAssignment_4_1 )
            // InternalMatrixGame.g:2264:3: rule__Action__ActionTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Action__Group_4__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalMatrixGame.g:2273:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2277:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMatrixGame.g:2278:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


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
    // InternalMatrixGame.g:2285:1: rule__State__Group__0__Impl : ( ( rule__State__FlagsPlacedAssignment_0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2289:1: ( ( ( rule__State__FlagsPlacedAssignment_0 )? ) )
            // InternalMatrixGame.g:2290:1: ( ( rule__State__FlagsPlacedAssignment_0 )? )
            {
            // InternalMatrixGame.g:2290:1: ( ( rule__State__FlagsPlacedAssignment_0 )? )
            // InternalMatrixGame.g:2291:2: ( rule__State__FlagsPlacedAssignment_0 )?
            {
             before(grammarAccess.getStateAccess().getFlagsPlacedAssignment_0()); 
            // InternalMatrixGame.g:2292:2: ( rule__State__FlagsPlacedAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMatrixGame.g:2292:3: rule__State__FlagsPlacedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__FlagsPlacedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getFlagsPlacedAssignment_0()); 

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
    // InternalMatrixGame.g:2300:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2304:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalMatrixGame.g:2305:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


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
    // InternalMatrixGame.g:2312:1: rule__State__Group__1__Impl : ( ( rule__State__IsOverAssignment_1 )? ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2316:1: ( ( ( rule__State__IsOverAssignment_1 )? ) )
            // InternalMatrixGame.g:2317:1: ( ( rule__State__IsOverAssignment_1 )? )
            {
            // InternalMatrixGame.g:2317:1: ( ( rule__State__IsOverAssignment_1 )? )
            // InternalMatrixGame.g:2318:2: ( rule__State__IsOverAssignment_1 )?
            {
             before(grammarAccess.getStateAccess().getIsOverAssignment_1()); 
            // InternalMatrixGame.g:2319:2: ( rule__State__IsOverAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==53) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMatrixGame.g:2319:3: rule__State__IsOverAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__IsOverAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getIsOverAssignment_1()); 

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
    // InternalMatrixGame.g:2327:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2331:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalMatrixGame.g:2332:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


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
    // InternalMatrixGame.g:2339:1: rule__State__Group__2__Impl : ( 'State' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2343:1: ( ( 'State' ) )
            // InternalMatrixGame.g:2344:1: ( 'State' )
            {
            // InternalMatrixGame.g:2344:1: ( 'State' )
            // InternalMatrixGame.g:2345:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_2()); 

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
    // InternalMatrixGame.g:2354:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2358:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalMatrixGame.g:2359:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


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
    // InternalMatrixGame.g:2366:1: rule__State__Group__3__Impl : ( ( rule__State__NameAssignment_3 ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2370:1: ( ( ( rule__State__NameAssignment_3 ) ) )
            // InternalMatrixGame.g:2371:1: ( ( rule__State__NameAssignment_3 ) )
            {
            // InternalMatrixGame.g:2371:1: ( ( rule__State__NameAssignment_3 ) )
            // InternalMatrixGame.g:2372:2: ( rule__State__NameAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_3()); 
            // InternalMatrixGame.g:2373:2: ( rule__State__NameAssignment_3 )
            // InternalMatrixGame.g:2373:3: rule__State__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_3()); 

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
    // InternalMatrixGame.g:2381:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2385:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalMatrixGame.g:2386:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;


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
    // InternalMatrixGame.g:2393:1: rule__State__Group__4__Impl : ( '{' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2397:1: ( ( '{' ) )
            // InternalMatrixGame.g:2398:1: ( '{' )
            {
            // InternalMatrixGame.g:2398:1: ( '{' )
            // InternalMatrixGame.g:2399:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4()); 

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
    // InternalMatrixGame.g:2408:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2412:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalMatrixGame.g:2413:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__State__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__6();

            state._fsp--;


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
    // InternalMatrixGame.g:2420:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2424:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalMatrixGame.g:2425:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalMatrixGame.g:2425:1: ( ( rule__State__Group_5__0 )? )
            // InternalMatrixGame.g:2426:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalMatrixGame.g:2427:2: ( rule__State__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMatrixGame.g:2427:3: rule__State__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_5()); 

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


    // $ANTLR start "rule__State__Group__6"
    // InternalMatrixGame.g:2435:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2439:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // InternalMatrixGame.g:2440:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__State__Group__6"


    // $ANTLR start "rule__State__Group__6__Impl"
    // InternalMatrixGame.g:2447:1: rule__State__Group__6__Impl : ( 'tile' ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2451:1: ( ( 'tile' ) )
            // InternalMatrixGame.g:2452:1: ( 'tile' )
            {
            // InternalMatrixGame.g:2452:1: ( 'tile' )
            // InternalMatrixGame.g:2453:2: 'tile'
            {
             before(grammarAccess.getStateAccess().getTileKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getTileKeyword_6()); 

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
    // $ANTLR end "rule__State__Group__6__Impl"


    // $ANTLR start "rule__State__Group__7"
    // InternalMatrixGame.g:2462:1: rule__State__Group__7 : rule__State__Group__7__Impl rule__State__Group__8 ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2466:1: ( rule__State__Group__7__Impl rule__State__Group__8 )
            // InternalMatrixGame.g:2467:2: rule__State__Group__7__Impl rule__State__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__State__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__State__Group__7"


    // $ANTLR start "rule__State__Group__7__Impl"
    // InternalMatrixGame.g:2474:1: rule__State__Group__7__Impl : ( ( rule__State__TileAssignment_7 ) ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2478:1: ( ( ( rule__State__TileAssignment_7 ) ) )
            // InternalMatrixGame.g:2479:1: ( ( rule__State__TileAssignment_7 ) )
            {
            // InternalMatrixGame.g:2479:1: ( ( rule__State__TileAssignment_7 ) )
            // InternalMatrixGame.g:2480:2: ( rule__State__TileAssignment_7 )
            {
             before(grammarAccess.getStateAccess().getTileAssignment_7()); 
            // InternalMatrixGame.g:2481:2: ( rule__State__TileAssignment_7 )
            // InternalMatrixGame.g:2481:3: rule__State__TileAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__State__TileAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTileAssignment_7()); 

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
    // $ANTLR end "rule__State__Group__7__Impl"


    // $ANTLR start "rule__State__Group__8"
    // InternalMatrixGame.g:2489:1: rule__State__Group__8 : rule__State__Group__8__Impl ;
    public final void rule__State__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2493:1: ( rule__State__Group__8__Impl )
            // InternalMatrixGame.g:2494:2: rule__State__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__8__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__State__Group__8"


    // $ANTLR start "rule__State__Group__8__Impl"
    // InternalMatrixGame.g:2500:1: rule__State__Group__8__Impl : ( '}' ) ;
    public final void rule__State__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2504:1: ( ( '}' ) )
            // InternalMatrixGame.g:2505:1: ( '}' )
            {
            // InternalMatrixGame.g:2505:1: ( '}' )
            // InternalMatrixGame.g:2506:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__State__Group__8__Impl"


    // $ANTLR start "rule__State__Group_5__0"
    // InternalMatrixGame.g:2516:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2520:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalMatrixGame.g:2521:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__State__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__State__Group_5__0"


    // $ANTLR start "rule__State__Group_5__0__Impl"
    // InternalMatrixGame.g:2528:1: rule__State__Group_5__0__Impl : ( 'turnsTaken' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2532:1: ( ( 'turnsTaken' ) )
            // InternalMatrixGame.g:2533:1: ( 'turnsTaken' )
            {
            // InternalMatrixGame.g:2533:1: ( 'turnsTaken' )
            // InternalMatrixGame.g:2534:2: 'turnsTaken'
            {
             before(grammarAccess.getStateAccess().getTurnsTakenKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getTurnsTakenKeyword_5_0()); 

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
    // $ANTLR end "rule__State__Group_5__0__Impl"


    // $ANTLR start "rule__State__Group_5__1"
    // InternalMatrixGame.g:2543:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2547:1: ( rule__State__Group_5__1__Impl )
            // InternalMatrixGame.g:2548:2: rule__State__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__State__Group_5__1"


    // $ANTLR start "rule__State__Group_5__1__Impl"
    // InternalMatrixGame.g:2554:1: rule__State__Group_5__1__Impl : ( ( rule__State__TurnsTakenAssignment_5_1 ) ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2558:1: ( ( ( rule__State__TurnsTakenAssignment_5_1 ) ) )
            // InternalMatrixGame.g:2559:1: ( ( rule__State__TurnsTakenAssignment_5_1 ) )
            {
            // InternalMatrixGame.g:2559:1: ( ( rule__State__TurnsTakenAssignment_5_1 ) )
            // InternalMatrixGame.g:2560:2: ( rule__State__TurnsTakenAssignment_5_1 )
            {
             before(grammarAccess.getStateAccess().getTurnsTakenAssignment_5_1()); 
            // InternalMatrixGame.g:2561:2: ( rule__State__TurnsTakenAssignment_5_1 )
            // InternalMatrixGame.g:2561:3: rule__State__TurnsTakenAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__State__TurnsTakenAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTurnsTakenAssignment_5_1()); 

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
    // $ANTLR end "rule__State__Group_5__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMatrixGame.g:2570:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2574:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMatrixGame.g:2575:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


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
    // InternalMatrixGame.g:2582:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2586:1: ( ( ( '-' )? ) )
            // InternalMatrixGame.g:2587:1: ( ( '-' )? )
            {
            // InternalMatrixGame.g:2587:1: ( ( '-' )? )
            // InternalMatrixGame.g:2588:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMatrixGame.g:2589:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMatrixGame.g:2589:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // InternalMatrixGame.g:2597:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2601:1: ( rule__EInt__Group__1__Impl )
            // InternalMatrixGame.g:2602:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


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
    // InternalMatrixGame.g:2608:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2612:1: ( ( RULE_INT ) )
            // InternalMatrixGame.g:2613:1: ( RULE_INT )
            {
            // InternalMatrixGame.g:2613:1: ( RULE_INT )
            // InternalMatrixGame.g:2614:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Tile__Group__0"
    // InternalMatrixGame.g:2624:1: rule__Tile__Group__0 : rule__Tile__Group__0__Impl rule__Tile__Group__1 ;
    public final void rule__Tile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2628:1: ( rule__Tile__Group__0__Impl rule__Tile__Group__1 )
            // InternalMatrixGame.g:2629:2: rule__Tile__Group__0__Impl rule__Tile__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Tile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__0"


    // $ANTLR start "rule__Tile__Group__0__Impl"
    // InternalMatrixGame.g:2636:1: rule__Tile__Group__0__Impl : ( ( rule__Tile__IsAccessibleAssignment_0 ) ) ;
    public final void rule__Tile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2640:1: ( ( ( rule__Tile__IsAccessibleAssignment_0 ) ) )
            // InternalMatrixGame.g:2641:1: ( ( rule__Tile__IsAccessibleAssignment_0 ) )
            {
            // InternalMatrixGame.g:2641:1: ( ( rule__Tile__IsAccessibleAssignment_0 ) )
            // InternalMatrixGame.g:2642:2: ( rule__Tile__IsAccessibleAssignment_0 )
            {
             before(grammarAccess.getTileAccess().getIsAccessibleAssignment_0()); 
            // InternalMatrixGame.g:2643:2: ( rule__Tile__IsAccessibleAssignment_0 )
            // InternalMatrixGame.g:2643:3: rule__Tile__IsAccessibleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Tile__IsAccessibleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getIsAccessibleAssignment_0()); 

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
    // $ANTLR end "rule__Tile__Group__0__Impl"


    // $ANTLR start "rule__Tile__Group__1"
    // InternalMatrixGame.g:2651:1: rule__Tile__Group__1 : rule__Tile__Group__1__Impl rule__Tile__Group__2 ;
    public final void rule__Tile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2655:1: ( rule__Tile__Group__1__Impl rule__Tile__Group__2 )
            // InternalMatrixGame.g:2656:2: rule__Tile__Group__1__Impl rule__Tile__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Tile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__1"


    // $ANTLR start "rule__Tile__Group__1__Impl"
    // InternalMatrixGame.g:2663:1: rule__Tile__Group__1__Impl : ( 'Tile' ) ;
    public final void rule__Tile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2667:1: ( ( 'Tile' ) )
            // InternalMatrixGame.g:2668:1: ( 'Tile' )
            {
            // InternalMatrixGame.g:2668:1: ( 'Tile' )
            // InternalMatrixGame.g:2669:2: 'Tile'
            {
             before(grammarAccess.getTileAccess().getTileKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getTileKeyword_1()); 

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
    // $ANTLR end "rule__Tile__Group__1__Impl"


    // $ANTLR start "rule__Tile__Group__2"
    // InternalMatrixGame.g:2678:1: rule__Tile__Group__2 : rule__Tile__Group__2__Impl rule__Tile__Group__3 ;
    public final void rule__Tile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2682:1: ( rule__Tile__Group__2__Impl rule__Tile__Group__3 )
            // InternalMatrixGame.g:2683:2: rule__Tile__Group__2__Impl rule__Tile__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Tile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__2"


    // $ANTLR start "rule__Tile__Group__2__Impl"
    // InternalMatrixGame.g:2690:1: rule__Tile__Group__2__Impl : ( '{' ) ;
    public final void rule__Tile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2694:1: ( ( '{' ) )
            // InternalMatrixGame.g:2695:1: ( '{' )
            {
            // InternalMatrixGame.g:2695:1: ( '{' )
            // InternalMatrixGame.g:2696:2: '{'
            {
             before(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Tile__Group__2__Impl"


    // $ANTLR start "rule__Tile__Group__3"
    // InternalMatrixGame.g:2705:1: rule__Tile__Group__3 : rule__Tile__Group__3__Impl rule__Tile__Group__4 ;
    public final void rule__Tile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2709:1: ( rule__Tile__Group__3__Impl rule__Tile__Group__4 )
            // InternalMatrixGame.g:2710:2: rule__Tile__Group__3__Impl rule__Tile__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Tile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__3"


    // $ANTLR start "rule__Tile__Group__3__Impl"
    // InternalMatrixGame.g:2717:1: rule__Tile__Group__3__Impl : ( 'tilePlace' ) ;
    public final void rule__Tile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2721:1: ( ( 'tilePlace' ) )
            // InternalMatrixGame.g:2722:1: ( 'tilePlace' )
            {
            // InternalMatrixGame.g:2722:1: ( 'tilePlace' )
            // InternalMatrixGame.g:2723:2: 'tilePlace'
            {
             before(grammarAccess.getTileAccess().getTilePlaceKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getTilePlaceKeyword_3()); 

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
    // $ANTLR end "rule__Tile__Group__3__Impl"


    // $ANTLR start "rule__Tile__Group__4"
    // InternalMatrixGame.g:2732:1: rule__Tile__Group__4 : rule__Tile__Group__4__Impl rule__Tile__Group__5 ;
    public final void rule__Tile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2736:1: ( rule__Tile__Group__4__Impl rule__Tile__Group__5 )
            // InternalMatrixGame.g:2737:2: rule__Tile__Group__4__Impl rule__Tile__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Tile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__4"


    // $ANTLR start "rule__Tile__Group__4__Impl"
    // InternalMatrixGame.g:2744:1: rule__Tile__Group__4__Impl : ( ( rule__Tile__TilePlaceAssignment_4 ) ) ;
    public final void rule__Tile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2748:1: ( ( ( rule__Tile__TilePlaceAssignment_4 ) ) )
            // InternalMatrixGame.g:2749:1: ( ( rule__Tile__TilePlaceAssignment_4 ) )
            {
            // InternalMatrixGame.g:2749:1: ( ( rule__Tile__TilePlaceAssignment_4 ) )
            // InternalMatrixGame.g:2750:2: ( rule__Tile__TilePlaceAssignment_4 )
            {
             before(grammarAccess.getTileAccess().getTilePlaceAssignment_4()); 
            // InternalMatrixGame.g:2751:2: ( rule__Tile__TilePlaceAssignment_4 )
            // InternalMatrixGame.g:2751:3: rule__Tile__TilePlaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Tile__TilePlaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getTilePlaceAssignment_4()); 

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
    // $ANTLR end "rule__Tile__Group__4__Impl"


    // $ANTLR start "rule__Tile__Group__5"
    // InternalMatrixGame.g:2759:1: rule__Tile__Group__5 : rule__Tile__Group__5__Impl rule__Tile__Group__6 ;
    public final void rule__Tile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2763:1: ( rule__Tile__Group__5__Impl rule__Tile__Group__6 )
            // InternalMatrixGame.g:2764:2: rule__Tile__Group__5__Impl rule__Tile__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Tile__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__5"


    // $ANTLR start "rule__Tile__Group__5__Impl"
    // InternalMatrixGame.g:2771:1: rule__Tile__Group__5__Impl : ( 'tileType' ) ;
    public final void rule__Tile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2775:1: ( ( 'tileType' ) )
            // InternalMatrixGame.g:2776:1: ( 'tileType' )
            {
            // InternalMatrixGame.g:2776:1: ( 'tileType' )
            // InternalMatrixGame.g:2777:2: 'tileType'
            {
             before(grammarAccess.getTileAccess().getTileTypeKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getTileTypeKeyword_5()); 

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
    // $ANTLR end "rule__Tile__Group__5__Impl"


    // $ANTLR start "rule__Tile__Group__6"
    // InternalMatrixGame.g:2786:1: rule__Tile__Group__6 : rule__Tile__Group__6__Impl rule__Tile__Group__7 ;
    public final void rule__Tile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2790:1: ( rule__Tile__Group__6__Impl rule__Tile__Group__7 )
            // InternalMatrixGame.g:2791:2: rule__Tile__Group__6__Impl rule__Tile__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Tile__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__6"


    // $ANTLR start "rule__Tile__Group__6__Impl"
    // InternalMatrixGame.g:2798:1: rule__Tile__Group__6__Impl : ( ( rule__Tile__TileTypeAssignment_6 ) ) ;
    public final void rule__Tile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2802:1: ( ( ( rule__Tile__TileTypeAssignment_6 ) ) )
            // InternalMatrixGame.g:2803:1: ( ( rule__Tile__TileTypeAssignment_6 ) )
            {
            // InternalMatrixGame.g:2803:1: ( ( rule__Tile__TileTypeAssignment_6 ) )
            // InternalMatrixGame.g:2804:2: ( rule__Tile__TileTypeAssignment_6 )
            {
             before(grammarAccess.getTileAccess().getTileTypeAssignment_6()); 
            // InternalMatrixGame.g:2805:2: ( rule__Tile__TileTypeAssignment_6 )
            // InternalMatrixGame.g:2805:3: rule__Tile__TileTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Tile__TileTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getTileTypeAssignment_6()); 

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
    // $ANTLR end "rule__Tile__Group__6__Impl"


    // $ANTLR start "rule__Tile__Group__7"
    // InternalMatrixGame.g:2813:1: rule__Tile__Group__7 : rule__Tile__Group__7__Impl rule__Tile__Group__8 ;
    public final void rule__Tile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2817:1: ( rule__Tile__Group__7__Impl rule__Tile__Group__8 )
            // InternalMatrixGame.g:2818:2: rule__Tile__Group__7__Impl rule__Tile__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Tile__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__7"


    // $ANTLR start "rule__Tile__Group__7__Impl"
    // InternalMatrixGame.g:2825:1: rule__Tile__Group__7__Impl : ( ( rule__Tile__Group_7__0 )? ) ;
    public final void rule__Tile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2829:1: ( ( ( rule__Tile__Group_7__0 )? ) )
            // InternalMatrixGame.g:2830:1: ( ( rule__Tile__Group_7__0 )? )
            {
            // InternalMatrixGame.g:2830:1: ( ( rule__Tile__Group_7__0 )? )
            // InternalMatrixGame.g:2831:2: ( rule__Tile__Group_7__0 )?
            {
             before(grammarAccess.getTileAccess().getGroup_7()); 
            // InternalMatrixGame.g:2832:2: ( rule__Tile__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMatrixGame.g:2832:3: rule__Tile__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tile__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTileAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Tile__Group__7__Impl"


    // $ANTLR start "rule__Tile__Group__8"
    // InternalMatrixGame.g:2840:1: rule__Tile__Group__8 : rule__Tile__Group__8__Impl rule__Tile__Group__9 ;
    public final void rule__Tile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2844:1: ( rule__Tile__Group__8__Impl rule__Tile__Group__9 )
            // InternalMatrixGame.g:2845:2: rule__Tile__Group__8__Impl rule__Tile__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Tile__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__8"


    // $ANTLR start "rule__Tile__Group__8__Impl"
    // InternalMatrixGame.g:2852:1: rule__Tile__Group__8__Impl : ( 'xCoordinate' ) ;
    public final void rule__Tile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2856:1: ( ( 'xCoordinate' ) )
            // InternalMatrixGame.g:2857:1: ( 'xCoordinate' )
            {
            // InternalMatrixGame.g:2857:1: ( 'xCoordinate' )
            // InternalMatrixGame.g:2858:2: 'xCoordinate'
            {
             before(grammarAccess.getTileAccess().getXCoordinateKeyword_8()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getXCoordinateKeyword_8()); 

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
    // $ANTLR end "rule__Tile__Group__8__Impl"


    // $ANTLR start "rule__Tile__Group__9"
    // InternalMatrixGame.g:2867:1: rule__Tile__Group__9 : rule__Tile__Group__9__Impl rule__Tile__Group__10 ;
    public final void rule__Tile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2871:1: ( rule__Tile__Group__9__Impl rule__Tile__Group__10 )
            // InternalMatrixGame.g:2872:2: rule__Tile__Group__9__Impl rule__Tile__Group__10
            {
            pushFollow(FOLLOW_31);
            rule__Tile__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__9"


    // $ANTLR start "rule__Tile__Group__9__Impl"
    // InternalMatrixGame.g:2879:1: rule__Tile__Group__9__Impl : ( ( rule__Tile__XCoordinateAssignment_9 ) ) ;
    public final void rule__Tile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2883:1: ( ( ( rule__Tile__XCoordinateAssignment_9 ) ) )
            // InternalMatrixGame.g:2884:1: ( ( rule__Tile__XCoordinateAssignment_9 ) )
            {
            // InternalMatrixGame.g:2884:1: ( ( rule__Tile__XCoordinateAssignment_9 ) )
            // InternalMatrixGame.g:2885:2: ( rule__Tile__XCoordinateAssignment_9 )
            {
             before(grammarAccess.getTileAccess().getXCoordinateAssignment_9()); 
            // InternalMatrixGame.g:2886:2: ( rule__Tile__XCoordinateAssignment_9 )
            // InternalMatrixGame.g:2886:3: rule__Tile__XCoordinateAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Tile__XCoordinateAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getXCoordinateAssignment_9()); 

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
    // $ANTLR end "rule__Tile__Group__9__Impl"


    // $ANTLR start "rule__Tile__Group__10"
    // InternalMatrixGame.g:2894:1: rule__Tile__Group__10 : rule__Tile__Group__10__Impl rule__Tile__Group__11 ;
    public final void rule__Tile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2898:1: ( rule__Tile__Group__10__Impl rule__Tile__Group__11 )
            // InternalMatrixGame.g:2899:2: rule__Tile__Group__10__Impl rule__Tile__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Tile__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__11();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__10"


    // $ANTLR start "rule__Tile__Group__10__Impl"
    // InternalMatrixGame.g:2906:1: rule__Tile__Group__10__Impl : ( 'yCoordinate' ) ;
    public final void rule__Tile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2910:1: ( ( 'yCoordinate' ) )
            // InternalMatrixGame.g:2911:1: ( 'yCoordinate' )
            {
            // InternalMatrixGame.g:2911:1: ( 'yCoordinate' )
            // InternalMatrixGame.g:2912:2: 'yCoordinate'
            {
             before(grammarAccess.getTileAccess().getYCoordinateKeyword_10()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getYCoordinateKeyword_10()); 

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
    // $ANTLR end "rule__Tile__Group__10__Impl"


    // $ANTLR start "rule__Tile__Group__11"
    // InternalMatrixGame.g:2921:1: rule__Tile__Group__11 : rule__Tile__Group__11__Impl rule__Tile__Group__12 ;
    public final void rule__Tile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2925:1: ( rule__Tile__Group__11__Impl rule__Tile__Group__12 )
            // InternalMatrixGame.g:2926:2: rule__Tile__Group__11__Impl rule__Tile__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__Tile__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group__12();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__11"


    // $ANTLR start "rule__Tile__Group__11__Impl"
    // InternalMatrixGame.g:2933:1: rule__Tile__Group__11__Impl : ( ( rule__Tile__YCoordinateAssignment_11 ) ) ;
    public final void rule__Tile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2937:1: ( ( ( rule__Tile__YCoordinateAssignment_11 ) ) )
            // InternalMatrixGame.g:2938:1: ( ( rule__Tile__YCoordinateAssignment_11 ) )
            {
            // InternalMatrixGame.g:2938:1: ( ( rule__Tile__YCoordinateAssignment_11 ) )
            // InternalMatrixGame.g:2939:2: ( rule__Tile__YCoordinateAssignment_11 )
            {
             before(grammarAccess.getTileAccess().getYCoordinateAssignment_11()); 
            // InternalMatrixGame.g:2940:2: ( rule__Tile__YCoordinateAssignment_11 )
            // InternalMatrixGame.g:2940:3: rule__Tile__YCoordinateAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Tile__YCoordinateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getYCoordinateAssignment_11()); 

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
    // $ANTLR end "rule__Tile__Group__11__Impl"


    // $ANTLR start "rule__Tile__Group__12"
    // InternalMatrixGame.g:2948:1: rule__Tile__Group__12 : rule__Tile__Group__12__Impl ;
    public final void rule__Tile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2952:1: ( rule__Tile__Group__12__Impl )
            // InternalMatrixGame.g:2953:2: rule__Tile__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group__12__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group__12"


    // $ANTLR start "rule__Tile__Group__12__Impl"
    // InternalMatrixGame.g:2959:1: rule__Tile__Group__12__Impl : ( '}' ) ;
    public final void rule__Tile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2963:1: ( ( '}' ) )
            // InternalMatrixGame.g:2964:1: ( '}' )
            {
            // InternalMatrixGame.g:2964:1: ( '}' )
            // InternalMatrixGame.g:2965:2: '}'
            {
             before(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Tile__Group__12__Impl"


    // $ANTLR start "rule__Tile__Group_7__0"
    // InternalMatrixGame.g:2975:1: rule__Tile__Group_7__0 : rule__Tile__Group_7__0__Impl rule__Tile__Group_7__1 ;
    public final void rule__Tile__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2979:1: ( rule__Tile__Group_7__0__Impl rule__Tile__Group_7__1 )
            // InternalMatrixGame.g:2980:2: rule__Tile__Group_7__0__Impl rule__Tile__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Tile__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tile__Group_7__1();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group_7__0"


    // $ANTLR start "rule__Tile__Group_7__0__Impl"
    // InternalMatrixGame.g:2987:1: rule__Tile__Group_7__0__Impl : ( 'Color' ) ;
    public final void rule__Tile__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:2991:1: ( ( 'Color' ) )
            // InternalMatrixGame.g:2992:1: ( 'Color' )
            {
            // InternalMatrixGame.g:2992:1: ( 'Color' )
            // InternalMatrixGame.g:2993:2: 'Color'
            {
             before(grammarAccess.getTileAccess().getColorKeyword_7_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getColorKeyword_7_0()); 

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
    // $ANTLR end "rule__Tile__Group_7__0__Impl"


    // $ANTLR start "rule__Tile__Group_7__1"
    // InternalMatrixGame.g:3002:1: rule__Tile__Group_7__1 : rule__Tile__Group_7__1__Impl ;
    public final void rule__Tile__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3006:1: ( rule__Tile__Group_7__1__Impl )
            // InternalMatrixGame.g:3007:2: rule__Tile__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Group_7__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Tile__Group_7__1"


    // $ANTLR start "rule__Tile__Group_7__1__Impl"
    // InternalMatrixGame.g:3013:1: rule__Tile__Group_7__1__Impl : ( ( rule__Tile__ColorAssignment_7_1 ) ) ;
    public final void rule__Tile__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3017:1: ( ( ( rule__Tile__ColorAssignment_7_1 ) ) )
            // InternalMatrixGame.g:3018:1: ( ( rule__Tile__ColorAssignment_7_1 ) )
            {
            // InternalMatrixGame.g:3018:1: ( ( rule__Tile__ColorAssignment_7_1 ) )
            // InternalMatrixGame.g:3019:2: ( rule__Tile__ColorAssignment_7_1 )
            {
             before(grammarAccess.getTileAccess().getColorAssignment_7_1()); 
            // InternalMatrixGame.g:3020:2: ( rule__Tile__ColorAssignment_7_1 )
            // InternalMatrixGame.g:3020:3: rule__Tile__ColorAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Tile__ColorAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getColorAssignment_7_1()); 

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
    // $ANTLR end "rule__Tile__Group_7__1__Impl"


    // $ANTLR start "rule__GameLogic__GameNameAssignment_2_1"
    // InternalMatrixGame.g:3029:1: rule__GameLogic__GameNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__GameLogic__GameNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3033:1: ( ( ruleEString ) )
            // InternalMatrixGame.g:3034:2: ( ruleEString )
            {
            // InternalMatrixGame.g:3034:2: ( ruleEString )
            // InternalMatrixGame.g:3035:3: ruleEString
            {
             before(grammarAccess.getGameLogicAccess().getGameNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameLogicAccess().getGameNameEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__GameLogic__GameNameAssignment_2_1"


    // $ANTLR start "rule__GameLogic__PlayerAssignment_4"
    // InternalMatrixGame.g:3044:1: rule__GameLogic__PlayerAssignment_4 : ( rulePlayer ) ;
    public final void rule__GameLogic__PlayerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3048:1: ( ( rulePlayer ) )
            // InternalMatrixGame.g:3049:2: ( rulePlayer )
            {
            // InternalMatrixGame.g:3049:2: ( rulePlayer )
            // InternalMatrixGame.g:3050:3: rulePlayer
            {
             before(grammarAccess.getGameLogicAccess().getPlayerPlayerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getGameLogicAccess().getPlayerPlayerParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__GameLogic__PlayerAssignment_4"


    // $ANTLR start "rule__GameLogic__MapAssignment_6"
    // InternalMatrixGame.g:3059:1: rule__GameLogic__MapAssignment_6 : ( ruleMap ) ;
    public final void rule__GameLogic__MapAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3063:1: ( ( ruleMap ) )
            // InternalMatrixGame.g:3064:2: ( ruleMap )
            {
            // InternalMatrixGame.g:3064:2: ( ruleMap )
            // InternalMatrixGame.g:3065:3: ruleMap
            {
             before(grammarAccess.getGameLogicAccess().getMapMapParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getGameLogicAccess().getMapMapParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__GameLogic__MapAssignment_6"


    // $ANTLR start "rule__GameLogic__Actions_playedAssignment_7_2"
    // InternalMatrixGame.g:3074:1: rule__GameLogic__Actions_playedAssignment_7_2 : ( ruleAction ) ;
    public final void rule__GameLogic__Actions_playedAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3078:1: ( ( ruleAction ) )
            // InternalMatrixGame.g:3079:2: ( ruleAction )
            {
            // InternalMatrixGame.g:3079:2: ( ruleAction )
            // InternalMatrixGame.g:3080:3: ruleAction
            {
             before(grammarAccess.getGameLogicAccess().getActions_playedActionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getGameLogicAccess().getActions_playedActionParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__GameLogic__Actions_playedAssignment_7_2"


    // $ANTLR start "rule__GameLogic__Actions_playedAssignment_7_3_1"
    // InternalMatrixGame.g:3089:1: rule__GameLogic__Actions_playedAssignment_7_3_1 : ( ruleAction ) ;
    public final void rule__GameLogic__Actions_playedAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3093:1: ( ( ruleAction ) )
            // InternalMatrixGame.g:3094:2: ( ruleAction )
            {
            // InternalMatrixGame.g:3094:2: ( ruleAction )
            // InternalMatrixGame.g:3095:3: ruleAction
            {
             before(grammarAccess.getGameLogicAccess().getActions_playedActionParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getGameLogicAccess().getActions_playedActionParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__GameLogic__Actions_playedAssignment_7_3_1"


    // $ANTLR start "rule__GameLogic__Has_stateAssignment_8_2"
    // InternalMatrixGame.g:3104:1: rule__GameLogic__Has_stateAssignment_8_2 : ( ruleState ) ;
    public final void rule__GameLogic__Has_stateAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3108:1: ( ( ruleState ) )
            // InternalMatrixGame.g:3109:2: ( ruleState )
            {
            // InternalMatrixGame.g:3109:2: ( ruleState )
            // InternalMatrixGame.g:3110:3: ruleState
            {
             before(grammarAccess.getGameLogicAccess().getHas_stateStateParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getGameLogicAccess().getHas_stateStateParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__GameLogic__Has_stateAssignment_8_2"


    // $ANTLR start "rule__GameLogic__Has_stateAssignment_8_3_1"
    // InternalMatrixGame.g:3119:1: rule__GameLogic__Has_stateAssignment_8_3_1 : ( ruleState ) ;
    public final void rule__GameLogic__Has_stateAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3123:1: ( ( ruleState ) )
            // InternalMatrixGame.g:3124:2: ( ruleState )
            {
            // InternalMatrixGame.g:3124:2: ( ruleState )
            // InternalMatrixGame.g:3125:3: ruleState
            {
             before(grammarAccess.getGameLogicAccess().getHas_stateStateParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getGameLogicAccess().getHas_stateStateParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__GameLogic__Has_stateAssignment_8_3_1"


    // $ANTLR start "rule__Player__NameAssignment_2"
    // InternalMatrixGame.g:3134:1: rule__Player__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Player__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3138:1: ( ( ruleEString ) )
            // InternalMatrixGame.g:3139:2: ( ruleEString )
            {
            // InternalMatrixGame.g:3139:2: ( ruleEString )
            // InternalMatrixGame.g:3140:3: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Player__NameAssignment_2"


    // $ANTLR start "rule__Player__ScoreAssignment_4_1"
    // InternalMatrixGame.g:3149:1: rule__Player__ScoreAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Player__ScoreAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3153:1: ( ( ruleEInt ) )
            // InternalMatrixGame.g:3154:2: ( ruleEInt )
            {
            // InternalMatrixGame.g:3154:2: ( ruleEInt )
            // InternalMatrixGame.g:3155:3: ruleEInt
            {
             before(grammarAccess.getPlayerAccess().getScoreEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getScoreEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Player__ScoreAssignment_4_1"


    // $ANTLR start "rule__Player__Takes_actionAssignment_5_2"
    // InternalMatrixGame.g:3164:1: rule__Player__Takes_actionAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Player__Takes_actionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3168:1: ( ( ( ruleEString ) ) )
            // InternalMatrixGame.g:3169:2: ( ( ruleEString ) )
            {
            // InternalMatrixGame.g:3169:2: ( ( ruleEString ) )
            // InternalMatrixGame.g:3170:3: ( ruleEString )
            {
             before(grammarAccess.getPlayerAccess().getTakes_actionActionCrossReference_5_2_0()); 
            // InternalMatrixGame.g:3171:3: ( ruleEString )
            // InternalMatrixGame.g:3172:4: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getTakes_actionActionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getTakes_actionActionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getPlayerAccess().getTakes_actionActionCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Player__Takes_actionAssignment_5_2"


    // $ANTLR start "rule__Player__Takes_actionAssignment_5_3_1"
    // InternalMatrixGame.g:3183:1: rule__Player__Takes_actionAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Player__Takes_actionAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3187:1: ( ( ( ruleEString ) ) )
            // InternalMatrixGame.g:3188:2: ( ( ruleEString ) )
            {
            // InternalMatrixGame.g:3188:2: ( ( ruleEString ) )
            // InternalMatrixGame.g:3189:3: ( ruleEString )
            {
             before(grammarAccess.getPlayerAccess().getTakes_actionActionCrossReference_5_3_1_0()); 
            // InternalMatrixGame.g:3190:3: ( ruleEString )
            // InternalMatrixGame.g:3191:4: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getTakes_actionActionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getTakes_actionActionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getPlayerAccess().getTakes_actionActionCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Player__Takes_actionAssignment_5_3_1"


    // $ANTLR start "rule__Map__AmountOfTilesAssignment_2_1"
    // InternalMatrixGame.g:3202:1: rule__Map__AmountOfTilesAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Map__AmountOfTilesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3206:1: ( ( ruleEInt ) )
            // InternalMatrixGame.g:3207:2: ( ruleEInt )
            {
            // InternalMatrixGame.g:3207:2: ( ruleEInt )
            // InternalMatrixGame.g:3208:3: ruleEInt
            {
             before(grammarAccess.getMapAccess().getAmountOfTilesEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMapAccess().getAmountOfTilesEIntParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Map__AmountOfTilesAssignment_2_1"


    // $ANTLR start "rule__Map__MapSizeXAssignment_4"
    // InternalMatrixGame.g:3217:1: rule__Map__MapSizeXAssignment_4 : ( ruleEInt ) ;
    public final void rule__Map__MapSizeXAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3221:1: ( ( ruleEInt ) )
            // InternalMatrixGame.g:3222:2: ( ruleEInt )
            {
            // InternalMatrixGame.g:3222:2: ( ruleEInt )
            // InternalMatrixGame.g:3223:3: ruleEInt
            {
             before(grammarAccess.getMapAccess().getMapSizeXEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMapAccess().getMapSizeXEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Map__MapSizeXAssignment_4"


    // $ANTLR start "rule__Map__MapSizeYAssignment_6"
    // InternalMatrixGame.g:3232:1: rule__Map__MapSizeYAssignment_6 : ( ruleEInt ) ;
    public final void rule__Map__MapSizeYAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3236:1: ( ( ruleEInt ) )
            // InternalMatrixGame.g:3237:2: ( ruleEInt )
            {
            // InternalMatrixGame.g:3237:2: ( ruleEInt )
            // InternalMatrixGame.g:3238:3: ruleEInt
            {
             before(grammarAccess.getMapAccess().getMapSizeYEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMapAccess().getMapSizeYEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Map__MapSizeYAssignment_6"


    // $ANTLR start "rule__Map__MapNameAssignment_7_1"
    // InternalMatrixGame.g:3247:1: rule__Map__MapNameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Map__MapNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3251:1: ( ( ruleEString ) )
            // InternalMatrixGame.g:3252:2: ( ruleEString )
            {
            // InternalMatrixGame.g:3252:2: ( ruleEString )
            // InternalMatrixGame.g:3253:3: ruleEString
            {
             before(grammarAccess.getMapAccess().getMapNameEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapAccess().getMapNameEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Map__MapNameAssignment_7_1"


    // $ANTLR start "rule__Map__TileAssignment_10"
    // InternalMatrixGame.g:3262:1: rule__Map__TileAssignment_10 : ( ruleTile ) ;
    public final void rule__Map__TileAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3266:1: ( ( ruleTile ) )
            // InternalMatrixGame.g:3267:2: ( ruleTile )
            {
            // InternalMatrixGame.g:3267:2: ( ruleTile )
            // InternalMatrixGame.g:3268:3: ruleTile
            {
             before(grammarAccess.getMapAccess().getTileTileParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleTile();

            state._fsp--;

             after(grammarAccess.getMapAccess().getTileTileParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Map__TileAssignment_10"


    // $ANTLR start "rule__Map__TileAssignment_11_1"
    // InternalMatrixGame.g:3277:1: rule__Map__TileAssignment_11_1 : ( ruleTile ) ;
    public final void rule__Map__TileAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3281:1: ( ( ruleTile ) )
            // InternalMatrixGame.g:3282:2: ( ruleTile )
            {
            // InternalMatrixGame.g:3282:2: ( ruleTile )
            // InternalMatrixGame.g:3283:3: ruleTile
            {
             before(grammarAccess.getMapAccess().getTileTileParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTile();

            state._fsp--;

             after(grammarAccess.getMapAccess().getTileTileParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Map__TileAssignment_11_1"


    // $ANTLR start "rule__Action__NameAssignment_2"
    // InternalMatrixGame.g:3292:1: rule__Action__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3296:1: ( ( ruleEString ) )
            // InternalMatrixGame.g:3297:2: ( ruleEString )
            {
            // InternalMatrixGame.g:3297:2: ( ruleEString )
            // InternalMatrixGame.g:3298:3: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Action__NameAssignment_2"


    // $ANTLR start "rule__Action__ActionTypeAssignment_4_1"
    // InternalMatrixGame.g:3307:1: rule__Action__ActionTypeAssignment_4_1 : ( ruleActionType ) ;
    public final void rule__Action__ActionTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3311:1: ( ( ruleActionType ) )
            // InternalMatrixGame.g:3312:2: ( ruleActionType )
            {
            // InternalMatrixGame.g:3312:2: ( ruleActionType )
            // InternalMatrixGame.g:3313:3: ruleActionType
            {
             before(grammarAccess.getActionAccess().getActionTypeActionTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionTypeActionTypeEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Action__ActionTypeAssignment_4_1"


    // $ANTLR start "rule__State__FlagsPlacedAssignment_0"
    // InternalMatrixGame.g:3322:1: rule__State__FlagsPlacedAssignment_0 : ( ( 'flagsPlaced' ) ) ;
    public final void rule__State__FlagsPlacedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3326:1: ( ( ( 'flagsPlaced' ) ) )
            // InternalMatrixGame.g:3327:2: ( ( 'flagsPlaced' ) )
            {
            // InternalMatrixGame.g:3327:2: ( ( 'flagsPlaced' ) )
            // InternalMatrixGame.g:3328:3: ( 'flagsPlaced' )
            {
             before(grammarAccess.getStateAccess().getFlagsPlacedFlagsPlacedKeyword_0_0()); 
            // InternalMatrixGame.g:3329:3: ( 'flagsPlaced' )
            // InternalMatrixGame.g:3330:4: 'flagsPlaced'
            {
             before(grammarAccess.getStateAccess().getFlagsPlacedFlagsPlacedKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getFlagsPlacedFlagsPlacedKeyword_0_0()); 

            }

             after(grammarAccess.getStateAccess().getFlagsPlacedFlagsPlacedKeyword_0_0()); 

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
    // $ANTLR end "rule__State__FlagsPlacedAssignment_0"


    // $ANTLR start "rule__State__IsOverAssignment_1"
    // InternalMatrixGame.g:3341:1: rule__State__IsOverAssignment_1 : ( ( 'isOver' ) ) ;
    public final void rule__State__IsOverAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3345:1: ( ( ( 'isOver' ) ) )
            // InternalMatrixGame.g:3346:2: ( ( 'isOver' ) )
            {
            // InternalMatrixGame.g:3346:2: ( ( 'isOver' ) )
            // InternalMatrixGame.g:3347:3: ( 'isOver' )
            {
             before(grammarAccess.getStateAccess().getIsOverIsOverKeyword_1_0()); 
            // InternalMatrixGame.g:3348:3: ( 'isOver' )
            // InternalMatrixGame.g:3349:4: 'isOver'
            {
             before(grammarAccess.getStateAccess().getIsOverIsOverKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getIsOverIsOverKeyword_1_0()); 

            }

             after(grammarAccess.getStateAccess().getIsOverIsOverKeyword_1_0()); 

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
    // $ANTLR end "rule__State__IsOverAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_3"
    // InternalMatrixGame.g:3360:1: rule__State__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3364:1: ( ( ruleEString ) )
            // InternalMatrixGame.g:3365:2: ( ruleEString )
            {
            // InternalMatrixGame.g:3365:2: ( ruleEString )
            // InternalMatrixGame.g:3366:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_3"


    // $ANTLR start "rule__State__TurnsTakenAssignment_5_1"
    // InternalMatrixGame.g:3375:1: rule__State__TurnsTakenAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__State__TurnsTakenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3379:1: ( ( ruleEInt ) )
            // InternalMatrixGame.g:3380:2: ( ruleEInt )
            {
            // InternalMatrixGame.g:3380:2: ( ruleEInt )
            // InternalMatrixGame.g:3381:3: ruleEInt
            {
             before(grammarAccess.getStateAccess().getTurnsTakenEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTurnsTakenEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__State__TurnsTakenAssignment_5_1"


    // $ANTLR start "rule__State__TileAssignment_7"
    // InternalMatrixGame.g:3390:1: rule__State__TileAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__State__TileAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3394:1: ( ( ( ruleEString ) ) )
            // InternalMatrixGame.g:3395:2: ( ( ruleEString ) )
            {
            // InternalMatrixGame.g:3395:2: ( ( ruleEString ) )
            // InternalMatrixGame.g:3396:3: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getTileTileCrossReference_7_0()); 
            // InternalMatrixGame.g:3397:3: ( ruleEString )
            // InternalMatrixGame.g:3398:4: ruleEString
            {
             before(grammarAccess.getStateAccess().getTileTileEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTileTileEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getStateAccess().getTileTileCrossReference_7_0()); 

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
    // $ANTLR end "rule__State__TileAssignment_7"


    // $ANTLR start "rule__Tile__IsAccessibleAssignment_0"
    // InternalMatrixGame.g:3409:1: rule__Tile__IsAccessibleAssignment_0 : ( ( 'isAccessible' ) ) ;
    public final void rule__Tile__IsAccessibleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3413:1: ( ( ( 'isAccessible' ) ) )
            // InternalMatrixGame.g:3414:2: ( ( 'isAccessible' ) )
            {
            // InternalMatrixGame.g:3414:2: ( ( 'isAccessible' ) )
            // InternalMatrixGame.g:3415:3: ( 'isAccessible' )
            {
             before(grammarAccess.getTileAccess().getIsAccessibleIsAccessibleKeyword_0_0()); 
            // InternalMatrixGame.g:3416:3: ( 'isAccessible' )
            // InternalMatrixGame.g:3417:4: 'isAccessible'
            {
             before(grammarAccess.getTileAccess().getIsAccessibleIsAccessibleKeyword_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTileAccess().getIsAccessibleIsAccessibleKeyword_0_0()); 

            }

             after(grammarAccess.getTileAccess().getIsAccessibleIsAccessibleKeyword_0_0()); 

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
    // $ANTLR end "rule__Tile__IsAccessibleAssignment_0"


    // $ANTLR start "rule__Tile__TilePlaceAssignment_4"
    // InternalMatrixGame.g:3428:1: rule__Tile__TilePlaceAssignment_4 : ( ruleEString ) ;
    public final void rule__Tile__TilePlaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3432:1: ( ( ruleEString ) )
            // InternalMatrixGame.g:3433:2: ( ruleEString )
            {
            // InternalMatrixGame.g:3433:2: ( ruleEString )
            // InternalMatrixGame.g:3434:3: ruleEString
            {
             before(grammarAccess.getTileAccess().getTilePlaceEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTileAccess().getTilePlaceEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Tile__TilePlaceAssignment_4"


    // $ANTLR start "rule__Tile__TileTypeAssignment_6"
    // InternalMatrixGame.g:3443:1: rule__Tile__TileTypeAssignment_6 : ( ruleTileType ) ;
    public final void rule__Tile__TileTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3447:1: ( ( ruleTileType ) )
            // InternalMatrixGame.g:3448:2: ( ruleTileType )
            {
            // InternalMatrixGame.g:3448:2: ( ruleTileType )
            // InternalMatrixGame.g:3449:3: ruleTileType
            {
             before(grammarAccess.getTileAccess().getTileTypeTileTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTileType();

            state._fsp--;

             after(grammarAccess.getTileAccess().getTileTypeTileTypeEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__Tile__TileTypeAssignment_6"


    // $ANTLR start "rule__Tile__ColorAssignment_7_1"
    // InternalMatrixGame.g:3458:1: rule__Tile__ColorAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Tile__ColorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3462:1: ( ( ruleEString ) )
            // InternalMatrixGame.g:3463:2: ( ruleEString )
            {
            // InternalMatrixGame.g:3463:2: ( ruleEString )
            // InternalMatrixGame.g:3464:3: ruleEString
            {
             before(grammarAccess.getTileAccess().getColorEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTileAccess().getColorEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Tile__ColorAssignment_7_1"


    // $ANTLR start "rule__Tile__XCoordinateAssignment_9"
    // InternalMatrixGame.g:3473:1: rule__Tile__XCoordinateAssignment_9 : ( ruleEInt ) ;
    public final void rule__Tile__XCoordinateAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3477:1: ( ( ruleEInt ) )
            // InternalMatrixGame.g:3478:2: ( ruleEInt )
            {
            // InternalMatrixGame.g:3478:2: ( ruleEInt )
            // InternalMatrixGame.g:3479:3: ruleEInt
            {
             before(grammarAccess.getTileAccess().getXCoordinateEIntParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTileAccess().getXCoordinateEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Tile__XCoordinateAssignment_9"


    // $ANTLR start "rule__Tile__YCoordinateAssignment_11"
    // InternalMatrixGame.g:3488:1: rule__Tile__YCoordinateAssignment_11 : ( ruleEInt ) ;
    public final void rule__Tile__YCoordinateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatrixGame.g:3492:1: ( ( ruleEInt ) )
            // InternalMatrixGame.g:3493:2: ( ruleEInt )
            {
            // InternalMatrixGame.g:3493:2: ( ruleEInt )
            // InternalMatrixGame.g:3494:3: ruleEInt
            {
             before(grammarAccess.getTileAccess().getYCoordinateEIntParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTileAccess().getYCoordinateEIntParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Tile__YCoordinateAssignment_11"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000002A000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0030080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000182000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});

}