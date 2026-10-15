package com.kodewala.oops;

import java.util.Arrays;

public class Team {
      private int [] scores;
      public Team (int [] scores) {
    	  this.scores = Arrays.copyOf(scores,scores.length);
      }
      public int[] getScores() {
    	  return Arrays.copyOf(scores,scores.length);
      }
}
