package fi.fullerine.kingofthestreets.web;

import fi.fullerine.kingofthestreets.domain.commutereval.Evaluation;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/evaluations")
@Controller
@RooWebScaffold(path = "evaluations", formBackingObject = Evaluation.class)
public class EvaluationController {

}
