package test;

import java.io.File;
import java.io.IOException;

import com.ansj.vec.Learn;
import com.ansj.vec.Word2VEC;

public class Word2VecTest {
       public static void main(String[] args) throws IOException {

    	File sportCorpusFile = new File("corpus/result.txt");
    	//File sportCorpusFile = new File("corpus/msr_training.01.txt");
    	
        //训练        
        Learn lean = new Learn() ;
        lean.learnFile(sportCorpusFile) ;
        lean.saveModel(new File("model/vector.mod")) ;

        //加载测试
        Word2VEC w2v = new Word2VEC() ;
        w2v.loadJavaModel("model/vector.mod");
        System.out.println(w2v.distance("结构"));
        
        System.out.println(w2v.analogy("合作", "经济",  "结构"));
        
        

    }
}
