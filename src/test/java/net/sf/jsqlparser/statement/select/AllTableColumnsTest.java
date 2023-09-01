package net.sf.jsqlparser.statement.select;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.test.TestUtils;
import org.junit.jupiter.api.Test;


class AllTableColumnsTest {
    @Test
    void testBigQuerySyntax() throws JSQLParserException {
        String sqlStr =
                "SELECT orders.* EXCEPT (order_id) REPLACE (\"widget\" AS item_name), \"more\" as more_fields\n"
                        + "FROM orders";
        TestUtils.assertSqlCanBeParsedAndDeparsed(sqlStr, true);
    }
}