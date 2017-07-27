package org.starlightfinancial.bgreturl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.starlightfinancial.bgreturl.domain.MortgageDeduction;
import org.starlightfinancial.bgreturl.domain.MortgageDeductionRepository;

import javax.transaction.Transactional;


/**
 * Created by sili.chen on 2017/7/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@SpringBootTest
@Rollback(value = false)
public class ApplicationTest {
    @Autowired
    private MortgageDeductionRepository mortgageDeductionRepository;

    @Before
    public void setUp() {
    }

    @Test
    public void test() throws Exception {

        MortgageDeduction mortgageDeduction = mortgageDeductionRepository.findByOrdId("789");
        System.out.println(mortgageDeduction.getContractNo());
    }
}
