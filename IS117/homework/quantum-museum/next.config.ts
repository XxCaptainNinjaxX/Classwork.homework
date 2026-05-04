import type { NextConfig } from "next";

const nextConfig: NextConfig = {
    output: "export",
    basePath: "/classwork-homework",
    trailingSlash: true,
    images: {
        unoptimized: true,
    },
};

export default nextConfig;
