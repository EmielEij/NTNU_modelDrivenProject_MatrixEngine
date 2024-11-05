/*
 * generated by Xtext 2.36.0
 */
grammar InternalMatrixGame;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package tdt4250.matrixgame.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGameLogic
entryRuleGameLogic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGameLogicRule()); }
	iv_ruleGameLogic=ruleGameLogic
	{ $current=$iv_ruleGameLogic.current; }
	EOF;

// Rule GameLogic
ruleGameLogic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GameLogic'
		{
			newLeafNode(otherlv_0, grammarAccess.getGameLogicAccess().getGameLogicKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='gameName'
			{
				newLeafNode(otherlv_2, grammarAccess.getGameLogicAccess().getGameNameKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGameLogicAccess().getGameNameEStringParserRuleCall_2_1_0());
					}
					lv_gameName_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGameLogicRule());
						}
						set(
							$current,
							"gameName",
							lv_gameName_3_0,
							"tdt4250.matrixgame.MatrixGame.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='player'
		{
			newLeafNode(otherlv_4, grammarAccess.getGameLogicAccess().getPlayerKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGameLogicAccess().getPlayerPlayerParserRuleCall_4_0());
				}
				lv_player_5_0=rulePlayer
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameLogicRule());
					}
					set(
						$current,
						"player",
						lv_player_5_0,
						"tdt4250.matrixgame.MatrixGame.Player");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='map'
		{
			newLeafNode(otherlv_6, grammarAccess.getGameLogicAccess().getMapKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGameLogicAccess().getMapMapParserRuleCall_6_0());
				}
				lv_map_7_0=ruleMap
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameLogicRule());
					}
					set(
						$current,
						"map",
						lv_map_7_0,
						"tdt4250.matrixgame.MatrixGame.Map");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_8='actions_played'
			{
				newLeafNode(otherlv_8, grammarAccess.getGameLogicAccess().getActions_playedKeyword_7_0());
			}
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGameLogicAccess().getActions_playedActionParserRuleCall_7_2_0());
					}
					lv_actions_played_10_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGameLogicRule());
						}
						add(
							$current,
							"actions_played",
							lv_actions_played_10_0,
							"tdt4250.matrixgame.MatrixGame.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getGameLogicAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getGameLogicAccess().getActions_playedActionParserRuleCall_7_3_1_0());
						}
						lv_actions_played_12_0=ruleAction
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getGameLogicRule());
							}
							add(
								$current,
								"actions_played",
								lv_actions_played_12_0,
								"tdt4250.matrixgame.MatrixGame.Action");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_13='}'
			{
				newLeafNode(otherlv_13, grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_7_4());
			}
		)?
		(
			otherlv_14='has_state'
			{
				newLeafNode(otherlv_14, grammarAccess.getGameLogicAccess().getHas_stateKeyword_8_0());
			}
			otherlv_15='{'
			{
				newLeafNode(otherlv_15, grammarAccess.getGameLogicAccess().getLeftCurlyBracketKeyword_8_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGameLogicAccess().getHas_stateStateParserRuleCall_8_2_0());
					}
					lv_has_state_16_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGameLogicRule());
						}
						add(
							$current,
							"has_state",
							lv_has_state_16_0,
							"tdt4250.matrixgame.MatrixGame.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17=','
				{
					newLeafNode(otherlv_17, grammarAccess.getGameLogicAccess().getCommaKeyword_8_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getGameLogicAccess().getHas_stateStateParserRuleCall_8_3_1_0());
						}
						lv_has_state_18_0=ruleState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getGameLogicRule());
							}
							add(
								$current,
								"has_state",
								lv_has_state_18_0,
								"tdt4250.matrixgame.MatrixGame.State");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_19='}'
			{
				newLeafNode(otherlv_19, grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_8_4());
			}
		)?
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getGameLogicAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRulePlayer
entryRulePlayer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlayerRule()); }
	iv_rulePlayer=rulePlayer
	{ $current=$iv_rulePlayer.current; }
	EOF;

