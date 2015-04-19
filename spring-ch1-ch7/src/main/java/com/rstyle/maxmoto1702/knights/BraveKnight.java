package com.rstyle.maxmoto1702.knights;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest; // Внедрение сценария подвига
    }

    @Override
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
