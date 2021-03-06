package com.rstyle.maxmoto1702.springidol.poems;

import com.rstyle.maxmoto1702.springidol.Poem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class Sonnet29 implements Poem {

    private static final Logger LOG = LoggerFactory.getLogger(Sonnet29.class);
    private static String[] LINES = {
            "Когда в раздоре с миром и судьбой,",
            "Припомнив годы, полные невзгод,",
            "Тревожу я бесплодною мольбой",
            "Глухой и равнодушный небосвод",
            "И, жалуясь на горестный удел,",
            "Готов меняться жребием своим",
            "С тем, кто в искусстве больше преуспел,",
            "Богат надеждой и людьми любим, -",
            "Тогда, внезапно вспомнив о тебе,",
            "Я малодушье жалкое кляну,",
            "И жаворонком, вопреки судьбе,",
            "Моя душа несется в вышину.",
            "С твоей любовью, с памятью о ней",
            "Всех королей на свете я сильней."};

    public Sonnet29() {
    }

    @Override
    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            LOG.info(LINES[i]);
        }
    }
}
