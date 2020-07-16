package com.yutianhao.yutianhaouserprovider;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import javax.sql.DataSource;
/**
 * @author thyu
 * @title: MybatisPlusGenerator
 * @projectName yutianhao-eureka-user
 * @description: TODO
 * @date 2020/7/16 23:47
 */
public class MybatisPlusGenerator {
    public static void main(String[] args) {
        //1.自动生成代码的对象
        AutoGenerator mp = new AutoGenerator();

        //1.1 全局设置
        GlobalConfig gc = new GlobalConfig();
        //设置作者
        gc.setAuthor("thyu");
        //设置输出的路径
        gc.setOutputDir(System.getProperty("user.dir")+"/yutianhao-user-provider/src/main/java");
        //设置是否打开
        gc.setOpen(false);
        //设置生成返回的map结果集
        gc.setBaseResultMap(true);
        //设置生成返回的列
        gc.setBaseColumnList(true);
        mp.setGlobalConfig(gc);

        //1.2数据源的设置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/1712javad?characterEncoding=utf8&serverTimezone=GMT%2B8");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mp.setDataSource(dsc);

        //1.3包名设置
        PackageConfig pc = new PackageConfig();
        //配置xml文件的名称
        pc.setXml("mapper.mappers");
        //系统当前包名
        pc.setParent(MybatisPlusGenerator.class.getPackage().getName());
        mp.setPackageInfo(pc);

        //1.4生成策略
        StrategyConfig sc = new StrategyConfig();
        //包括哪些表
        sc.setInclude("user","dept");
        //设置表名前缀
        //sc.setTablePrefix("t_");
        //开启lonbok模式
        sc.setEntityLombokModel(true);
        //排除哪些表
        //sc.setExclude("");
        sc.setNaming(NamingStrategy.underline_to_camel);
        sc.setColumnNaming(NamingStrategy.underline_to_camel);
        mp.setStrategy(sc);

        //自动生成
        mp.execute();
    }
}
