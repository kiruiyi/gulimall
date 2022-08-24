import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


public class Generator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.93.128:3306/gulimall_wms";
        String className="com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "260033";

      //      TODO    配置数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl(url);
        dataSourceConfig.setDriverName(className);
        dataSourceConfig.setUsername(username);
        dataSourceConfig.setPassword(password);

        AutoGenerator autoGenerator = new AutoGenerator();

//     TODO  全局设置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/gulimall-ware/src/main/java");
        globalConfig.setOpen(false);
        globalConfig.setAuthor("moe");
        globalConfig.setFileOverride(true);     //覆盖原文件？？
        globalConfig.setMapperName("%sDao");
        globalConfig.setIdType(IdType.ASSIGN_ID);     //雪花算法 ID 生成



//     TODO    包名相关配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.gulimall");
        packageConfig.setEntity("domin");
        packageConfig.setMapper("dao");




//        TODO   策略设置

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setTablePrefix("wms_");
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);




        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setPackageInfo(packageConfig);
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.execute();
    }
}
