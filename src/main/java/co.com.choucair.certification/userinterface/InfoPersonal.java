package co.com.choucair.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InfoPersonal {
    public static final Target NOMBRE = Target.the("Primer nombre")
            .located(By.id("firstName"));

    public static final Target APELLIDO = Target.the("Apellido")
            .located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));

    public static final Target MES_NACIMIENTO = Target.the("Mes de nacimiento")
            .located(By.xpath("<select ng-model=\"registrationData.birthDate.month\" aria-label=\"Mes de nacimiento\" ng-required=\"true\" name=\"birthMonth\" id=\"birthMonth\" ng-change=\"selectMonth()\" ng-options=\"month.id as month.name for month in months | filter: $select.search\" aria-describedby=\"birthDateError\" aria-invalid=\"false\" class=\"ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched\" required=\"required\" style=\"\"><option disabled=\"\" value=\"\" selected=\"selected\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">Mes</font></font></option><option label=\"January\" value=\"number:1\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">enero</font></font></option><option label=\"February\" value=\"number:2\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">febrero</font></font></option><option label=\"March\" value=\"number:3\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">marzo</font></font></option><option label=\"April\" value=\"number:4\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">abril</font></font></option><option label=\"May\" value=\"number:5\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">Mayo</font></font></option><option label=\"June\" value=\"number:6\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">junio</font></font></option><option label=\"July\" value=\"number:7\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">mes de julio</font></font></option><option label=\"August\" value=\"number:8\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">agosto</font></font></option><option label=\"September\" value=\"number:9\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">septiembre</font></font></option><option label=\"October\" value=\"number:10\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">octubre</font></font></option><option label=\"November\" value=\"number:11\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">noviembre</font></font></option><option label=\"December\" value=\"number:12\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">diciembre</font></font></option></select>"));

    public static final Target DIA_NACIMIENTO = Target.the("Dia de nacimiento")
            .located(By.xpath("<select ng-model=\"registrationData.birthDate.day\" aria-label=\"Cumpleaños\" ng-required=\"true\" name=\"birthDay\" id=\"birthDay\" ng-change=\"selectDay()\" ng-options=\"day as day for day in days | filter: $select.search\" aria-describedby=\"birthDateError\" aria-invalid=\"false\" class=\"ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched\" required=\"required\" style=\"\"><option disabled=\"\" value=\"\" selected=\"selected\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">Día</font></font></option><option label=\"1\" value=\"number:1\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1</font></font></option><option label=\"2\" value=\"number:2\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">2</font></font></option><option label=\"3\" value=\"number:3\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">3</font></font></option><option label=\"4\" value=\"number:4\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">4</font></font></option><option label=\"5\" value=\"number:5\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">5</font></font></option><option label=\"6\" value=\"number:6\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">6</font></font></option><option label=\"7\" value=\"number:7\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">7</font></font></option><option label=\"8\" value=\"number:8\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">8</font></font></option><option label=\"9\" value=\"number:9\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">9</font></font></option><option label=\"10\" value=\"number:10\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">10</font></font></option><option label=\"11\" value=\"number:11\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">11</font></font></option><option label=\"12\" value=\"number:12\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">12</font></font></option><option label=\"13\" value=\"number:13\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">13</font></font></option><option label=\"14\" value=\"number:14\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">14</font></font></option><option label=\"15\" value=\"number:15\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">15</font></font></option><option label=\"16\" value=\"number:16\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">dieciséis</font></font></option><option label=\"17\" value=\"number:17\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">17</font></font></option><option label=\"18\" value=\"number:18\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">18</font></font></option><option label=\"19\" value=\"number:19\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">19</font></font></option><option label=\"20\" value=\"number:20\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">20</font></font></option><option label=\"21\" value=\"number:21\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">21</font></font></option><option label=\"22\" value=\"number:22\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">22</font></font></option><option label=\"23\" value=\"number:23\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">23</font></font></option><option label=\"24\" value=\"number:24\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">24</font></font></option><option label=\"25\" value=\"number:25\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">25</font></font></option><option label=\"26\" value=\"number:26\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">26</font></font></option><option label=\"27\" value=\"number:27\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">27</font></font></option><option label=\"28\" value=\"number:28\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">28</font></font></option><option label=\"29\" value=\"number:29\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">29</font></font></option><option label=\"30\" value=\"number:30\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">30</font></font></option><option label=\"31\" value=\"number:31\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">31</font></font></option></select>"));

    public static final Target ANIO_NACIMIENTO = Target.the("Anio de nacimiento")
            .located(By.xpath("<select ng-model=\"registrationData.birthDate.year\" aria-label=\"Año de nacimiento\" ng-required=\"true\" name=\"birthYear\" id=\"birthYear\" ng-change=\"selectYear()\" ng-options=\"year as year for year in years | filter: $select.search\" aria-describedby=\"birthDateError\" aria-invalid=\"false\" class=\"ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched\" required=\"required\" style=\"\"><option disabled=\"\" value=\"\" selected=\"selected\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">Año</font></font></option><option label=\"2004\" value=\"number:2004\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">2004</font></font></option><option label=\"2003\" value=\"number:2003\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">2003</font></font></option><option label=\"2002\" value=\"number:2002\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">2002</font></font></option><option label=\"2001\" value=\"number:2001\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">2001</font></font></option><option label=\"2000\" value=\"number:2000\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">2000</font></font></option><option label=\"1999\" value=\"number:1999\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1999</font></font></option><option label=\"1998\" value=\"number:1998\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1998</font></font></option><option label=\"1997\" value=\"number:1997\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1997</font></font></option><option label=\"1996\" value=\"number:1996\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1996</font></font></option><option label=\"1995\" value=\"number:1995\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1995</font></font></option><option label=\"1994\" value=\"number:1994\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1994</font></font></option><option label=\"1993\" value=\"number:1993\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1993</font></font></option><option label=\"1992\" value=\"number:1992\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1992</font></font></option><option label=\"1991\" value=\"number:1991\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1991</font></font></option><option label=\"1990\" value=\"number:1990\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1990</font></font></option><option label=\"1989\" value=\"number:1989\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1989</font></font></option><option label=\"1988\" value=\"number:1988\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1988</font></font></option><option label=\"1987\" value=\"number:1987\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1987</font></font></option><option label=\"1986\" value=\"number:1986\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1986</font></font></option><option label=\"1985\" value=\"number:1985\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1985</font></font></option><option label=\"1984\" value=\"number:1984\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1984</font></font></option><option label=\"1983\" value=\"number:1983\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1983</font></font></option><option label=\"1982\" value=\"number:1982\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">mil novecientos ochenta y dos</font></font></option><option label=\"1981\" value=\"number:1981\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1981</font></font></option><option label=\"1980\" value=\"number:1980\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1980</font></font></option><option label=\"1979\" value=\"number:1979\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1979</font></font></option><option label=\"1978\" value=\"number:1978\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1978</font></font></option><option label=\"1977\" value=\"number:1977\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1977</font></font></option><option label=\"1976\" value=\"number:1976\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1976</font></font></option><option label=\"1975\" value=\"number:1975\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1975</font></font></option><option label=\"1974\" value=\"number:1974\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1974</font></font></option><option label=\"1973\" value=\"number:1973\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1973</font></font></option><option label=\"1972\" value=\"number:1972\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1972</font></font></option><option label=\"1971\" value=\"number:1971\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1971</font></font></option><option label=\"1970\" value=\"number:1970\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1970</font></font></option><option label=\"1969\" value=\"number:1969\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1969</font></font></option><option label=\"1968\" value=\"number:1968\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1968</font></font></option><option label=\"1967\" value=\"number:1967\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1967</font></font></option><option label=\"1966\" value=\"number:1966\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1966</font></font></option><option label=\"1965\" value=\"number:1965\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1965</font></font></option><option label=\"1964\" value=\"number:1964\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1964</font></font></option><option label=\"1963\" value=\"number:1963\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1963</font></font></option><option label=\"1962\" value=\"number:1962\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1962</font></font></option><option label=\"1961\" value=\"number:1961\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1961</font></font></option><option label=\"1960\" value=\"number:1960\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1960</font></font></option><option label=\"1959\" value=\"number:1959\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1959</font></font></option><option label=\"1958\" value=\"number:1958\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1958</font></font></option><option label=\"1957\" value=\"number:1957\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1957</font></font></option><option label=\"1956\" value=\"number:1956\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1956</font></font></option><option label=\"1955\" value=\"number:1955\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1955</font></font></option><option label=\"1954\" value=\"number:1954\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1954</font></font></option><option label=\"1953\" value=\"number:1953\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1953</font></font></option><option label=\"1952\" value=\"number:1952\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1952</font></font></option><option label=\"1951\" value=\"number:1951\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1951</font></font></option><option label=\"1950\" value=\"number:1950\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1950</font></font></option><option label=\"1949\" value=\"number:1949\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1949</font></font></option><option label=\"1948\" value=\"number:1948\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1948</font></font></option><option label=\"1947\" value=\"number:1947\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1947</font></font></option><option label=\"1946\" value=\"number:1946\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1946</font></font></option><option label=\"1945\" value=\"number:1945\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1945</font></font></option><option label=\"1944\" value=\"number:1944\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1944</font></font></option><option label=\"1943\" value=\"number:1943\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1943</font></font></option><option label=\"1942\" value=\"number:1942\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1942</font></font></option><option label=\"1941\" value=\"number:1941\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1941</font></font></option><option label=\"1940\" value=\"number:1940\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1940</font></font></option><option label=\"1939\" value=\"number:1939\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1939</font></font></option><option label=\"1938\" value=\"number:1938\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1938</font></font></option><option label=\"1937\" value=\"number:1937\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1937</font></font></option><option label=\"1936\" value=\"number:1936\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1936</font></font></option><option label=\"1935\" value=\"number:1935\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1935</font></font></option><option label=\"1934\" value=\"number:1934\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1934</font></font></option><option label=\"1933\" value=\"number:1933\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1933</font></font></option><option label=\"1932\" value=\"number:1932\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1932</font></font></option><option label=\"1931\" value=\"number:1931\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1931</font></font></option><option label=\"1930\" value=\"number:1930\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1930</font></font></option><option label=\"1929\" value=\"number:1929\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1929</font></font></option><option label=\"1928\" value=\"number:1928\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1928</font></font></option><option label=\"1927\" value=\"number:1927\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1927</font></font></option><option label=\"1926\" value=\"number:1926\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1926</font></font></option><option label=\"1925\" value=\"number:1925\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1925</font></font></option><option label=\"1924\" value=\"number:1924\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1924</font></font></option><option label=\"1923\" value=\"number:1923\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1923</font></font></option><option label=\"1922\" value=\"number:1922\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1922</font></font></option><option label=\"1921\" value=\"number:1921\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1921</font></font></option><option label=\"1920\" value=\"number:1920\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1920</font></font></option><option label=\"1919\" value=\"number:1919\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1919</font></font></option><option label=\"1918\" value=\"number:1918\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1918</font></font></option><option label=\"1917\" value=\"number:1917\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1917</font></font></option><option label=\"1916\" value=\"number:1916\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1916</font></font></option><option label=\"1915\" value=\"number:1915\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1915</font></font></option><option label=\"1914\" value=\"number:1914\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1914</font></font></option><option label=\"1913\" value=\"number:1913\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1913</font></font></option><option label=\"1912\" value=\"number:1912\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1912</font></font></option><option label=\"1911\" value=\"number:1911\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1911</font></font></option><option label=\"1910\" value=\"number:1910\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1910</font></font></option><option label=\"1909\" value=\"number:1909\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1909</font></font></option><option label=\"1908\" value=\"number:1908\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1908</font></font></option><option label=\"1907\" value=\"number:1907\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1907</font></font></option><option label=\"1906\" value=\"number:1906\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1906</font></font></option><option label=\"1905\" value=\"number:1905\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1905</font></font></option><option label=\"1904\" value=\"number:1904\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1904</font></font></option><option label=\"1903\" value=\"number:1903\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1903</font></font></option><option label=\"1902\" value=\"number:1902\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1902</font></font></option><option label=\"1901\" value=\"number:1901\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1901</font></font></option><option label=\"1900\" value=\"number:1900\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">mil novecientos</font></font></option><option label=\"1899\" value=\"number:1899\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1899</font></font></option><option label=\"1898\" value=\"number:1898\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1898</font></font></option><option label=\"1897\" value=\"number:1897\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1897</font></font></option><option label=\"1896\" value=\"number:1896\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1896</font></font></option><option label=\"1895\" value=\"number:1895\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1895</font></font></option><option label=\"1894\" value=\"number:1894\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1894</font></font></option><option label=\"1893\" value=\"number:1893\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1893</font></font></option><option label=\"1892\" value=\"number:1892\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1892</font></font></option><option label=\"1891\" value=\"number:1891\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1891</font></font></option><option label=\"1890\" value=\"number:1890\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1890</font></font></option><option label=\"1889\" value=\"number:1889\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1889</font></font></option><option label=\"1888\" value=\"number:1888\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1888</font></font></option><option label=\"1887\" value=\"number:1887\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1887</font></font></option><option label=\"1886\" value=\"number:1886\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1886</font></font></option><option label=\"1885\" value=\"number:1885\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1885</font></font></option><option label=\"1884\" value=\"number:1884\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1884</font></font></option><option label=\"1883\" value=\"number:1883\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1883</font></font></option><option label=\"1882\" value=\"number:1882\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1882</font></font></option><option label=\"1881\" value=\"number:1881\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1881</font></font></option><option label=\"1880\" value=\"number:1880\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1880</font></font></option><option label=\"1879\" value=\"number:1879\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1879</font></font></option><option label=\"1878\" value=\"number:1878\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1878</font></font></option><option label=\"1877\" value=\"number:1877\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1877</font></font></option><option label=\"1876\" value=\"number:1876\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1876</font></font></option><option label=\"1875\" value=\"number:1875\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1875</font></font></option><option label=\"1874\" value=\"number:1874\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1874</font></font></option><option label=\"1873\" value=\"number:1873\"><font style=\"vertical-align: inherit;\"><font style=\"vertical-align: inherit;\">1873</font></font></option></select>"));

    public static final Target BOTON_DIRECCION = Target.the("Bonton que nos lleva a la seccion de direccion")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}