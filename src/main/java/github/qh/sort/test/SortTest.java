package github.qh.sort.test;

import github.qh.sort.domain.MaoPao;
import github.qh.sort.domain.entity.SortList;
import org.junit.Test;

import java.util.Arrays;


/**
 * @author a58
 */
public class SortTest {

    @Test
    public void testMaoPao(){

        var sort = new MaoPao();

        sort.sort(SortList.ARR);

        Arrays.stream(SortList.ARR).forEach(System.out::print);

        //对冒泡排序优化的一种方法，当然还有一些其他优化的方法，就不深入研究了
        sort.optimized(SortList.ARR);
    }
}
