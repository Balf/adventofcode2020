import com.google.common.base.Stopwatch;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

class Day1 {

    private static String input = "1757\n" +
            "1890\n" +
            "1750\n" +
            "1440\n" +
            "1822\n" +
            "1957\n" +
            "2005\n" +
            "1979\n" +
            "1405\n" +
            "2003\n" +
            "1997\n" +
            "1741\n" +
            "1494\n" +
            "1780\n" +
            "1774\n" +
            "1813\n" +
            "447\n" +
            "1429\n" +
            "1990\n" +
            "1767\n" +
            "1969\n" +
            "1787\n" +
            "1944\n" +
            "1863\n" +
            "1778\n" +
            "2004\n" +
            "1991\n" +
            "1754\n" +
            "1748\n" +
            "1756\n" +
            "1977\n" +
            "611\n" +
            "1934\n" +
            "1818\n" +
            "1924\n" +
            "528\n" +
            "1753\n" +
            "1867\n" +
            "1865\n" +
            "1799\n" +
            "1743\n" +
            "1955\n" +
            "1993\n" +
            "1972\n" +
            "1987\n" +
            "1960\n" +
            "1817\n" +
            "1837\n" +
            "1900\n" +
            "1839\n" +
            "1946\n" +
            "1786\n" +
            "1857\n" +
            "1840\n" +
            "1985\n" +
            "1850\n" +
            "1801\n" +
            "1926\n" +
            "1523\n" +
            "1886\n" +
            "1492\n" +
            "1737\n" +
            "1909\n" +
            "1766\n" +
            "1986\n" +
            "1773\n" +
            "1749\n" +
            "1781\n" +
            "1760\n" +
            "1849\n" +
            "1833\n" +
            "1854\n" +
            "1814\n" +
            "1820\n" +
            "2000\n" +
            "1834\n" +
            "1851\n" +
            "1779\n" +
            "1825\n" +
            "1885\n" +
            "1882\n" +
            "1912\n" +
            "962\n" +
            "1988\n" +
            "302\n" +
            "1965\n" +
            "1751\n" +
            "1764\n" +
            "1844\n" +
            "1949\n" +
            "1984\n" +
            "1933\n" +
            "958\n" +
            "1746\n" +
            "1999\n" +
            "1914\n" +
            "1989\n" +
            "1879\n" +
            "1954\n" +
            "1827\n" +
            "1816\n" +
            "1918\n" +
            "633\n" +
            "1797\n" +
            "1811\n" +
            "1936\n" +
            "1961\n" +
            "1937\n" +
            "1829\n" +
            "1788\n" +
            "1772\n" +
            "1505\n" +
            "1905\n" +
            "1304\n" +
            "1404\n" +
            "1868\n" +
            "1978\n" +
            "1872\n" +
            "2006\n" +
            "1256\n" +
            "1883\n" +
            "1966\n" +
            "1931\n" +
            "1796\n" +
            "1793\n" +
            "714\n" +
            "1904\n" +
            "1841\n" +
            "1824\n" +
            "1962\n" +
            "1739\n" +
            "1897\n" +
            "1906\n" +
            "1735\n" +
            "1876\n" +
            "873\n" +
            "1959\n" +
            "1963\n" +
            "1917\n" +
            "1804\n" +
            "1789\n" +
            "1782\n" +
            "1848\n" +
            "1828\n" +
            "1826\n" +
            "1929\n" +
            "1525\n" +
            "1862\n" +
            "1952\n" +
            "1878\n" +
            "1775\n" +
            "1776\n" +
            "1430\n" +
            "1943\n" +
            "1938\n" +
            "1941\n" +
            "1594\n" +
            "1928\n" +
            "1856\n" +
            "1903\n" +
            "1871\n" +
            "1836\n" +
            "1847\n" +
            "1956\n" +
            "1915\n" +
            "1870\n" +
            "1875\n" +
            "1892\n" +
            "276\n" +
            "1896\n" +
            "1945\n" +
            "1821\n" +
            "1947\n" +
            "1898\n" +
            "1802\n" +
            "1853\n" +
            "1895\n" +
            "1790\n" +
            "1819\n" +
            "1980\n" +
            "1832\n" +
            "1673\n" +
            "1964\n" +
            "1800\n" +
            "1971\n" +
            "1842\n" +
            "2002\n" +
            "1921\n" +
            "1940\n" +
            "1845\n" +
            "1527\n" +
            "1428\n" +
            "1932\n" +
            "1893\n" +
            "1908\n" +
            "1889\n" +
            "1974\n" +
            "1981\n" +
            "1791\n" +
            "1975\n";

    //Part 1
    public static void main(String[] args) {

        Stopwatch stopwatch = Stopwatch.createStarted();

        part1();

        System.out.println(stopwatch.toString());

        part2();

        System.out.println(stopwatch.toString());

    }

    private static void part1() {

        String[] inputNumbers = input.split("\\n");
        Set<Integer> map = Arrays.stream(inputNumbers).map(Integer::parseInt).collect(Collectors.toSet());

        for (Integer inputNumber : map) {
            int difference = 2020 - inputNumber;
            if (map.contains(difference)) {
                System.out.println(difference * inputNumber);
                break;
            }
        }
    }

    private static void part2() {
        System.out.println("--- Part 2 ---");
        String[] inputNumbers = input.split("\\n");
        Set<Integer> set = Arrays.stream(inputNumbers).map(Integer::parseInt).collect(Collectors.toSet());

        outer:
        for (Integer inputNumber : set) {
            int difference = 2020 - inputNumber;

            //System.out.println(difference);
            for (Integer inputNumber2 : set) {
                int difference2 = difference - inputNumber2;
                //System.out.println(difference2);
                if (set.contains(difference2) && (inputNumber + difference2 + inputNumber2) == 2020) {
                    System.out.println(difference2 * inputNumber2 * inputNumber);
                    break outer;
                }
            }
            //break;
        }
    }
}
