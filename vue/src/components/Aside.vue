<template>
    <div>
        <el-menu
                style="width: 200px; min-height: calc(100vh-50px);"
                default-active="2"
                router
                class="el-menu-vertical-demo"

        >

            <el-sub-menu index="1">
                <template #title>
                    <el-icon><location /></el-icon>
                    <span>单项攻击</span>
                </template>

                <el-sub-menu index="DosAttack">
                    <template #title>Dos攻击</template>
                    <el-menu-item index="DDos">DDos</el-menu-item>
                    <el-menu-item index="Hulk">Hulk</el-menu-item>
                    <el-menu-item index="GoldenEye">GoldenEye</el-menu-item>
                    <el-menu-item index="slowloris">slowloris</el-menu-item>
                    <el-menu-item index="slowhttptest">slowhttptest</el-menu-item>
                </el-sub-menu>

                <el-sub-menu index="Bruteforce攻击">
                    <template #title>Bruteforce攻击</template>
                    <el-menu-item index="Patator">Patator</el-menu-item>
                    <el-menu-item index="Hydra">Hydra</el-menu-item>

                </el-sub-menu>

                <el-sub-menu index="ScanPort攻击">
                    <template #title>ScanPort攻击</template>
                    <el-menu-item index="ScanPort攻击">nmap</el-menu-item>
                    <el-menu-item index="ScanPort攻击">hping3</el-menu-item>

                </el-sub-menu>
                <el-sub-menu index="Web Attack">
                    <template #title>Web Attack</template>
                    <el-menu-item index="Web Attack">BF</el-menu-item>
                    <el-menu-item index="Web Attack">SQL injection</el-menu-item>

                </el-sub-menu>


            </el-sub-menu>


            <el-sub-menu index="2">
                <template #title>
                    <el-icon><location /></el-icon>
                    <span>混合攻击</span>
                </template>


                <el-menu-item index="1-3">Dos 攻击</el-menu-item>
                <el-menu-item index="1-3">Brute force攻击</el-menu-item>
                <el-menu-item index="1-3">Scan Port攻击</el-menu-item>
                <el-menu-item index="1-3">Web Attack</el-menu-item>

            </el-sub-menu>



        </el-menu>

    </div>
</template>

<script>
    export default {
        name: "Aside"
    }
</script>

<style scoped>

</style>