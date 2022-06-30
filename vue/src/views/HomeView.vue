<template>
  <div style="padding: 10px" >
    <div style="margin:10px 0">
      <el-button type="primary">新增</el-button>
      <el-button type="primary">导入</el-button>
      <el-button type="primary">导出</el-button>
    </div>

    <div style="margin:10px 0">
      <el-input v-model="search" placeholder="Please input" style="width: 20%"/>
      <el-button type="primary" style="margin-left: 5px">查询</el-button>
    </div>


    <el-table :data="tableData" stripe style="width: 100%">
      <el-table-column prop="date" label="日期" />
      <el-table-column prop="name" label="姓名" />
      <el-table-column prop="address" label="地址" />
    </el-table>

  </div>
</template>

<script>

import request from "../utils/request";

  export default {
    name: 'HomeView',
    components: {

    },
    data(){
      return{

        search:'2',
        tableData:[]
      }
    },
    methods:{
      hulk() {
        request.get("http://localhost:9090").then(res => {
          console.log(res)
        })
      }

    }


  }
</script>
