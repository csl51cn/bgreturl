package org.starlightfinancial.bgreturl.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sili.chen on 2017/7/26
 */
public interface MortgageDeductionRepository extends JpaRepository<MortgageDeduction, Integer> {
    MortgageDeduction findByOrdId(String ordId);
}
