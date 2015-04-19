package com.rstyle.maxmoto1702.knights;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}