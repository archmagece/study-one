package book1;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

/**
 * @author archmagece
 * @since 2017-02-11 11
 */
@Slf4j
public class p148 {
	public static void main(String[] args){

	}

	void pick(int n, LinkedList<Integer> picked, int toPick){
		if(toPick == 0) {
			System.out.println(picked);
			return;
		}
		int smallest  = picked.isEmpty()?0:picked.pollLast()+1;
		for(int next = smallest; next < n ; ++next){
			picked.push(next);
			pick(n, picked, toPick-1);
			picked.pop();
		}
	}


}
