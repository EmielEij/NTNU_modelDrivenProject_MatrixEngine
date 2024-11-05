package tdt4250.matrixgame.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tdt4250.matrixgame.services.MatrixGameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMatrixGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GameLogic'", "'{'", "'gameName'", "'player'", "'map'", "'actions_played'", "','", "'}'", "'has_state'", "'Player'", "'score'", "'takes_action'", "'('", "')'", "'Map'", "'amountOfTiles'", "'mapSizeX'", "'mapSizeY'", "'mapName'", "'tile'", "'Action'", "'actionType'", "'flagsPlaced'", "'isOver'", "'State'", "'turnsTaken'", "'-'", "'isAccessible'", "'Tile'", "'tilePlace'", "'tileType'", "'Color'", "'xCoordinate'", "'yCoordinate'", "'BASIC'", "'REWARD'", "'OBSTACLE'", "'INTERACTIVE'", "'CRASH'", "'NONE'", "'REVEAL'", "'MOVE'", "'TOGGLE'", "'ATTACK'"
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

        public InternalMatrixGameParser(TokenStream input, MatrixGameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GameLogic";
       	}

       	@Override
       	protected MatrixGameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGameLogic"
    // InternalMatrixGame.g:65:1: entryRuleGameLogic returns [EObject current=null] : iv_ruleGameLogic= ruleGameLogic EOF ;
    public final EObject entryRuleGameLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameLogic = null;


        try {
            // InternalMatrixGame.g:65:50: (iv_ruleGameLogic= ruleGameLogic EOF )
            // InternalMatrixGame.g:66:2: iv_ruleGameLogic= ruleGameLogic EOF
            {
             newCompositeNode(grammarAccess.getGameLogicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameLogic=ruleGameLogic();

            state._fsp--;

             current =iv_ruleGameLogic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGameLogic"


    // $ANTLR start "ruleGameLogic"
    // InternalMatrixGame.g:72:1: ruleGameLogic returns [EObject current=null] : (otherlv_0= 'GameLogic' otherlv_1= '{' (otherlv_2= 'gameName' ( (lv_gameName_3_0= ruleEString ) ) )? otherlv_4= 'player' ( (lv_player_5_0= rulePlayer ) ) otherlv_6= 'map' ( (lv_map_7_0= ruleMap ) ) (otherlv_8= 'actions_played' otherlv_9= '{' ( (lv_actions_played_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_played_12_0= ruleAction ) ) )* otherlv_13= '}' )? (otherlv_14= 'has_state' otherlv_15= '{' ( (lv_has_state_16_0= ruleState ) ) (otherlv_17= ',' ( (lv_has_state_18_0= ruleState ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleGameLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_gameName_3_0 = null;

        EObject lv_player_5_0 = null;

        EObject lv_map_7_0 = null;

        EObject lv_actions_played_10_0 = null;

        EObject lv_actions_played_12_0 = null;

        EObject lv_has_state_16_0 = null;

        EObject lv_has_state_18_0 = null;



        	enterRule();

        try {
            // InternalMatrixGame.g:78:2: ( (otherlv_0= 'GameLogic' otherlv_1= '{' (otherlv_2= 'gameName' ( (lv_gameName_3_0= ruleEString ) ) )? otherlv_4= 'player' ( (lv_player_5_0= rulePlayer ) ) otherlv_6= 'map' ( (lv_map_7_0= ruleMap ) ) (otherlv_8= 'actions_played' otherlv_9= '{' ( (lv_actions_played_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_played_12_0= ruleAction ) ) )* otherlv_13= '}' )? (otherlv_14= 'has_state' otherlv_15= '{' ( (lv_has_state_16_0= ruleState ) ) (otherlv_17= ',' ( (lv_has_state_18_0= ruleState ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalMatrixGame.g:79:2: (otherlv_0= 'GameLogic' otherlv_1= '{' (otherlv_2= 'gameName' ( (lv_gameName_3_0= ruleEString ) ) )? otherlv_4= 'player' ( (lv_player_5_0= rulePlayer ) ) otherlv_6= 'map' ( (lv_map_7_0= ruleMap ) ) (otherlv_8= 'actions_played' otherlv_9= '{' ( (lv_actions_played_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_played_12_0= ruleAction ) ) )* otherlv_13= '}' )? (otherlv_14= 'has_state' otherlv_15= '{' ( (lv_has_state_16_0= ruleState ) ) (otherlv_17= ',' ( (lv_has_state_18_0= ruleState ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalMatrixGame.g:79:2: (otherlv_0= 'GameLogic' otherlv_1= '{' (otherlv_2= 'gameName' ( (lv_gameName_3_0= ruleEString ) ) )? otherlv_4= 'player' ( (lv_player_5_0= rulePlayer ) ) otherlv_6= 'map' ( (lv_map_7_0= ruleMap ) ) (otherlv_8= 'actions_played' otherlv_9= '{' ( (lv_actions_played_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_played_12_0= ruleAction ) ) )* otherlv_13= '}' )? (otherlv_14= 'has_state' otherlv_15= '{' ( (lv_has_state_16_0= ruleState ) ) (otherlv_17= ',' ( (lv_has_state_18_0= ruleState ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalMatrixGame.g:80:3: otherlv_0= 'GameLogic' otherlv_1= '{' (otherlv_2= 'gameName' ( (lv_gameName_3_0= ruleEString ) ) )? otherlv_4= 'player' ( (lv_player_5_0= rulePlayer ) ) otherlv_6= 'map' ( (lv_map_7_0= ruleMap ) ) (otherlv_8= 'actions_played' otherlv_9= '{' ( (lv_actions_played_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_played_12_0= ruleAction ) ) )* otherlv_13= '}' )? (otherlv_14= 'has_state' otherlv_15= '{' ( (lv_has_state_16_0= ruleState ) ) (otherlv_17= ',' ( (lv_has_state_18_0= ruleState ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameLogicAccess().getGameLogicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMatrixGame.g:88:3: (otherlv_2= 'gameName' ( (lv_gameName_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMatrixGame.g:89:4: otherlv_2= 'gameName' ( (lv_gameName_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getGameLogicAccess().getGameNameKeyword_2_0());
                    			
                    // InternalMatrixGame.g:93:4: ( (lv_gameName_3_0= ruleEString ) )
                    // InternalMatrixGame.g:94:5: (lv_gameName_3_0= ruleEString )
                    {
                    // InternalMatrixGame.g:94:5: (lv_gameName_3_0= ruleEString )
                    // InternalMatrixGame.g:95:6: lv_gameName_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGameLogicAccess().getGameNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_gameName_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameLogicRule());
                    						}
                    						set(
                    							current,
                    							"gameName",
                    							lv_gameName_3_0,
                    							"tdt4250.matrixgame.MatrixGame.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getGameLogicAccess().getPlayerKeyword_3());
            		
            // InternalMatrixGame.g:117:3: ( (lv_player_5_0= rulePlayer ) )
            // InternalMatrixGame.g:118:4: (lv_player_5_0= rulePlayer )
            {
            // InternalMatrixGame.g:118:4: (lv_player_5_0= rulePlayer )
            // InternalMatrixGame.g:119:5: lv_player_5_0= rulePlayer
            {

            					newCompositeNode(grammarAccess.getGameLogicAccess().getPlayerPlayerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_player_5_0=rulePlayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameLogicRule());
            					}
            					set(
            						current,
            						"player",
            						lv_player_5_0,
            						"tdt4250.matrixgame.MatrixGame.Player");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getGameLogicAccess().getMapKeyword_5());
            		
            // InternalMatrixGame.g:140:3: ( (lv_map_7_0= ruleMap ) )
            // InternalMatrixGame.g:141:4: (lv_map_7_0= ruleMap )
            {
            // InternalMatrixGame.g:141:4: (lv_map_7_0= ruleMap )
            // InternalMatrixGame.g:142:5: lv_map_7_0= ruleMap
            {

            					newCompositeNode(grammarAccess.getGameLogicAccess().getMapMapParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_map_7_0=ruleMap();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameLogicRule());
            					}
            					set(
            						current,
            						"map",
            						lv_map_7_0,
            						"tdt4250.matrixgame.MatrixGame.Map");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMatrixGame.g:159:3: (otherlv_8= 'actions_played' otherlv_9= '{' ( (lv_actions_played_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_played_12_0= ruleAction ) ) )* otherlv_13= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMatrixGame.g:160:4: otherlv_8= 'actions_played' otherlv_9= '{' ( (lv_actions_played_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_actions_played_12_0= ruleAction ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getGameLogicAccess().getActions_playedKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMatrixGame.g:168:4: ( (lv_actions_played_10_0= ruleAction ) )
                    // InternalMatrixGame.g:169:5: (lv_actions_played_10_0= ruleAction )
                    {
                    // InternalMatrixGame.g:169:5: (lv_actions_played_10_0= ruleAction )
                    // InternalMatrixGame.g:170:6: lv_actions_played_10_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getGameLogicAccess().getActions_playedActionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_actions_played_10_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameLogicRule());
                    						}
                    						add(
                    							current,
                    							"actions_played",
                    							lv_actions_played_10_0,
                    							"tdt4250.matrixgame.MatrixGame.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMatrixGame.g:187:4: (otherlv_11= ',' ( (lv_actions_played_12_0= ruleAction ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMatrixGame.g:188:5: otherlv_11= ',' ( (lv_actions_played_12_0= ruleAction ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_11); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getGameLogicAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMatrixGame.g:192:5: ( (lv_actions_played_12_0= ruleAction ) )
                    	    // InternalMatrixGame.g:193:6: (lv_actions_played_12_0= ruleAction )
                    	    {
                    	    // InternalMatrixGame.g:193:6: (lv_actions_played_12_0= ruleAction )
                    	    // InternalMatrixGame.g:194:7: lv_actions_played_12_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameLogicAccess().getActions_playedActionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_actions_played_12_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameLogicRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions_played",
                    	    								lv_actions_played_12_0,
                    	    								"tdt4250.matrixgame.MatrixGame.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMatrixGame.g:217:3: (otherlv_14= 'has_state' otherlv_15= '{' ( (lv_has_state_16_0= ruleState ) ) (otherlv_17= ',' ( (lv_has_state_18_0= ruleState ) ) )* otherlv_19= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMatrixGame.g:218:4: otherlv_14= 'has_state' otherlv_15= '{' ( (lv_has_state_16_0= ruleState ) ) (otherlv_17= ',' ( (lv_has_state_18_0= ruleState ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getGameLogicAccess().getHas_stateKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMatrixGame.g:226:4: ( (lv_has_state_16_0= ruleState ) )
                    // InternalMatrixGame.g:227:5: (lv_has_state_16_0= ruleState )
                    {
                    // InternalMatrixGame.g:227:5: (lv_has_state_16_0= ruleState )
                    // InternalMatrixGame.g:228:6: lv_has_state_16_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getGameLogicAccess().getHas_stateStateParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_has_state_16_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameLogicRule());
                    						}
                    						add(
                    							current,
                    							"has_state",
                    							lv_has_state_16_0,
                    							"tdt4250.matrixgame.MatrixGame.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMatrixGame.g:245:4: (otherlv_17= ',' ( (lv_has_state_18_0= ruleState ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMatrixGame.g:246:5: otherlv_17= ',' ( (lv_has_state_18_0= ruleState ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FOLLOW_14); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getGameLogicAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMatrixGame.g:250:5: ( (lv_has_state_18_0= ruleState ) )
                    	    // InternalMatrixGame.g:251:6: (lv_has_state_18_0= ruleState )
                    	    {
                    	    // InternalMatrixGame.g:251:6: (lv_has_state_18_0= ruleState )
                    	    // InternalMatrixGame.g:252:7: lv_has_state_18_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameLogicAccess().getHas_stateStateParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_has_state_18_0=ruleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameLogicRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"has_state",
                    	    								lv_has_state_18_0,
                    	    								"tdt4250.matrixgame.MatrixGame.State");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_19, grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGameLogic"


    // $ANTLR start "entryRulePlayer"
    // InternalMatrixGame.g:283:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalMatrixGame.g:283:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalMatrixGame.g:284:2: iv_rulePlayer= rulePlayer EOF
            {
             newCompositeNode(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayer=rulePlayer();

            state._fsp--;

             current =iv_rulePlayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalMatrixGame.g:290:1: rulePlayer returns [EObject current=null] : ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'score' ( (lv_score_5_0= ruleEInt ) ) )? (otherlv_6= 'takes_action' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}' ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_score_5_0 = null;



        	enterRule();

        try {
            // InternalMatrixGame.g:296:2: ( ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'score' ( (lv_score_5_0= ruleEInt ) ) )? (otherlv_6= 'takes_action' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}' ) )
            // InternalMatrixGame.g:297:2: ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'score' ( (lv_score_5_0= ruleEInt ) ) )? (otherlv_6= 'takes_action' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}' )
            {
            // InternalMatrixGame.g:297:2: ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'score' ( (lv_score_5_0= ruleEInt ) ) )? (otherlv_6= 'takes_action' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}' )
            // InternalMatrixGame.g:298:3: () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'score' ( (lv_score_5_0= ruleEInt ) ) )? (otherlv_6= 'takes_action' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= '}'
            {
            // InternalMatrixGame.g:298:3: ()
            // InternalMatrixGame.g:299:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlayerAccess().getPlayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPlayerAccess().getPlayerKeyword_1());
            		
            // InternalMatrixGame.g:309:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMatrixGame.g:310:4: (lv_name_2_0= ruleEString )
            {
            // InternalMatrixGame.g:310:4: (lv_name_2_0= ruleEString )
            // InternalMatrixGame.g:311:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.matrixgame.MatrixGame.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMatrixGame.g:332:3: (otherlv_4= 'score' ( (lv_score_5_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMatrixGame.g:333:4: otherlv_4= 'score' ( (lv_score_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlayerAccess().getScoreKeyword_4_0());
                    			
                    // InternalMatrixGame.g:337:4: ( (lv_score_5_0= ruleEInt ) )
                    // InternalMatrixGame.g:338:5: (lv_score_5_0= ruleEInt )
                    {
                    // InternalMatrixGame.g:338:5: (lv_score_5_0= ruleEInt )
                    // InternalMatrixGame.g:339:6: lv_score_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPlayerAccess().getScoreEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_score_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlayerRule());
                    						}
                    						set(
                    							current,
                    							"score",
                    							lv_score_5_0,
                    							"tdt4250.matrixgame.MatrixGame.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMatrixGame.g:357:3: (otherlv_6= 'takes_action' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMatrixGame.g:358:4: otherlv_6= 'takes_action' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getPlayerAccess().getTakes_actionKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getPlayerAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMatrixGame.g:366:4: ( ( ruleEString ) )
                    // InternalMatrixGame.g:367:5: ( ruleEString )
                    {
                    // InternalMatrixGame.g:367:5: ( ruleEString )
                    // InternalMatrixGame.g:368:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlayerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlayerAccess().getTakes_actionActionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMatrixGame.g:382:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMatrixGame.g:383:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPlayerAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMatrixGame.g:387:5: ( ( ruleEString ) )
                    	    // InternalMatrixGame.g:388:6: ( ruleEString )
                    	    {
                    	    // InternalMatrixGame.g:388:6: ( ruleEString )
                    	    // InternalMatrixGame.g:389:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPlayerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPlayerAccess().getTakes_actionActionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getPlayerAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleMap"
    // InternalMatrixGame.g:417:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalMatrixGame.g:417:44: (iv_ruleMap= ruleMap EOF )
            // InternalMatrixGame.g:418:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalMatrixGame.g:424:1: ruleMap returns [EObject current=null] : (otherlv_0= 'Map' otherlv_1= '{' (otherlv_2= 'amountOfTiles' ( (lv_amountOfTiles_3_0= ruleEInt ) ) )? otherlv_4= 'mapSizeX' ( (lv_mapSizeX_5_0= ruleEInt ) ) otherlv_6= 'mapSizeY' ( (lv_mapSizeY_7_0= ruleEInt ) ) (otherlv_8= 'mapName' ( (lv_mapName_9_0= ruleEString ) ) )? otherlv_10= 'tile' otherlv_11= '{' ( (lv_tile_12_0= ruleTile ) ) (otherlv_13= ',' ( (lv_tile_14_0= ruleTile ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_amountOfTiles_3_0 = null;

        AntlrDatatypeRuleToken lv_mapSizeX_5_0 = null;

        AntlrDatatypeRuleToken lv_mapSizeY_7_0 = null;

        AntlrDatatypeRuleToken lv_mapName_9_0 = null;

        EObject lv_tile_12_0 = null;

        EObject lv_tile_14_0 = null;



        	enterRule();

        try {
            // InternalMatrixGame.g:430:2: ( (otherlv_0= 'Map' otherlv_1= '{' (otherlv_2= 'amountOfTiles' ( (lv_amountOfTiles_3_0= ruleEInt ) ) )? otherlv_4= 'mapSizeX' ( (lv_mapSizeX_5_0= ruleEInt ) ) otherlv_6= 'mapSizeY' ( (lv_mapSizeY_7_0= ruleEInt ) ) (otherlv_8= 'mapName' ( (lv_mapName_9_0= ruleEString ) ) )? otherlv_10= 'tile' otherlv_11= '{' ( (lv_tile_12_0= ruleTile ) ) (otherlv_13= ',' ( (lv_tile_14_0= ruleTile ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalMatrixGame.g:431:2: (otherlv_0= 'Map' otherlv_1= '{' (otherlv_2= 'amountOfTiles' ( (lv_amountOfTiles_3_0= ruleEInt ) ) )? otherlv_4= 'mapSizeX' ( (lv_mapSizeX_5_0= ruleEInt ) ) otherlv_6= 'mapSizeY' ( (lv_mapSizeY_7_0= ruleEInt ) ) (otherlv_8= 'mapName' ( (lv_mapName_9_0= ruleEString ) ) )? otherlv_10= 'tile' otherlv_11= '{' ( (lv_tile_12_0= ruleTile ) ) (otherlv_13= ',' ( (lv_tile_14_0= ruleTile ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalMatrixGame.g:431:2: (otherlv_0= 'Map' otherlv_1= '{' (otherlv_2= 'amountOfTiles' ( (lv_amountOfTiles_3_0= ruleEInt ) ) )? otherlv_4= 'mapSizeX' ( (lv_mapSizeX_5_0= ruleEInt ) ) otherlv_6= 'mapSizeY' ( (lv_mapSizeY_7_0= ruleEInt ) ) (otherlv_8= 'mapName' ( (lv_mapName_9_0= ruleEString ) ) )? otherlv_10= 'tile' otherlv_11= '{' ( (lv_tile_12_0= ruleTile ) ) (otherlv_13= ',' ( (lv_tile_14_0= ruleTile ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalMatrixGame.g:432:3: otherlv_0= 'Map' otherlv_1= '{' (otherlv_2= 'amountOfTiles' ( (lv_amountOfTiles_3_0= ruleEInt ) ) )? otherlv_4= 'mapSizeX' ( (lv_mapSizeX_5_0= ruleEInt ) ) otherlv_6= 'mapSizeY' ( (lv_mapSizeY_7_0= ruleEInt ) ) (otherlv_8= 'mapName' ( (lv_mapName_9_0= ruleEString ) ) )? otherlv_10= 'tile' otherlv_11= '{' ( (lv_tile_12_0= ruleTile ) ) (otherlv_13= ',' ( (lv_tile_14_0= ruleTile ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMapAccess().getMapKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMatrixGame.g:440:3: (otherlv_2= 'amountOfTiles' ( (lv_amountOfTiles_3_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMatrixGame.g:441:4: otherlv_2= 'amountOfTiles' ( (lv_amountOfTiles_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getMapAccess().getAmountOfTilesKeyword_2_0());
                    			
                    // InternalMatrixGame.g:445:4: ( (lv_amountOfTiles_3_0= ruleEInt ) )
                    // InternalMatrixGame.g:446:5: (lv_amountOfTiles_3_0= ruleEInt )
                    {
                    // InternalMatrixGame.g:446:5: (lv_amountOfTiles_3_0= ruleEInt )
                    // InternalMatrixGame.g:447:6: lv_amountOfTiles_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMapAccess().getAmountOfTilesEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_amountOfTiles_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapRule());
                    						}
                    						set(
                    							current,
                    							"amountOfTiles",
                    							lv_amountOfTiles_3_0,
                    							"tdt4250.matrixgame.MatrixGame.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMapAccess().getMapSizeXKeyword_3());
            		
            // InternalMatrixGame.g:469:3: ( (lv_mapSizeX_5_0= ruleEInt ) )
            // InternalMatrixGame.g:470:4: (lv_mapSizeX_5_0= ruleEInt )
            {
            // InternalMatrixGame.g:470:4: (lv_mapSizeX_5_0= ruleEInt )
            // InternalMatrixGame.g:471:5: lv_mapSizeX_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMapAccess().getMapSizeXEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_mapSizeX_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapRule());
            					}
            					set(
            						current,
            						"mapSizeX",
            						lv_mapSizeX_5_0,
            						"tdt4250.matrixgame.MatrixGame.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getMapAccess().getMapSizeYKeyword_5());
            		
            // InternalMatrixGame.g:492:3: ( (lv_mapSizeY_7_0= ruleEInt ) )
            // InternalMatrixGame.g:493:4: (lv_mapSizeY_7_0= ruleEInt )
            {
            // InternalMatrixGame.g:493:4: (lv_mapSizeY_7_0= ruleEInt )
            // InternalMatrixGame.g:494:5: lv_mapSizeY_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMapAccess().getMapSizeYEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_mapSizeY_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapRule());
            					}
            					set(
            						current,
            						"mapSizeY",
            						lv_mapSizeY_7_0,
            						"tdt4250.matrixgame.MatrixGame.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMatrixGame.g:511:3: (otherlv_8= 'mapName' ( (lv_mapName_9_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMatrixGame.g:512:4: otherlv_8= 'mapName' ( (lv_mapName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getMapAccess().getMapNameKeyword_7_0());
                    			
                    // InternalMatrixGame.g:516:4: ( (lv_mapName_9_0= ruleEString ) )
                    // InternalMatrixGame.g:517:5: (lv_mapName_9_0= ruleEString )
                    {
                    // InternalMatrixGame.g:517:5: (lv_mapName_9_0= ruleEString )
                    // InternalMatrixGame.g:518:6: lv_mapName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMapAccess().getMapNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_mapName_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapRule());
                    						}
                    						set(
                    							current,
                    							"mapName",
                    							lv_mapName_9_0,
                    							"tdt4250.matrixgame.MatrixGame.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getMapAccess().getTileKeyword_8());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMatrixGame.g:544:3: ( (lv_tile_12_0= ruleTile ) )
            // InternalMatrixGame.g:545:4: (lv_tile_12_0= ruleTile )
            {
            // InternalMatrixGame.g:545:4: (lv_tile_12_0= ruleTile )
            // InternalMatrixGame.g:546:5: lv_tile_12_0= ruleTile
            {

            					newCompositeNode(grammarAccess.getMapAccess().getTileTileParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_12);
            lv_tile_12_0=ruleTile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapRule());
            					}
            					add(
            						current,
            						"tile",
            						lv_tile_12_0,
            						"tdt4250.matrixgame.MatrixGame.Tile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMatrixGame.g:563:3: (otherlv_13= ',' ( (lv_tile_14_0= ruleTile ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMatrixGame.g:564:4: otherlv_13= ',' ( (lv_tile_14_0= ruleTile ) )
            	    {
            	    otherlv_13=(Token)match(input,17,FOLLOW_26); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMapAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMatrixGame.g:568:4: ( (lv_tile_14_0= ruleTile ) )
            	    // InternalMatrixGame.g:569:5: (lv_tile_14_0= ruleTile )
            	    {
            	    // InternalMatrixGame.g:569:5: (lv_tile_14_0= ruleTile )
            	    // InternalMatrixGame.g:570:6: lv_tile_14_0= ruleTile
            	    {

            	    						newCompositeNode(grammarAccess.getMapAccess().getTileTileParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_tile_14_0=ruleTile();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMapRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tile",
            	    							lv_tile_14_0,
            	    							"tdt4250.matrixgame.MatrixGame.Tile");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getMapAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getMapAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleAction"
    // InternalMatrixGame.g:600:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMatrixGame.g:600:47: (iv_ruleAction= ruleAction EOF )
            // InternalMatrixGame.g:601:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMatrixGame.g:607:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actionType' ( (lv_actionType_5_0= ruleActionType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_actionType_5_0 = null;



        	enterRule();

        try {
            // InternalMatrixGame.g:613:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actionType' ( (lv_actionType_5_0= ruleActionType ) ) )? otherlv_6= '}' ) )
            // InternalMatrixGame.g:614:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actionType' ( (lv_actionType_5_0= ruleActionType ) ) )? otherlv_6= '}' )
            {
            // InternalMatrixGame.g:614:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actionType' ( (lv_actionType_5_0= ruleActionType ) ) )? otherlv_6= '}' )
            // InternalMatrixGame.g:615:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actionType' ( (lv_actionType_5_0= ruleActionType ) ) )? otherlv_6= '}'
            {
            // InternalMatrixGame.g:615:3: ()
            // InternalMatrixGame.g:616:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
            		
            // InternalMatrixGame.g:626:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMatrixGame.g:627:4: (lv_name_2_0= ruleEString )
            {
            // InternalMatrixGame.g:627:4: (lv_name_2_0= ruleEString )
            // InternalMatrixGame.g:628:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.matrixgame.MatrixGame.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMatrixGame.g:649:3: (otherlv_4= 'actionType' ( (lv_actionType_5_0= ruleActionType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMatrixGame.g:650:4: otherlv_4= 'actionType' ( (lv_actionType_5_0= ruleActionType ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getActionTypeKeyword_4_0());
                    			
                    // InternalMatrixGame.g:654:4: ( (lv_actionType_5_0= ruleActionType ) )
                    // InternalMatrixGame.g:655:5: (lv_actionType_5_0= ruleActionType )
                    {
                    // InternalMatrixGame.g:655:5: (lv_actionType_5_0= ruleActionType )
                    // InternalMatrixGame.g:656:6: lv_actionType_5_0= ruleActionType
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getActionTypeActionTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_actionType_5_0=ruleActionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"actionType",
                    							lv_actionType_5_0,
                    							"tdt4250.matrixgame.MatrixGame.ActionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleState"
    // InternalMatrixGame.g:682:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMatrixGame.g:682:46: (iv_ruleState= ruleState EOF )
            // InternalMatrixGame.g:683:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMatrixGame.g:689:1: ruleState returns [EObject current=null] : ( ( (lv_flagsPlaced_0_0= 'flagsPlaced' ) )? ( (lv_isOver_1_0= 'isOver' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'turnsTaken' ( (lv_turnsTaken_6_0= ruleEInt ) ) )? otherlv_7= 'tile' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_flagsPlaced_0_0=null;
        Token lv_isOver_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_turnsTaken_6_0 = null;



        	enterRule();

        try {
            // InternalMatrixGame.g:695:2: ( ( ( (lv_flagsPlaced_0_0= 'flagsPlaced' ) )? ( (lv_isOver_1_0= 'isOver' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'turnsTaken' ( (lv_turnsTaken_6_0= ruleEInt ) ) )? otherlv_7= 'tile' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalMatrixGame.g:696:2: ( ( (lv_flagsPlaced_0_0= 'flagsPlaced' ) )? ( (lv_isOver_1_0= 'isOver' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'turnsTaken' ( (lv_turnsTaken_6_0= ruleEInt ) ) )? otherlv_7= 'tile' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalMatrixGame.g:696:2: ( ( (lv_flagsPlaced_0_0= 'flagsPlaced' ) )? ( (lv_isOver_1_0= 'isOver' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'turnsTaken' ( (lv_turnsTaken_6_0= ruleEInt ) ) )? otherlv_7= 'tile' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalMatrixGame.g:697:3: ( (lv_flagsPlaced_0_0= 'flagsPlaced' ) )? ( (lv_isOver_1_0= 'isOver' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'turnsTaken' ( (lv_turnsTaken_6_0= ruleEInt ) ) )? otherlv_7= 'tile' ( ( ruleEString ) ) otherlv_9= '}'
            {
            // InternalMatrixGame.g:697:3: ( (lv_flagsPlaced_0_0= 'flagsPlaced' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMatrixGame.g:698:4: (lv_flagsPlaced_0_0= 'flagsPlaced' )
                    {
                    // InternalMatrixGame.g:698:4: (lv_flagsPlaced_0_0= 'flagsPlaced' )
                    // InternalMatrixGame.g:699:5: lv_flagsPlaced_0_0= 'flagsPlaced'
                    {
                    lv_flagsPlaced_0_0=(Token)match(input,33,FOLLOW_29); 

                    					newLeafNode(lv_flagsPlaced_0_0, grammarAccess.getStateAccess().getFlagsPlacedFlagsPlacedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "flagsPlaced", lv_flagsPlaced_0_0 != null, "flagsPlaced");
                    				

                    }


                    }
                    break;

            }

            // InternalMatrixGame.g:711:3: ( (lv_isOver_1_0= 'isOver' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMatrixGame.g:712:4: (lv_isOver_1_0= 'isOver' )
                    {
                    // InternalMatrixGame.g:712:4: (lv_isOver_1_0= 'isOver' )
                    // InternalMatrixGame.g:713:5: lv_isOver_1_0= 'isOver'
                    {
                    lv_isOver_1_0=(Token)match(input,34,FOLLOW_30); 

                    					newLeafNode(lv_isOver_1_0, grammarAccess.getStateAccess().getIsOverIsOverKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "isOver", lv_isOver_1_0 != null, "isOver");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_2());
            		
            // InternalMatrixGame.g:729:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMatrixGame.g:730:4: (lv_name_3_0= ruleEString )
            {
            // InternalMatrixGame.g:730:4: (lv_name_3_0= ruleEString )
            // InternalMatrixGame.g:731:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"tdt4250.matrixgame.MatrixGame.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMatrixGame.g:752:3: (otherlv_5= 'turnsTaken' ( (lv_turnsTaken_6_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMatrixGame.g:753:4: otherlv_5= 'turnsTaken' ( (lv_turnsTaken_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getTurnsTakenKeyword_5_0());
                    			
                    // InternalMatrixGame.g:757:4: ( (lv_turnsTaken_6_0= ruleEInt ) )
                    // InternalMatrixGame.g:758:5: (lv_turnsTaken_6_0= ruleEInt )
                    {
                    // InternalMatrixGame.g:758:5: (lv_turnsTaken_6_0= ruleEInt )
                    // InternalMatrixGame.g:759:6: lv_turnsTaken_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getTurnsTakenEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_turnsTaken_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						set(
                    							current,
                    							"turnsTaken",
                    							lv_turnsTaken_6_0,
                    							"tdt4250.matrixgame.MatrixGame.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getStateAccess().getTileKeyword_6());
            		
            // InternalMatrixGame.g:781:3: ( ( ruleEString ) )
            // InternalMatrixGame.g:782:4: ( ruleEString )
            {
            // InternalMatrixGame.g:782:4: ( ruleEString )
            // InternalMatrixGame.g:783:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateAccess().getTileTileCrossReference_7_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEString"
    // InternalMatrixGame.g:805:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMatrixGame.g:805:47: (iv_ruleEString= ruleEString EOF )
            // InternalMatrixGame.g:806:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMatrixGame.g:812:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMatrixGame.g:818:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMatrixGame.g:819:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMatrixGame.g:819:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMatrixGame.g:820:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMatrixGame.g:828:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMatrixGame.g:839:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMatrixGame.g:839:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMatrixGame.g:840:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMatrixGame.g:846:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMatrixGame.g:852:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMatrixGame.g:853:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMatrixGame.g:853:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMatrixGame.g:854:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMatrixGame.g:854:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMatrixGame.g:855:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTile"
    // InternalMatrixGame.g:872:1: entryRuleTile returns [EObject current=null] : iv_ruleTile= ruleTile EOF ;
    public final EObject entryRuleTile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTile = null;


        try {
            // InternalMatrixGame.g:872:45: (iv_ruleTile= ruleTile EOF )
            // InternalMatrixGame.g:873:2: iv_ruleTile= ruleTile EOF
            {
             newCompositeNode(grammarAccess.getTileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTile=ruleTile();

            state._fsp--;

             current =iv_ruleTile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTile"


    // $ANTLR start "ruleTile"
    // InternalMatrixGame.g:879:1: ruleTile returns [EObject current=null] : ( ( (lv_isAccessible_0_0= 'isAccessible' ) ) otherlv_1= 'Tile' otherlv_2= '{' otherlv_3= 'tilePlace' ( (lv_tilePlace_4_0= ruleEString ) ) otherlv_5= 'tileType' ( (lv_tileType_6_0= ruleTileType ) ) (otherlv_7= 'Color' ( (lv_Color_8_0= ruleEString ) ) )? otherlv_9= 'xCoordinate' ( (lv_xCoordinate_10_0= ruleEInt ) ) otherlv_11= 'yCoordinate' ( (lv_yCoordinate_12_0= ruleEInt ) ) otherlv_13= '}' ) ;
    public final EObject ruleTile() throws RecognitionException {
        EObject current = null;

        Token lv_isAccessible_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_tilePlace_4_0 = null;

        Enumerator lv_tileType_6_0 = null;

        AntlrDatatypeRuleToken lv_Color_8_0 = null;

        AntlrDatatypeRuleToken lv_xCoordinate_10_0 = null;

        AntlrDatatypeRuleToken lv_yCoordinate_12_0 = null;



        	enterRule();

        try {
            // InternalMatrixGame.g:885:2: ( ( ( (lv_isAccessible_0_0= 'isAccessible' ) ) otherlv_1= 'Tile' otherlv_2= '{' otherlv_3= 'tilePlace' ( (lv_tilePlace_4_0= ruleEString ) ) otherlv_5= 'tileType' ( (lv_tileType_6_0= ruleTileType ) ) (otherlv_7= 'Color' ( (lv_Color_8_0= ruleEString ) ) )? otherlv_9= 'xCoordinate' ( (lv_xCoordinate_10_0= ruleEInt ) ) otherlv_11= 'yCoordinate' ( (lv_yCoordinate_12_0= ruleEInt ) ) otherlv_13= '}' ) )
            // InternalMatrixGame.g:886:2: ( ( (lv_isAccessible_0_0= 'isAccessible' ) ) otherlv_1= 'Tile' otherlv_2= '{' otherlv_3= 'tilePlace' ( (lv_tilePlace_4_0= ruleEString ) ) otherlv_5= 'tileType' ( (lv_tileType_6_0= ruleTileType ) ) (otherlv_7= 'Color' ( (lv_Color_8_0= ruleEString ) ) )? otherlv_9= 'xCoordinate' ( (lv_xCoordinate_10_0= ruleEInt ) ) otherlv_11= 'yCoordinate' ( (lv_yCoordinate_12_0= ruleEInt ) ) otherlv_13= '}' )
            {
            // InternalMatrixGame.g:886:2: ( ( (lv_isAccessible_0_0= 'isAccessible' ) ) otherlv_1= 'Tile' otherlv_2= '{' otherlv_3= 'tilePlace' ( (lv_tilePlace_4_0= ruleEString ) ) otherlv_5= 'tileType' ( (lv_tileType_6_0= ruleTileType ) ) (otherlv_7= 'Color' ( (lv_Color_8_0= ruleEString ) ) )? otherlv_9= 'xCoordinate' ( (lv_xCoordinate_10_0= ruleEInt ) ) otherlv_11= 'yCoordinate' ( (lv_yCoordinate_12_0= ruleEInt ) ) otherlv_13= '}' )
            // InternalMatrixGame.g:887:3: ( (lv_isAccessible_0_0= 'isAccessible' ) ) otherlv_1= 'Tile' otherlv_2= '{' otherlv_3= 'tilePlace' ( (lv_tilePlace_4_0= ruleEString ) ) otherlv_5= 'tileType' ( (lv_tileType_6_0= ruleTileType ) ) (otherlv_7= 'Color' ( (lv_Color_8_0= ruleEString ) ) )? otherlv_9= 'xCoordinate' ( (lv_xCoordinate_10_0= ruleEInt ) ) otherlv_11= 'yCoordinate' ( (lv_yCoordinate_12_0= ruleEInt ) ) otherlv_13= '}'
            {
            // InternalMatrixGame.g:887:3: ( (lv_isAccessible_0_0= 'isAccessible' ) )
            // InternalMatrixGame.g:888:4: (lv_isAccessible_0_0= 'isAccessible' )
            {
            // InternalMatrixGame.g:888:4: (lv_isAccessible_0_0= 'isAccessible' )
            // InternalMatrixGame.g:889:5: lv_isAccessible_0_0= 'isAccessible'
            {
            lv_isAccessible_0_0=(Token)match(input,38,FOLLOW_33); 

            					newLeafNode(lv_isAccessible_0_0, grammarAccess.getTileAccess().getIsAccessibleIsAccessibleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTileRule());
            					}
            					setWithLastConsumed(current, "isAccessible", lv_isAccessible_0_0 != null, "isAccessible");
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTileAccess().getTileKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTileAccess().getTilePlaceKeyword_3());
            		
            // InternalMatrixGame.g:913:3: ( (lv_tilePlace_4_0= ruleEString ) )
            // InternalMatrixGame.g:914:4: (lv_tilePlace_4_0= ruleEString )
            {
            // InternalMatrixGame.g:914:4: (lv_tilePlace_4_0= ruleEString )
            // InternalMatrixGame.g:915:5: lv_tilePlace_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTileAccess().getTilePlaceEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
            lv_tilePlace_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"tilePlace",
            						lv_tilePlace_4_0,
            						"tdt4250.matrixgame.MatrixGame.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getTileAccess().getTileTypeKeyword_5());
            		
            // InternalMatrixGame.g:936:3: ( (lv_tileType_6_0= ruleTileType ) )
            // InternalMatrixGame.g:937:4: (lv_tileType_6_0= ruleTileType )
            {
            // InternalMatrixGame.g:937:4: (lv_tileType_6_0= ruleTileType )
            // InternalMatrixGame.g:938:5: lv_tileType_6_0= ruleTileType
            {

            					newCompositeNode(grammarAccess.getTileAccess().getTileTypeTileTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_37);
            lv_tileType_6_0=ruleTileType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"tileType",
            						lv_tileType_6_0,
            						"tdt4250.matrixgame.MatrixGame.TileType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMatrixGame.g:955:3: (otherlv_7= 'Color' ( (lv_Color_8_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMatrixGame.g:956:4: otherlv_7= 'Color' ( (lv_Color_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getTileAccess().getColorKeyword_7_0());
                    			
                    // InternalMatrixGame.g:960:4: ( (lv_Color_8_0= ruleEString ) )
                    // InternalMatrixGame.g:961:5: (lv_Color_8_0= ruleEString )
                    {
                    // InternalMatrixGame.g:961:5: (lv_Color_8_0= ruleEString )
                    // InternalMatrixGame.g:962:6: lv_Color_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTileAccess().getColorEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_Color_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTileRule());
                    						}
                    						set(
                    							current,
                    							"Color",
                    							lv_Color_8_0,
                    							"tdt4250.matrixgame.MatrixGame.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getTileAccess().getXCoordinateKeyword_8());
            		
            // InternalMatrixGame.g:984:3: ( (lv_xCoordinate_10_0= ruleEInt ) )
            // InternalMatrixGame.g:985:4: (lv_xCoordinate_10_0= ruleEInt )
            {
            // InternalMatrixGame.g:985:4: (lv_xCoordinate_10_0= ruleEInt )
            // InternalMatrixGame.g:986:5: lv_xCoordinate_10_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTileAccess().getXCoordinateEIntParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_39);
            lv_xCoordinate_10_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"xCoordinate",
            						lv_xCoordinate_10_0,
            						"tdt4250.matrixgame.MatrixGame.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,44,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getTileAccess().getYCoordinateKeyword_10());
            		
            // InternalMatrixGame.g:1007:3: ( (lv_yCoordinate_12_0= ruleEInt ) )
            // InternalMatrixGame.g:1008:4: (lv_yCoordinate_12_0= ruleEInt )
            {
            // InternalMatrixGame.g:1008:4: (lv_yCoordinate_12_0= ruleEInt )
            // InternalMatrixGame.g:1009:5: lv_yCoordinate_12_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTileAccess().getYCoordinateEIntParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_15);
            lv_yCoordinate_12_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTileRule());
            					}
            					set(
            						current,
            						"yCoordinate",
            						lv_yCoordinate_12_0,
            						"tdt4250.matrixgame.MatrixGame.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTile"


    // $ANTLR start "ruleTileType"
    // InternalMatrixGame.g:1034:1: ruleTileType returns [Enumerator current=null] : ( (enumLiteral_0= 'BASIC' ) | (enumLiteral_1= 'REWARD' ) | (enumLiteral_2= 'OBSTACLE' ) | (enumLiteral_3= 'INTERACTIVE' ) | (enumLiteral_4= 'CRASH' ) ) ;
    public final Enumerator ruleTileType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMatrixGame.g:1040:2: ( ( (enumLiteral_0= 'BASIC' ) | (enumLiteral_1= 'REWARD' ) | (enumLiteral_2= 'OBSTACLE' ) | (enumLiteral_3= 'INTERACTIVE' ) | (enumLiteral_4= 'CRASH' ) ) )
            // InternalMatrixGame.g:1041:2: ( (enumLiteral_0= 'BASIC' ) | (enumLiteral_1= 'REWARD' ) | (enumLiteral_2= 'OBSTACLE' ) | (enumLiteral_3= 'INTERACTIVE' ) | (enumLiteral_4= 'CRASH' ) )
            {
            // InternalMatrixGame.g:1041:2: ( (enumLiteral_0= 'BASIC' ) | (enumLiteral_1= 'REWARD' ) | (enumLiteral_2= 'OBSTACLE' ) | (enumLiteral_3= 'INTERACTIVE' ) | (enumLiteral_4= 'CRASH' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt19=1;
                }
                break;
            case 46:
                {
                alt19=2;
                }
                break;
            case 47:
                {
                alt19=3;
                }
                break;
            case 48:
                {
                alt19=4;
                }
                break;
            case 49:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMatrixGame.g:1042:3: (enumLiteral_0= 'BASIC' )
                    {
                    // InternalMatrixGame.g:1042:3: (enumLiteral_0= 'BASIC' )
                    // InternalMatrixGame.g:1043:4: enumLiteral_0= 'BASIC'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTileTypeAccess().getBASICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTileTypeAccess().getBASICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMatrixGame.g:1050:3: (enumLiteral_1= 'REWARD' )
                    {
                    // InternalMatrixGame.g:1050:3: (enumLiteral_1= 'REWARD' )
                    // InternalMatrixGame.g:1051:4: enumLiteral_1= 'REWARD'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTileTypeAccess().getREWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTileTypeAccess().getREWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMatrixGame.g:1058:3: (enumLiteral_2= 'OBSTACLE' )
                    {
                    // InternalMatrixGame.g:1058:3: (enumLiteral_2= 'OBSTACLE' )
                    // InternalMatrixGame.g:1059:4: enumLiteral_2= 'OBSTACLE'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTileTypeAccess().getOBSTACLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTileTypeAccess().getOBSTACLEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMatrixGame.g:1066:3: (enumLiteral_3= 'INTERACTIVE' )
                    {
                    // InternalMatrixGame.g:1066:3: (enumLiteral_3= 'INTERACTIVE' )
                    // InternalMatrixGame.g:1067:4: enumLiteral_3= 'INTERACTIVE'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTileTypeAccess().getINTERACTIVEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTileTypeAccess().getINTERACTIVEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMatrixGame.g:1074:3: (enumLiteral_4= 'CRASH' )
                    {
                    // InternalMatrixGame.g:1074:3: (enumLiteral_4= 'CRASH' )
                    // InternalMatrixGame.g:1075:4: enumLiteral_4= 'CRASH'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTileTypeAccess().getCRASHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTileTypeAccess().getCRASHEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTileType"


    // $ANTLR start "ruleActionType"
    // InternalMatrixGame.g:1085:1: ruleActionType returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'REVEAL' ) | (enumLiteral_2= 'MOVE' ) | (enumLiteral_3= 'TOGGLE' ) | (enumLiteral_4= 'ATTACK' ) ) ;
    public final Enumerator ruleActionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMatrixGame.g:1091:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'REVEAL' ) | (enumLiteral_2= 'MOVE' ) | (enumLiteral_3= 'TOGGLE' ) | (enumLiteral_4= 'ATTACK' ) ) )
            // InternalMatrixGame.g:1092:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'REVEAL' ) | (enumLiteral_2= 'MOVE' ) | (enumLiteral_3= 'TOGGLE' ) | (enumLiteral_4= 'ATTACK' ) )
            {
            // InternalMatrixGame.g:1092:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'REVEAL' ) | (enumLiteral_2= 'MOVE' ) | (enumLiteral_3= 'TOGGLE' ) | (enumLiteral_4= 'ATTACK' ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt20=1;
                }
                break;
            case 51:
                {
                alt20=2;
                }
                break;
            case 52:
                {
                alt20=3;
                }
                break;
            case 53:
                {
                alt20=4;
                }
                break;
            case 54:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMatrixGame.g:1093:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalMatrixGame.g:1093:3: (enumLiteral_0= 'NONE' )
                    // InternalMatrixGame.g:1094:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionTypeAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMatrixGame.g:1101:3: (enumLiteral_1= 'REVEAL' )
                    {
                    // InternalMatrixGame.g:1101:3: (enumLiteral_1= 'REVEAL' )
                    // InternalMatrixGame.g:1102:4: enumLiteral_1= 'REVEAL'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getREVEALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionTypeAccess().getREVEALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMatrixGame.g:1109:3: (enumLiteral_2= 'MOVE' )
                    {
                    // InternalMatrixGame.g:1109:3: (enumLiteral_2= 'MOVE' )
                    // InternalMatrixGame.g:1110:4: enumLiteral_2= 'MOVE'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getMOVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionTypeAccess().getMOVEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMatrixGame.g:1117:3: (enumLiteral_3= 'TOGGLE' )
                    {
                    // InternalMatrixGame.g:1117:3: (enumLiteral_3= 'TOGGLE' )
                    // InternalMatrixGame.g:1118:4: enumLiteral_3= 'TOGGLE'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getTOGGLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionTypeAccess().getTOGGLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMatrixGame.g:1125:3: (enumLiteral_4= 'ATTACK' )
                    {
                    // InternalMatrixGame.g:1125:3: (enumLiteral_4= 'ATTACK' )
                    // InternalMatrixGame.g:1126:4: enumLiteral_4= 'ATTACK'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getATTACKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActionTypeAccess().getATTACKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x007C000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});

}