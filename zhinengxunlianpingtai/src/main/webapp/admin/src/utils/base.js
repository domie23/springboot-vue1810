const base = {
    get() {
        return {
            url : "http://localhost:8080/zhinengxunlianpingtai/",
            name: "zhinengxunlianpingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhinengxunlianpingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智能训练管理平台"
        } 
    }
}
export default base
