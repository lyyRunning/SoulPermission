# SoulPermission
这是一个简单的 SoulPermission 权限封装

Hex.pm
Android权限适配的更优解决方案：

  - 解耦Activity和Fragment、不再需要Context、不再需要onPermissionResult
    内部涵盖版本判断，一行代码解决权限相关操作，无需在调用业务方写权限适配代码，继而实现真正调用时请求的“真运行时权限”
    接入成本低，零入侵，仅需要在gradle配置一行代码
    支持多项权限同时请求
    支持特殊权限(Notification[通知]、SystemAlert[应用悬浮窗]、未知来源应用安装)的检查与请求
    支持系统权限页面跳转
    支持debug模式
    
 初始化：
 
dependencies {
    implementation 'com.qw:soulpermission:1.1.8'
}


基本用法：

一句话版本完成自动判断、权限检查、请求、后续操作：

 SoulPermission.getInstance().checkAndRequestPermission(Manifest.permission.ACCESS_FINE_LOCATION,
                //if you want do noting or no need all the callbacks you may use SimplePermissionAdapter instead
                new CheckRequestPermissionListener() {
                    @Override
                    public void onPermissionOk(Permission permission) {
                        Toast.makeText(ApiGuideActivity.this, permission.toString() +
                                "\n is ok , you can do your operations", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onPermissionDenied(Permission permission) {
                        Toast.makeText(ApiGuideActivity.this, permission.toString() +
                                " \n is refused you can not do next things", Toast.LENGTH_SHORT).show();
                    }
                });
                
                
- 也可以一次请求多项权限     

SoulPermission.getInstance().checkAndRequestPermissions(
                Permissions.build(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE),
                //if you want do noting or no need all the callbacks you may use SimplePermissionsAdapter instead
                new CheckRequestPermissionsListener() {
                    @Override
                    public void onAllPermissionOk(Permission[] allPermissions) {
                        Toast.makeText(ApiGuideActivity.this, allPermissions.length + "permissions is ok" +
                                " \n  you can do your operations", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onPermissionDenied(Permission[] refusedPermissions) {
                        Toast.makeText(ApiGuideActivity.this, refusedPermissions[0].toString() +
                                " \n is refused you can not do next things", Toast.LENGTH_SHORT).show();
                    }
                });
                
                
                
                
