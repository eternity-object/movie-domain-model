package org.eternity.movie;

import org.eternity.generic.Money;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getFixedFee().times(percent);
    }
}
