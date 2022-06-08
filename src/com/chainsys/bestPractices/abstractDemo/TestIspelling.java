package com.chainsys.bestPractices.abstractDemo;

public class TestIspelling {

	public static void main(String[] args) {
		EnglishLanguage el=new EnglishLanguage();
		el.checkGrammar("a");
		el.wordCount("a b cd");
		el.spellCheck("a");
		
	}

}
