module.exports = {
    entry: "./src/app.ts",
    output: {
        path: __dirname + "/dist",
        publicPath: "/",
        filename: "app.js"
    },
    resolve: {
        extensions: [".ts", ".js"]
    },

    devServer: {
        contentBase: __dirname + '/dist',
        publicPath: "/",
        progress: true,
        port: 3000,
        open: true,
        inline: true,
    },

    module: {
        loaders: [
            {
                test: /\.ts?$/,
                loader: "ts-loader"
            },
            {
                test: /\.(html)$/,
                loader: 'html-loader'
            }
        ]
    }
};
