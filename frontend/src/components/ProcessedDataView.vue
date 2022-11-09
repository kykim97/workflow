<template>

    <v-data-table
        :headers="headers"
        :items="processedData"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ProcessedDataView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "dataType", value: "dataType" },
            ],
            processedData : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/processedData'))

            temp.data._embedded.processedData.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.processedData = temp.data._embedded.processedData;
        },
        methods: {
        }
    }
</script>

