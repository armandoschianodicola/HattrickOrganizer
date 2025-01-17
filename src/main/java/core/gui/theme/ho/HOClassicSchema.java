package core.gui.theme.ho;

import core.gui.theme.*;
import core.util.HOLogger;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class HOClassicSchema extends Schema implements HOIconName, HOColorName, HOBooleanName {

	public HOClassicSchema() {
		initialize();
	}

	private void initialize() {
		setName("Classic");
		initCachedColors();
		initColors();
		initBooleans();
		initIcons();
	}

	private void initIcons() {
		put(MATCHICONS[0], "gui/bilder/match_types/matchtype-League.png");
		put(MATCHICONS[1], "gui/bilder/match_types/matchtype-qualification.png");
		put(MATCHICONS[2], "gui/bilder/match_types/matchtype-Friendly.png");
		put(MATCHICONS[3], "gui/bilder/match_types/matchtype-matchCupA.png");  //national
		put(MATCHICONS[4], "gui/bilder/match_types/matchtype-matchCupB1.png");  //emerald
		put(MATCHICONS[5], "gui/bilder/match_types/matchtype-matchCupB2.png");  //ruby
		put(MATCHICONS[6], "gui/bilder/match_types/matchtype-matchCupB3.png");  //sapphir
		put(MATCHICONS[7], "gui/bilder/match_types/matchtype-tournament-ladder.png");
		put(MATCHICONS[8], "gui/bilder/match_types/matchtype-tournament.png");
		put(MATCHICONS[9], "gui/bilder/match_types/matchtype-single-match.png");
		put(MATCHICONS[10], "gui/bilder/match_types/matchtype-matchMasters.png");
		put(MATCHICONS[11], "gui/bilder/default_match_icon.gif");
		put(MATCHICONS[12], "gui/bilder/match_types/matchtype-matchCupC.png");  //consolante
		put(MATCHICONS[13], "gui/bilder/match_types/matchtype-battle.png");

		put(SMILEYS[1], "gui/bilder/smilies/smiley-coach.svg");
		put(SMILEYS[2], "gui/bilder/smilies/smiley-sale.svg");
		put(SMILEYS[3], "gui/bilder/smilies/smiley-happy.svg");
		put(SMILEYS[4], "gui/bilder/smilies/smiley-sad.svg");
		put(SMILEYS[5], "gui/bilder/smilies/smiley-neutral.svg");

		put(GROUP_TEAM, "gui/bilder/smilies/Group-Team.svg");
		put(GROUP_TEAM_CLEAN, "gui/bilder/group-team-clean.svg");
		put(GREYED_OUT, "gui/bilder/smilies/Group-Team-Greyed.svg");

		put(WEATHER[0], "gui/bilder/match_events/weather0.png");
		put(WEATHER[1], "gui/bilder/match_events/weather1.png");
		put(WEATHER[2], "gui/bilder/match_events/weather2.png");
		put(WEATHER[3], "gui/bilder/match_events/weather3.png");
		put(WEATHER[4], "gui/bilder/weather-too-early.svg");
		put(WEATHER_EFFECT_GOOD, "gui/bilder/Fugue/tick-small.png");
		put(WEATHER_EFFECT_BAD, "gui/bilder/Fugue/cross-small.png");
		put(WEATHER_RAIN_POS, "gui/bilder/Fugue/weather-rain-pos-se.png");
		put(WEATHER_RAIN_NEG, "gui/bilder/Fugue/weather-rain-neg-se.png");
		put(WEATHER_SUN_POS, "gui/bilder/Fugue/weather-sun-pos-se.png");
		put(WEATHER_SUN_NEG, "gui/bilder/Fugue/weather-sun-neg-se.png");

		put(SPECIALTIES[1], "gui/bilder/player overview/player_specialty_1.svg");
		put(SPECIALTIES[2], "gui/bilder/player overview/player_specialty_2.svg");
		put(SPECIALTIES[3], "gui/bilder/player overview/player_specialty_3.svg");
		put(SPECIALTIES[4], "gui/bilder/player overview/player_specialty_4.svg");
		put(SPECIALTIES[5], "gui/bilder/player overview/player_specialty_5.svg");
		put(SPECIALTIES[6], "gui/bilder/player overview/player_specialty_6.svg");
		put(SPECIALTIES[8], "gui/bilder/player overview/player_specialty_8.svg");

		put(TOOTHEDWHEEL, "gui/bilder/automatic.png");
		put(HAND, "gui/bilder/manual.png");

		put(NO_MATCH, "gui/bilder/NoMatch.gif");

		put(DISK, "gui/bilder/disk.png");
		put(LOCKED, "gui/bilder/Locked.gif");
		put(EMPTY, "gui/bilder/empty.gif");
		put(INFO, "gui/bilder/info.gif");
		put(UPLOAD, "gui/bilder/upload.svg");
		put(WARNING_ICON, "gui/bilder/warning.svg");
		put(GOTOANALYSETOP, "gui/bilder/gotoAnalyseTop.svg");
		put(GOTOANALYSEBOTTOM, "gui/bilder/gotoAnalyseBottom.svg");
		put(OFFSET, "gui/bilder/offset.svg");
		put(GOTOSTATISTIK, "gui/bilder/gotoStatistik.svg");
		put(NO_CLUB_LOGO, "gui/bilder/no-logo.png");

		put(RELOAD, "gui/bilder/Reload.png");
		put(SIMULATEMATCH, "gui/bilder/simulate_match.png");
		put(GETLINEUP, "gui/bilder/AufstellungUebernehmen.png");
		put(SWAP, "gui/bilder/swap.svg");
		put(RESET, "gui/bilder/reset.svg");
		put(TURN, "gui/bilder/rotate.svg");

		put(LOGO16_STABLE, "gui/bilder/Logo-16px_stable.png");
		put(LOGO16_BETA, "gui/bilder/Logo-16px_beta.png");
		put(LOGO16_DEV, "gui/bilder/Logo-16px_dev.png");
		put(TRICKOT, "gui/bilder/jerseys.svg");

		// Player Overview
		put(YELLOWCARD_SMALL, "gui/bilder/player overview/yellow-card(yellow)-small.png");
		put(TWOYELLOWCARDS_SMALL, "gui/bilder/player overview/yellow-card-x2(yellow)-small.png");
		put(REDCARD_SMALL, "gui/bilder/player overview/red-card(red)-small.png");
		put(TRANSFERLISTED_TINY, "gui/bilder/player overview/transferlisted.svg");
		put(SUSPENDED_TINY, "img/icons/made/red-card(red).svg");
		put(TWOYELLOW_TINY, "img/icons/made/yellow-card-x2(yellow).svg");
		put(ONEYELLOW_TINY, "img/icons/made/yellow-card(yellow).svg");

		// Highlights

		put(YELLOWCARD, "img/icons/made/yellow-card(yellow).svg");
		put(REDCARD, "gui/bilder//red-card.svg");
		put(FORMATION, "gui/bilder/mo-select.svg");
		put(REPLACEMENT, "gui/bilder/exchange.svg");
		put(ROTATE, "gui/bilder/rotate.svg");
		put(GOAL, "gui/bilder/goal.svg");
		put(MISS, "gui/bilder/miss.svg");
		put(PENALTY, "gui/bilder/penalty.svg");
		put(EXPERIENCE, "gui/bilder/experience.svg");
		put(WHISTLE, "gui/bilder/whistle.svg");
		put(CORNER, "gui/bilder/corner.svg");
		put(TIRED, "gui/bilder/tired.svg");
		put(WINGER, "gui/bilder/winger.svg");
		put(GOAL_MID, "gui/bilder/goal_C.svg");
		put(GOAL_LEFT, "gui/bilder/goal_L.svg");
		put(GOAL_RIGHT, "gui/bilder/goal_R.svg");
		put(NO_GOAL_MID, "gui/bilder/miss_C.svg");
		put(NO_GOAL_LEFT, "gui/bilder/miss_L.svg");
		put(NO_GOAL_RIGHT, "gui/bilder/miss_R.svg");
		put(TACTIC_PRESSING, "gui/bilder/pressing.svg");
		put(TACTIC_COUNTER_ATTACKING, "gui/bilder/counter_attack.svg");
		put(TACTIC_AIM, "gui/bilder/aim.svg");
		put(TACTIC_AOW, "gui/bilder/aow.svg");
		put(TACTIC_PLAY_CREATIVELY, "gui/bilder/creative.svg");
		put(TACTIC_LONG_SHOTS, "gui/bilder/longshot.svg");

		put(PIECES, "gui/bilder/set_pieces.svg");
		put(CONFUSION, "gui/bilder/confusion.svg");
		put(REORGANIZE, "gui/bilder/reorganize.svg");
		put(CAPTAIN, "gui/bilder/captain.svg");
		put(ME_YELLOW_THEN_RED, "gui/bilder/yellow-red-card.svg");
		put(ME_SWAP, "gui/bilder/swap.svg");
		put(ME_MAN_MARKING, "gui/bilder/manmark.svg");

		put(HOMEGROWN, "gui/bilder/motherclub.png");
		put(IMAGEPANEL_BACKGROUND, "gui/bilder/Background.jpg");
		put(GRASSPANEL_BACKGROUND, "gui/bilder/Rasen_mit_Streifen.jpg");
		put(RATINGCOMPARISON_BACKGROUND, "gui/bilder/field_cut.png");


		put(REMOVE, "gui/bilder/remove.png");
		put(BALL, "gui/bilder/Ball.png");

		put(TABBEDPANE_CLOSE, "gui/bilder/closetab.png");

		put(ARROW_LEFT1, "gui/bilder/arrows/leftArrow1.gif");
		put(ARROW_LEFT2, "gui/bilder/arrows/leftArrow2.gif");
		put(ARROW_LEFT_3, "gui/bilder/arrow_left3.svg");
		put(ARROW_RIGHT1, "gui/bilder/arrows/rightArrow1.gif");
		put(ARROW_RIGHT2, "gui/bilder/arrows/rightArrow2.gif");
		put(ARROW_RIGHT3, "gui/bilder/arrow_right3.svg");

		put(ARROW_UP, "gui/bilder/arrows/ArrowUp.gif");
		put(ARROW_DOWN, "gui/bilder/arrows/ArrowDown.gif");

		put(ORDERS_SENT, "gui/bilder/orders_sent.svg");
		put(ORDERS_MISSING, "gui/bilder/orders_missing.svg");

		put(EXCLAMATION, "gui/bilder/Fugue/exclamation.png");
		put(EXCLAMATION_RED, "gui/bilder/Fugue/exclamation-red.png");
		put(CONTROL_DOUBLE_090, "gui/bilder/Fugue/control-double-090.png");
		put(CONTROL_DOUBLE_270, "gui/bilder/Fugue/control-double-270.png");
		put(PLAYS_AT_BEGINNING, "gui/bilder/Fugue/status.png");
		put(IS_RESERVE, "gui/bilder/Fugue/status-away.png");
		put(NOT_IN_LINEUP, "gui/bilder/Fugue/status-offline.png");
		put(MOVE_UP, "gui/bilder/Fugue/arrow-090-medium.png");
		put(MOVE_DOWN, "gui/bilder/Fugue/arrow-270-medium.png");
		put(MOVE_LEFT, "gui/bilder/Fugue/arrow-180-medium.png");
		put(MOVE_RIGHT, "gui/bilder/Fugue/arrow-000-medium.png");
		put(ARROW_CIRCLE, "gui/bilder/Fugue/arrow-circle-double-135.png");
		put(ARROW_MOVE, "gui/bilder/Fugue/arrow-move-recoloured.png");
		put(SUBSTITUTION, "gui/bilder/Fugue/arrow-circle-double-135-recoloured.png");
		// TODO: create new icon for man marking
		put(MAN_MARKING, "img/icons/official/HTwebsite/svg/manmark.svg");
		put(IFA_VISITED, "gui/bilder/Fugue/status.png");
		put(INFORMATION, "gui/bilder/Fugue/information-white.png");
		put(CHPP, "gui/bilder/chpp.png");
		put(CHPP_WHITE_BG, "gui/bilder/chpp_white_bg.png");
		
		put(HOME, "gui/bilder/home.png");
		put(AWAY, "gui/bilder/away.png");

		// Train bar
		put(TRAINING_BAR, "gui/bilder/trainpreview/training_bar.svg");
		put(TRAINING_ICON, "gui/bilder/training.svg");


		put(GREEN_WHITE_CLOCK, "gui/bilder/green-white-clock.png");
		put(WHITE_GREEN_CLOCK, "gui/bilder/white-green-clock.png");
		put(RED_WHITE_CLOCK, "gui/bilder/red-white-clock.png");
		put(WHITE_RED_CLOCK, "gui/bilder/white-red-clock.png");

		put(RATING_GRAPH, "gui/bilder/rating-graph.png");

		put(SPINNER, "gui/bilder/spinner.gif");

		put(UNKOWN, "gui/bilder/unknown.png");

		// Empty icon to avoid exceptions
		put(EMPTY_SVG, "gui/bilder/empty.svg");
	}

	private void initBooleans() {
		put(IMAGEPANEL_BG_PAINTED, Boolean.FALSE);

	}

	private void initCachedColors() {
		// don´t use UIManager keys !!
		put("black", Color.BLACK);
		put("white", Color.WHITE);
		put("gray", Color.GRAY);
		put("green", Color.GREEN);
		put("yellow", Color.YELLOW);
		put("red", Color.RED);
		put("blue", Color.BLUE);
		put("orange", Color.ORANGE);
		put("dark_gray", Color.DARK_GRAY);
		put("light_gray", Color.LIGHT_GRAY);
		put("lightGreen", new Color(220, 255, 220));
		put("lightYellow", new Color(255, 255, 200));
		put("ho_gray1", new Color(230, 230, 230));
		put("forest_green", new Color(34,139,34));
	}

	/**
	 * key-Syntax => javaComponent.[hoComponent].property || name
	 *
	 */
	private void initColors() {
		// basic color;
		put(RED, "red");
		put(BLUE, "blue");
		put(GREEN, "green");
		put(YELLOW, "yellow");
		put(ORANGE, "orange");


		put(URL_PANEL_BG, new Color(9, 9, 167));

		put(PANEL_BG, new Color(214,217,223));
		put(PANEL_BORDER, "dark_gray");
		put(PLAYER_POSITION_PANEL_BORDER, "light_gray");
		put(BUTTON_BG, "white");
		put(BUTTON_ASSIST_CANCEL_BG,  new Color(226, 31, 31));
		put(BUTTON_ASSIST_OK_BG,  new Color(34, 225, 36));
		put(LABEL_ERROR_FG, Color.RED);
		put(LABEL_SUCCESS_FG, "green");
		put(LABEL_ONGREEN_FG, "white");
		put(LABEL_FG, "black");
		put(LIST_FG, "black");
		put(LIST_CURRENT_FG, new Color(0, 0, 150));
		put(TABLE_SELECTION_BG, new Color(235, 235, 235));
		put(TABLE_SELECTION_FG, LABEL_FG);
		put(LIST_SELECTION_BG, new Color(220, 220, 255));

		put(MATCHHIGHLIGHT_FAILED_FG, "gray");

		// player
		put(PLAYER_SKILL_SPECIAL_BG, "lightGreen");
		put(PLAYER_SKILL_BG, "lightYellow");
		put(TABLEENTRY_BG, "white");
		put(BACKGROUND_CONTAINER, Color.WHITE);
		put(TABLEENTRY_FG, "black");
		put(PLAYER_POS_BG, new Color(220, 220, 255));
		put(PLAYER_SUBPOS_BG, new Color(235, 235, 255));
		put(PLAYER_OLD_FG, "gray");
		put(TABLEENTRY_IMPROVEMENT_FG, new Color(34, 139, 34));
		put(TABLEENTRY_DECLINE_FG, new Color(235, 0, 0));
		put(SKILLENTRY2_BG, "gray");

		// league Table
		put(HOME_TEAM_FG, new Color(179,60,180));
		put(HOColorName.SELECTED_TEAM_FG, new Color(36,90,235));
		put(LEAGUE_TITLE_BG, "ho_gray1");
		put(LEAGUE_PROMOTED_BG, "lightGreen");
		put(LEAGUE_RELEGATION_BG, "lightYellow");
		put(LEAGUE_DEMOTED_BG, new Color(255, 220, 220));
		put(LEAGUE_BG, "white");
		put(LEAGUE_FG, "black");

		// league history panel
		put(LEAGUEHISTORY_LINE1_FG, Color.GREEN);
		put(LEAGUEHISTORY_LINE2_FG, Color.CYAN);
		put(LEAGUEHISTORY_LINE3_FG, Color.GRAY);
		put(LEAGUEHISTORY_LINE4_FG, "black");
		put(LEAGUEHISTORY_LINE5_FG, Color.ORANGE);
		put(LEAGUEHISTORY_LINE6_FG, Color.PINK);
		put(LEAGUEHISTORY_LINE7_FG, Color.RED);
		put(LEAGUEHISTORY_LINE8_FG, Color.MAGENTA);
		put(LEAGUEHISTORY_CROSS_FG, "light_gray");
		put(LEAGUEHISTORY_GRID_FG, "light_gray");

		// lineup
		put(SEL_OVERLAY_SELECTION_BG, new Color(10, 255, 10, 40));
		put(SEL_OVERLAY_BG, new Color(255, 10, 10, 40));
		put(LINEUP_POS_MIN_BORDER, "light_gray");
		put(SUBST_CHANGED_VALUE_BG, "lightGreen");
		put(SWAP_COLOR, "forest_green");
		put(RESET_COLOR, Color.RED);
		put(SWAP_COLOR_PRESSED, Color.RED);
		put(LINEUP_RATING_BORDER, Color.BLACK);
		put(LINEUP_PARTIAL_TRAINING, new Color(34, 255, 255));
		put(LINEUP_FULL_TRAINING, new Color(0, 0, 255));
		put(LINEUP_PLAYER_SELECTED, Color.LIGHT_GRAY);
		put(LINEUP_PLAYER_SUB, new Color(220, 220, 220));
		put(LINEUP_BG_BUTTONS, new Color(144, 238, 144));
		put(WARNING_ICON_CB_COLOR, Color.RED);
		put(HOColorName.RATING_BORDER_BELOW_LIMIT, new Color(255, 0, 0));
		put(HOColorName.RATING_BORDER_ABOVE_LIMIT, new Color(0, 0, 225));
		put(HOColorName.START_ASSISTANT, new Color(34, 139, 34));
		put(HOColorName.CLEAR_LINEUP, new Color(255, 0, 0));
		put(HOColorName.LINEUP_COLOR, new Color(0, 0, 139));
		put(HOColorName.LINEUP_HIGHLIGHT_FG, new Color(0, 0, 139));
		put(HOColorName.ORDERS_LINEUP, new Color(190, 190, 190));
		put(HOColorName.ORDERS_TICK, new Color(45, 75, 45));
		put(HOColorName.ORDERS_PEN, new Color(139, 0, 0));

		//matches module
		put(HOColorName.HOME_ACTION, new Color(110, 205, 234));
		put(HOColorName.GUEST_ACTION, new Color(209, 94, 94));
		put(HOColorName.NEUTRAL_ACTION, new Color(166, 166, 166));
		put(HOColorName.BORDER_RATING_BAR, Color.BLACK);


		// shirts
		put(SHIRT_KEEPER, "black");
		put(SHIRT_CENTRALDEFENCE, new Color(0, 0, 220));
		put(SHIRT_WINGBACK, new Color(0, 220, 0));
		put(SHIRT_MIDFIELD, new Color(220, 220, 0));
		put(SHIRT_WING, new Color(220, 140, 0));
		put(SHIRT_FORWARD, new Color(220, 0, 0));
		put(SHIRT_SUBKEEPER, new Color(200, 200, 200));
		put(SHIRT_SUBDEFENCE, new Color(200, 200, 255));
		put(SHIRT_SUBMIDFIELD, new Color(255, 255, 180));
		put(SHIRT_SUBWING, new Color(255, 225, 180));
		put(SHIRT_SUBFORWARD, new Color(255, 200, 200));
		put(SHIRT, "ho_gray1");

		// Smileys
		put(SMILEYS_COLOR, "black");

		// Players specialty Colors
		put(PLAYER_SPECIALTY_COLOR, "black");
		put(PLAYER_SPECIALTY_NEGATIVE_COLOR, "red");


		put(PLAYER_STAR_COLOR, new Color(255,215,0));
		
		put(STAT_CASH, "black");
		put(STAT_WINLOST, Color.GRAY);
		put(STAT_INCOMESUM, Color.GREEN);
		put(STAT_COSTSUM, Color.RED);
		put(STAT_INCOMESPECTATORS, new Color(0, 180, 0));
		put(STAT_INCOMESPONSORS, new Color(0, 120, 60));
		put(STAT_INCOMEFINANCIAL, new Color(0, 60, 120));
		put(STAT_INCOMETEMPORARY, new Color(0, 0, 180));
		put(STAT_COSTARENA, new Color(180, 0, 0));
		put(STAT_COSTSPLAYERS, new Color(180, 36, 0));
		put(STAT_COSTFINANCIAL, new Color(180, 72, 0));
		put(STAT_COSTTEMPORARY, new Color(180, 108, 0));
		put(STAT_COSTSTAFF, new Color(180, 144, 0));
		put(STAT_COSTSYOUTH, new Color(180, 180, 0));
		put(STAT_FANS, Color.CYAN);
		put(STAT_MARKETVALUE, Color.BLUE);
		put(STAT_WAGE, new Color(150, 20, 20));
		put(STAT_RATING2, "black");
		put(STAT_TOTAL, Color.GRAY);
		put(STAT_MOOD, Color.PINK);
		put(STAT_CONFIDENCE, Color.CYAN);
		put(STAT_HATSTATS, Color.YELLOW);
		put(STAT_LODDAR, new Color(150, 20, 20));
		put(STAT_PANEL_BG, Color.WHITE);
		put(STAT_PANEL_FG, Color.DARK_GRAY);

		// matchtypes
		put(MATCHTYPE_BG, "white");
		put(MATCHTYPE_LEAGUE_BG, "lightYellow");
		put(MATCHTYPE_QUALIFIKATION_BG, new Color(255, 200, 200));
		put(MATCHTYPE_CUP_BG, new Color(200, 255, 200));
		put(MATCHTYPE_FRIENDLY_BG, Color.WHITE);
		put(MATCHTYPE_INT_BG, "light_gray");
		put(MATCHTYPE_MASTERS_BG, new Color(255, 215, 120));
		put(MATCHTYPE_INTFRIENDLY_BG, "white");
		put(MATCHTYPE_NATIONAL_BG, new Color(240, 220, 255));
		put(MATCHTYPE_TOURNAMENT_GROUP_BG, new Color(218, 237, 247));
		put(MATCHTYPE_TOURNAMENT_FINALS_BG, new Color(218, 237, 247));
		put(MATCHTYPE_DIVISIONBATTLE_BG, new Color(200, 210, 247));

		// 1.431
		put(MATCHDETAILS_PROGRESSBAR_GREEN, new Color(0, 124, 0));
		put(MATCHDETAILS_PROGRESSBAR_RED, new Color(124, 0, 0));

		// Transfer module
		put(TRANSFER_IN_COLOR, "green");
		put(TRANSFER_OUT_COLOR, "default.red");

		// Team Analyzer
		put(TA_TEAM_LEAGUE_NEXT, Color.RED);
		put(TA_TEAM_CUP_NEXT, Color.GREEN);
		put(TA_TEAM_TOURNAMENT_NEXT, new Color(0, 51, 255)); // Darkish blue
		put(TA_TEAM_TOURNAMENT, new Color(0, 179, 255)); // Lightish blue

		// Colours for form streak in league details
		put(FORM_STREAK_WIN, new Color(73, 146, 45));
		put(FORM_STREAK_DRAW, new Color(111, 111, 111));
		put(FORM_STREAK_DEFEAT, new Color(224, 51, 51));
		put(FORM_STREAK_UNKNOWN, new Color(170, 170, 170));

		// Colours for alternating rows in table
		put(TABLE_LEAGUE_EVEN, Color.WHITE);
		put(TABLE_LEAGUE_ODD, new Color(240, 240, 240));

		// Training
		put(TRAINING_BIRTHDAY_BG, new Color(255, 240, 175));
		put(TRAINING_FULL_BG,"lightGreen");
		put(TRAINING_PARTIAL_BG,"lightYellow");
		put(TRAINING_OSMOSIS_BG, Color.LIGHT_GRAY);
		put(HOColorName.TRAINING_ICON_COLOR_1, new Color(0, 0, 0));
		put(HOColorName.TRAINING_ICON_COLOR_2, new Color(255, 255, 255));

		// Training bars
		put(FULL_TRAINING_DONE, new Color(37, 110, 9));
		put(PARTIAL_TRAINING_DONE, new Color(73, 208, 21));
		put(FULL_STAMINA_DONE, new Color(69, 127, 217));
		put(FULL_TRAINING_PLANNED, new Color(56, 56, 56));
		put(PARTIAL_TRAINING_PLANNED, new Color(184, 184, 184, 184));
		put(STAMINA_PLANNED, new Color(104, 242, 255));

		// TS Forecast
		put(TSFORECAST_ALT_COLOR, Color.BLUE);

		// HRF Explorer
		put(HOColorName.HRF_GREEN_BG, new Color(220,255,220));
		put(HOColorName.HRF_LIGHTBLUE_BG, new Color(235,235,255));
		put(HOColorName.HRF_DARKBLUE_BG, new Color(220,220,255));
		put(HOColorName.HRF_RED_BG, new Color(255,200,200));

		// Player State colours
		put(HOColorName.FG_STANDARD, Color.BLACK);
		put(HOColorName.FG_TRANSFERLISTED, new Color(0, 180, 0));
		put(HOColorName.FG_BRUISED, new Color(100, 0, 0));
		put(HOColorName.FG_INJURED, new Color(200, 0, 0));
		put(HOColorName.FG_TWO_YELLOW_CARDS, new Color(100, 100, 0));
		put(HOColorName.FG_RED_CARD, new Color(200, 20, 20));
		put(HOColorName.INJURY, new Color(255, 0, 0));
		put(HOColorName.PLASTER, new Color(247, 195, 176));

		//players details
		put(HOColorName.PLAYER_DETAILS_BAR_BORDER_COLOR, Color.BLACK);
		put(HOColorName.PLAYER_DETAILS_BAR_FILL_GREEN, Color.GREEN);
		put(HOColorName.PLAYER_DETAILS_STARS_FILL, Color.YELLOW);

		// Promotion
		put(HOColorName.FG_PROMOTION_INFO, new Color(238, 39, 39, 255));

		// palettes
		put(PALETTE13[0],  new Color(255, 204, 0));
		put(PALETTE13[1],  new Color(23, 111, 36));
		put(PALETTE13[2],  new Color(255, 59, 48));
		put(PALETTE13[3],  new Color(49, 220, 209));
		put(PALETTE13[4],  new Color(162, 132, 94));
		put(PALETTE13[5],  new Color(147, 250, 45));
		put(PALETTE13[6],  new Color(0, 122, 255));
		put(PALETTE13[7],  new Color(255, 149, 0));
		put(PALETTE13[8],  new Color(88, 86, 214));
		put(PALETTE13[9],  new Color(142, 142, 147));
		put(PALETTE13[10],  new Color(175, 82, 222));
		put(PALETTE13[11],  new Color(40, 205, 65));
		put(PALETTE13[12],  new Color(90, 200, 250));

		// League Details
		put(HOColorName.SHOW_MATCH, new Color(23, 111, 36));
		put(HOColorName.DOWNLOAD_MATCH, new Color(238, 39, 39, 255));

		put(HOColorName.LINK_LABEL_FG, new Color(6, 69, 173));

	}

	public Color getDefaultColor(String key) {
		return key.contains("fg") ? Color.BLACK : Color.WHITE;
	}

	@Override
	public ImageIcon loadImageIcon(String path) {
		ImageIcon image;

		image = (ImageIcon) cache.get(path);
		if (image == null) {
			try {
				URL resource = HOClassicSchema.class.getClassLoader().getResource(path);
				if (resource == null) {
					try {
						// This is a shameless hack to get resources to load from IntelliJ.
						resource = new File("./src/main/resources" + path).toURI().toURL();
						image = new ImageIcon(resource);
						cache.put(path, image);
						return image;
					}
					catch (MalformedURLException e) {
						// At this point this is hopeless.
						e.printStackTrace();
					}
					HOLogger.instance().log(Schema.class, path + " Not Found!!!");
					return loadImageIcon("gui/bilder/Unknownflag.png");
				}

				image = new ImageIcon(resource);
				cache.put(path, image);

				return image;
			} catch (Throwable e) {
				HOLogger.instance().log(Schema.class, e);
			}
		}
		return image;
	}
}
