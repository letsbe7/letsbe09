var path = require('path');

module.exports = {
    entry: './src/main/resources/static/index.tsx',
    output: {
        filename: 'bundle.js',
        path: path.resolve(__dirname, 'target/classes/static')
    },

    devtool: "source-map",

    resolve: {
        extensions: [".ts", ".tsx", ".js", ".json"]
    },

    module: {
        rules: [
            { test: /\.tsx?$/, loader: "awesome-typescript-loader" },
            { enforce: "pre", test: /\.js$/, loader: "source-map-loader" }
        ],

    },
    /* product에는 주석풀 것
    */
    externals: {
        "react": "React",
        "react-dom": "ReactDOM"
    }
};