// Rule Player
rulePlayer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPlayerAccess().getPlayerAction_0(),
					$current);
			}
		)
		otherlv_1='Player'
		{
			newLeafNode(otherlv_1, grammarAccess.getPlayerAccess().getPlayerKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPlayerRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"tdt4250.matrixgame.MatrixGame.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='score'
			{
				newLeafNode(otherlv_4, grammarAccess.getPlayerAccess().getScoreKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPlayerAccess().getScoreEIntParserRuleCall_4_1_0());
					}
					lv_score_5_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlayerRule());
						}
						set(
							$current,
							"score",
							lv_score_5_0,
							"tdt4250.matrixgame.MatrixGame.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='takes_action'
			{
				newLeafNode(otherlv_6, grammarAccess.getPlayerAccess().getTakes_actionKeyword_5_0());
			}
			otherlv_7='('
			{
				newLeafNode(otherlv_7, grammarAccess.getPlayerAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlayerRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getPlayerAccess().getTakes_actionActionCrossReference_5_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getPlayerAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPlayerRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getPlayerAccess().getTakes_actionActionCrossReference_5_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11=')'
			{
				newLeafNode(otherlv_11, grammarAccess.getPlayerAccess().getRightParenthesisKeyword_5_4());
			}
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleMap
entryRuleMap returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMapRule()); }
	iv_ruleMap=ruleMap
	{ $current=$iv_ruleMap.current; }
	EOF;

// Rule Map
ruleMap returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Map'
		{
			newLeafNode(otherlv_0, grammarAccess.getMapAccess().getMapKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='amountOfTiles'
			{
				newLeafNode(otherlv_2, grammarAccess.getMapAccess().getAmountOfTilesKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMapAccess().getAmountOfTilesEIntParserRuleCall_2_1_0());
					}
					lv_amountOfTiles_3_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMapRule());
						}
						set(
							$current,
							"amountOfTiles",
							lv_amountOfTiles_3_0,
							"tdt4250.matrixgame.MatrixGame.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='mapSizeX'
		{
			newLeafNode(otherlv_4, grammarAccess.getMapAccess().getMapSizeXKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMapAccess().getMapSizeXEIntParserRuleCall_4_0());
				}
				lv_mapSizeX_5_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMapRule());
					}
					set(
						$current,
						"mapSizeX",
						lv_mapSizeX_5_0,
						"tdt4250.matrixgame.MatrixGame.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='mapSizeY'
		{
			newLeafNode(otherlv_6, grammarAccess.getMapAccess().getMapSizeYKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMapAccess().getMapSizeYEIntParserRuleCall_6_0());
				}
				lv_mapSizeY_7_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMapRule());
					}
					set(
						$current,
						"mapSizeY",
						lv_mapSizeY_7_0,
						"tdt4250.matrixgame.MatrixGame.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_8='mapName'
			{
				newLeafNode(otherlv_8, grammarAccess.getMapAccess().getMapNameKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMapAccess().getMapNameEStringParserRuleCall_7_1_0());
					}
					lv_mapName_9_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMapRule());
						}
						set(
							$current,
							"mapName",
							lv_mapName_9_0,
							"tdt4250.matrixgame.MatrixGame.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_10='tile'
		{
			newLeafNode(otherlv_10, grammarAccess.getMapAccess().getTileKeyword_8());
		}
		otherlv_11='{'
		{
			newLeafNode(otherlv_11, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMapAccess().getTileTileParserRuleCall_10_0());
				}
				lv_tile_12_0=ruleTile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMapRule());
					}
					add(
						$current,
						"tile",
						lv_tile_12_0,
						"tdt4250.matrixgame.MatrixGame.Tile");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_13=','
			{
				newLeafNode(otherlv_13, grammarAccess.getMapAccess().getCommaKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMapAccess().getTileTileParserRuleCall_11_1_0());
					}
					lv_tile_14_0=ruleTile
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMapRule());
						}
						add(
							$current,
							"tile",
							lv_tile_14_0,
							"tdt4250.matrixgame.MatrixGame.Tile");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getMapAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getMapAccess().getRightCurlyBracketKeyword_13());
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActionAccess().getActionAction_0(),
					$current);
			}
		)
		otherlv_1='Action'
		{
			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"tdt4250.matrixgame.MatrixGame.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='actionType'
			{
				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getActionTypeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionAccess().getActionTypeActionTypeEnumRuleCall_4_1_0());
					}
					lv_actionType_5_0=ruleActionType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionRule());
						}
						set(
							$current,
							"actionType",
							lv_actionType_5_0,
							"tdt4250.matrixgame.MatrixGame.ActionType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_flagsPlaced_0_0='flagsPlaced'
				{
					newLeafNode(lv_flagsPlaced_0_0, grammarAccess.getStateAccess().getFlagsPlacedFlagsPlacedKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed($current, "flagsPlaced", lv_flagsPlaced_0_0 != null, "flagsPlaced");
				}
			)
		)?
		(
			(
				lv_isOver_1_0='isOver'
				{
					newLeafNode(lv_isOver_1_0, grammarAccess.getStateAccess().getIsOverIsOverKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed($current, "isOver", lv_isOver_1_0 != null, "isOver");
				}
			)
		)?
		otherlv_2='State'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0());
				}
				lv_name_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"tdt4250.matrixgame.MatrixGame.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='turnsTaken'
			{
				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getTurnsTakenKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getTurnsTakenEIntParserRuleCall_5_1_0());
					}
					lv_turnsTaken_6_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						set(
							$current,
							"turnsTaken",
							lv_turnsTaken_6_0,
							"tdt4250.matrixgame.MatrixGame.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='tile'
		{
			newLeafNode(otherlv_7, grammarAccess.getStateAccess().getTileKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStateAccess().getTileTileCrossReference_7_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleTile
entryRuleTile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTileRule()); }
	iv_ruleTile=ruleTile
	{ $current=$iv_ruleTile.current; }
	EOF;

// Rule Tile
ruleTile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isAccessible_0_0='isAccessible'
				{
					newLeafNode(lv_isAccessible_0_0, grammarAccess.getTileAccess().getIsAccessibleIsAccessibleKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTileRule());
					}
					setWithLastConsumed($current, "isAccessible", lv_isAccessible_0_0 != null, "isAccessible");
				}
			)
		)
		otherlv_1='Tile'
		{
			newLeafNode(otherlv_1, grammarAccess.getTileAccess().getTileKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTileAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='tilePlace'
		{
			newLeafNode(otherlv_3, grammarAccess.getTileAccess().getTilePlaceKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTileAccess().getTilePlaceEStringParserRuleCall_4_0());
				}
				lv_tilePlace_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTileRule());
					}
					set(
						$current,
						"tilePlace",
						lv_tilePlace_4_0,
						"tdt4250.matrixgame.MatrixGame.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='tileType'
		{
			newLeafNode(otherlv_5, grammarAccess.getTileAccess().getTileTypeKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTileAccess().getTileTypeTileTypeEnumRuleCall_6_0());
				}
				lv_tileType_6_0=ruleTileType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTileRule());
					}
					set(
						$current,
						"tileType",
						lv_tileType_6_0,
						"tdt4250.matrixgame.MatrixGame.TileType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7='Color'
			{
				newLeafNode(otherlv_7, grammarAccess.getTileAccess().getColorKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTileAccess().getColorEStringParserRuleCall_7_1_0());
					}
					lv_Color_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTileRule());
						}
						set(
							$current,
							"Color",
							lv_Color_8_0,
							"tdt4250.matrixgame.MatrixGame.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_9='xCoordinate'
		{
			newLeafNode(otherlv_9, grammarAccess.getTileAccess().getXCoordinateKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTileAccess().getXCoordinateEIntParserRuleCall_9_0());
				}
				lv_xCoordinate_10_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTileRule());
					}
					set(
						$current,
						"xCoordinate",
						lv_xCoordinate_10_0,
						"tdt4250.matrixgame.MatrixGame.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='yCoordinate'
		{
			newLeafNode(otherlv_11, grammarAccess.getTileAccess().getYCoordinateKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTileAccess().getYCoordinateEIntParserRuleCall_11_0());
				}
				lv_yCoordinate_12_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTileRule());
					}
					set(
						$current,
						"yCoordinate",
						lv_yCoordinate_12_0,
						"tdt4250.matrixgame.MatrixGame.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getTileAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Rule TileType
ruleTileType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='BASIC'
			{
				$current = grammarAccess.getTileTypeAccess().getBASICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTileTypeAccess().getBASICEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='REWARD'
			{
				$current = grammarAccess.getTileTypeAccess().getREWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTileTypeAccess().getREWARDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='OBSTACLE'
			{
				$current = grammarAccess.getTileTypeAccess().getOBSTACLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTileTypeAccess().getOBSTACLEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='INTERACTIVE'
			{
				$current = grammarAccess.getTileTypeAccess().getINTERACTIVEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTileTypeAccess().getINTERACTIVEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='CRASH'
			{
				$current = grammarAccess.getTileTypeAccess().getCRASHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTileTypeAccess().getCRASHEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule ActionType
ruleActionType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NONE'
			{
				$current = grammarAccess.getActionTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActionTypeAccess().getNONEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='REVEAL'
			{
				$current = grammarAccess.getActionTypeAccess().getREVEALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActionTypeAccess().getREVEALEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='MOVE'
			{
				$current = grammarAccess.getActionTypeAccess().getMOVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActionTypeAccess().getMOVEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='TOGGLE'
			{
				$current = grammarAccess.getActionTypeAccess().getTOGGLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getActionTypeAccess().getTOGGLEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='ATTACK'
			{
				$current = grammarAccess.getActionTypeAccess().getATTACKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getActionTypeAccess().getATTACKEnumLiteralDeclaration_4());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
