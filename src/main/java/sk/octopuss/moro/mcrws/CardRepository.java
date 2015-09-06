package sk.octopuss.moro.mcrws;

import org.springframework.stereotype.Component;
import sk.octopuss.moro.mcrws.ws.*;

/**
 * Created by ivan.dolezal.ext on 6.9.2015.
 */
@Component
public class CardRepository {

    public CardInfo getCardInfo(Long pan){
        CardInfo cardInfo = new CardInfo();
        UserAccount userAccount = new UserAccount();
        userAccount.setId(1l);
        userAccount.setUsername("aa@bc.cc");
        userAccount.setCurrency(Currency.CZK);
        userAccount.setRedemptionType(RedemptionType.NONE);
        cardInfo.setUserAccount(userAccount);
        cardInfo.setPanToken("aaaa");
        cardInfo.setPartnerBankCard(true);
        cardInfo.setCardStatus(CardState.ACTIVE);
        cardInfo.setCardVerificationStatus(CardVerificationState.VERIFIED);

        return cardInfo;

    }
}
