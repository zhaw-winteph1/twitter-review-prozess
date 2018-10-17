/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.gpi.twitterreview.delegates;

import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Implementation des Service Tasks 'Tweet senden'
 * 
 * @author zhaw-winteph1 <winteph1@students.zhaw.ch>
 */
@Named("sendTweetAdapter")
public class SendTweetDelegate implements JavaDelegate {

    /**
     * 1. Die Prozessvariable tweetContent auslesen
     * 2. Dieser Text wird in der Konsole ausgegeben
     * 
     * @param execution            Objekt, welches die Verknüpfung zur Process Engine
     * und aktueller Execution enthält
     * @throws Exception
     */
    @Override
    public void execute(DelegateExecution execution) throws Exception {
       String tweetContent = (String) execution.getVariable("tweetContent");
       System.out.println("!!!!!!!!!!!!! Folgender Tweet wird veröffentlicht: "
                + tweetContent);
        }
    
}
