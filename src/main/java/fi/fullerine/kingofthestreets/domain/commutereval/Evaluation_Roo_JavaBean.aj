// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package fi.fullerine.kingofthestreets.domain.commutereval;

import fi.fullerine.kingofthestreets.domain.commutereval.Evaluation;
import fi.fullerine.kingofthestreets.domain.commutereval.GenderEnum;
import fi.fullerine.kingofthestreets.domain.commutereval.HelmetUsageEnum;
import fi.fullerine.kingofthestreets.domain.commutereval.MovingSpeedEnum;
import fi.fullerine.kingofthestreets.domain.commutereval.ParallelLinesEnum;
import fi.fullerine.kingofthestreets.domain.commutereval.SideOfStreetEnum;

privileged aspect Evaluation_Roo_JavaBean {
    
    public String Evaluation.getUserName() {
        return this.userName;
    }
    
    public void Evaluation.setUserName(String userName) {
        this.userName = userName;
    }
    
    public GenderEnum Evaluation.getGender() {
        return this.gender;
    }
    
    public void Evaluation.setGender(GenderEnum gender) {
        this.gender = gender;
    }
    
    public MovingSpeedEnum Evaluation.getMovingSpeed() {
        return this.movingSpeed;
    }
    
    public void Evaluation.setMovingSpeed(MovingSpeedEnum movingSpeed) {
        this.movingSpeed = movingSpeed;
    }
    
    public HelmetUsageEnum Evaluation.getHelmetUsage() {
        return this.helmetUsage;
    }
    
    public void Evaluation.setHelmetUsage(HelmetUsageEnum helmetUsage) {
        this.helmetUsage = helmetUsage;
    }
    
    public ParallelLinesEnum Evaluation.getParallelLines() {
        return this.parallelLines;
    }
    
    public void Evaluation.setParallelLines(ParallelLinesEnum parallelLines) {
        this.parallelLines = parallelLines;
    }
    
    public SideOfStreetEnum Evaluation.getSideOfStreet() {
        return this.sideOfStreet;
    }
    
    public void Evaluation.setSideOfStreet(SideOfStreetEnum sideOfStreet) {
        this.sideOfStreet = sideOfStreet;
    }
    
}
