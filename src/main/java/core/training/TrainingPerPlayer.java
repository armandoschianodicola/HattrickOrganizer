package core.training;

import core.constants.player.PlayerSkill;
import core.model.player.Player;
import core.util.HODateTime;

/**
 * Holds and calculates how much skill training a player received
 */
public class TrainingPerPlayer  {
    private Player _Player;
    private TrainingPoints _TrainingPair = null;
    private TrainingPerWeek _TrainingWeek;
	private double experienceSub=0;

	//~ Constructors -------------------------------------------------------------------------------

	/**
     * Creates a new TrainingPerPlayer object initialized with a specific player
     */
    public TrainingPerPlayer(Player oPlayer) {
    	_Player = oPlayer; 
    }

    //~ Methods ------------------------------------------------------------------------------------

    
    /**
     * Setter for property player.
     *
     * @param player New value of property player.
     */
    public final void setPlayer(Player player) {
        this._Player = player;
    }

    /**
     * Getter for property player.
     *
     * @return Value of property player.
     */
    public final Player getPlayer() {
        return this._Player;
    }

    public void setTrainingPair(TrainingPoints trp) {
		_TrainingPair = trp;
	}

    public TrainingPoints getTrainingPair() {
    	return _TrainingPair;
    }

    /**
     * get the training point for this instance
     * @return	training point
     */
	public TrainingPerWeek getTrainingWeek() {
		return _TrainingWeek;
	}

	/**
	 * set the training point for this instance and
	 * calculate the sub skills for the player using 
	 * the training week from this training point
	 *  
	 * @param trainingWeek training week info
	 */
	public void setTrainingWeek(TrainingPerWeek trainingWeek) {
		this._TrainingWeek = trainingWeek;
	}

    public void addExperience(double inc) {
		this.experienceSub += inc;
    }

	public double getExperienceSub() {
		return experienceSub;
	}

    public double calcSubskillIncrement(PlayerSkill skill, double skillValueBeforeTraining, HODateTime date) {

		int skillValue = (int) skillValueBeforeTraining;
		double ret = 0;

		var wt = WeeklyTrainingType.instance(this._TrainingWeek.getTrainingType());
		boolean isTrainedSkill = wt != null && wt.isTraining(skill);
		if (isTrainedSkill) {
			ret += wt.calculateSkillIncreaseOfTrainingWeek( skillValue, this);
		}
		/* Time to perform skill drop */
		if (SkillDrops.instance().isActive()) {
			ret -= SkillDrops.instance().getSkillDropAtDate(skillValue, this._Player.getAge(), skill, date, isTrainedSkill);
		}


		if (ret > 1) ret = 1; // limit 1
		return ret;
	}

	/**
	 * Calculate player's age in years at the given training date
	 * @return int age of the player in hattrick-years
	 */
	public int getPlayerAgeAtTrainingDate() {
		return (int) this.getPlayer().getDoubleAgeFromDate(this._TrainingWeek.getTrainingDate());
	}
}
