package sk.octopuss.moro.mcrws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import sk.octopuss.moro.mcrws.ws.GetCardInfoRequest;
import sk.octopuss.moro.mcrws.ws.GetCardInfoResponse;

import java.util.logging.Logger;

/**
 * Created by ivan.dolezal.ext on 6.9.2015.
 */
@Endpoint
public class McrEndpoint {

    Logger logger = Logger.getLogger(getClass().toString());
    private static final String NAMESPACE_URI = "http://octopuss.sk/moro/mcrws/";

    private CardRepository cardRepository;

    @Autowired
    public McrEndpoint(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCardInfoRequest")
    @ResponsePayload
    public GetCardInfoResponse getCardInfo(@RequestPayload GetCardInfoRequest request) {

        logger.info("Searching "+request.getPan());
        GetCardInfoResponse response = new GetCardInfoResponse();
        response.setCardInfo(cardRepository.getCardInfo(request.getPan()));

        return response;
    }
}
